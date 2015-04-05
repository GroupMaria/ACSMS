package com.acsms.org.ba;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsms.org.dao.DBUtil;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;


public class ReportingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReportingServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ref_no=request.getParameter("ref_no");
		String awbid=request.getParameter("awb_no");
		String clearanceId=request.getParameter("clearance_no");
		Map<String, Object> pararmeters = new HashMap<String, Object>();
		pararmeters.put("ref_no", ref_no);
		pararmeters.put("awb_no", awbid);
		pararmeters.put("clearance_no", clearanceId);
		
		ServletContext ctx = request.getServletContext();
		String reportTemplateFilePath = ctx.getRealPath("Myreport.jrxml");
		ByteArrayOutputStream reportStream = getReportOutputStream(reportTemplateFilePath,pararmeters);
		response.setContentLength(reportStream.size());
		response.setContentType("application/pdf");
		response.setHeader("Content-disposition", "inline; filename=report.pdf");
		response.setHeader("Cache-Control", "max-age=30");
		ServletOutputStream servletOutputStream = response.getOutputStream();
		reportStream.writeTo(servletOutputStream);
		servletOutputStream.flush();
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	private ByteArrayOutputStream getReportOutputStream(String reportTemplateFilePath, Map reportParameters) {
		JasperReport jasperReport;
		ByteArrayOutputStream outputstream = new ByteArrayOutputStream();
		JasperPrint jasperPrint;
		try {
			jasperReport = JasperCompileManager.compileReport(reportTemplateFilePath);
			jasperPrint = JasperFillManager.fillReport(jasperReport, reportParameters, DBUtil.getConnection());
			JRExporter exporter = new JRPdfExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, outputstream);
			exporter.exportReport();
		} catch (JRException e) {
			e.printStackTrace();
		}
		return outputstream;
	}

}
