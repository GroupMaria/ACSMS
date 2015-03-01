package com.acsms.org.vo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderDetailsVO {
	private String refNumber;
	private String DatePrepared;
	private String product;
	private String customer;
	private String shippingFrom;
	private String destinationCountry;
	private String termsOfPayment;
	private String modeofTransport;
	private String estimatedShipDate;
	private String packedDimensions;
	private String ShippingTo;
	private String packedWeight;
	private String packedCube;
	
	private String TotalExportquotation;

	DateFormat format = new SimpleDateFormat("YYYY-MM-dd");

	public String getDatePrepared() throws ParseException {

		Date date =format.parse(DatePrepared);
		return format.format(date);
	}

	public void setDatePrepared(String datePrepared) {
		DatePrepared = datePrepared;
	}

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getShippingFrom() {
		return shippingFrom;
	}

	public void setShippingFrom(String shippingFrom) {
		this.shippingFrom = shippingFrom;
	}

	public String getDestinationCountry() {
		return destinationCountry;
	}

	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}

	public String getTermsOfPayment() {
		return termsOfPayment;
	}

	public void setTermsOfPayment(String termsOfPayment) {
		this.termsOfPayment = termsOfPayment;
	}

	public String getModeofTransport() {
		return modeofTransport;
	}

	public void setModeofTransport(String modeofTransport) {
		this.modeofTransport = modeofTransport;
	}

	public String getEstimatedShipDate() {
		return estimatedShipDate;
	}

	public void setEstimatedShipDate(String estimatedShipDate) {
		this.estimatedShipDate = estimatedShipDate;
	}

	public String getPackedDimensions() {
		return packedDimensions;
	}

	public void setPackedDimensions(String packedDimensions) {
		this.packedDimensions = packedDimensions;
	}

	public String getShippingTo() {
		return ShippingTo;
	}

	public void setShippingTo(String shippingTo) {
		ShippingTo = shippingTo;
	}

	public String getPackedWeight() {
		return packedWeight;
	}

	public void setPackedWeight(String packedWeight) {
		this.packedWeight = packedWeight;
	}

	public String getPackedCube() {
		return packedCube;
	}

	public void setPackedCube(String packedCube) {
		this.packedCube = packedCube;
	}

	public String getTotalExportquotation() {
		return TotalExportquotation;
	}

	public void setTotalExportquotation(String totalExportquotation) {
		TotalExportquotation = totalExportquotation;
	}

	public DateFormat getFormat() {
		return format;
	}

	public void setFormat(DateFormat format) {
		this.format = format;
	}


}
