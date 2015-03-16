package com.acsms.org.dao;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
 
public class ConvertHTMLToPDF {
 

 public void createPDF (String pdfFilename, String File_To_Convert){
 
  //path for the PDF file to be generated
  String path = "C:\\" + pdfFilename;
  PdfWriter pdfWriter = null;
   
  //create a new document
  Document document = new Document();
   
  try {
 
   //get Instance of the PDFWriter
   pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(path));
    
   //document header attributes
   document.addAuthor("betterThanZero");
   document.addCreationDate();
   document.addProducer();
   document.addCreator("MySampleCode.com");
   document.addTitle("Demo for iText XMLWorker");
   document.setPageSize(PageSize.LETTER);
 
   //open document
   document.open();
    
   //To convert a HTML file from the filesystem
   FileInputStream fis = new FileInputStream(File_To_Convert);
 
   //URL for HTML page
  /* URL myWebPage = new URL("http://demo.mysamplecode.com/");
   InputStreamReader fis = new InputStreamReader(myWebPage.openStream());
 */
   //get the XMLWorkerHelper Instance
   XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
   //convert to PDF
   worker.parseXHtml(pdfWriter, document, fis);
    
   //close the document
   document.close();
   //close the writer
   pdfWriter.close();
 
  }   
 
  catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  } catch (DocumentException e) {
   e.printStackTrace();
  }       
 
 }
 
}