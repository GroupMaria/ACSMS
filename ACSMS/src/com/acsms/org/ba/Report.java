package com.acsms.org.ba;

public class Report {
	
	private String refNo;

	private String customerName;
	private String productName;
	private String packWeight;
	private String date;
	private String shipFrom;
	private String shipTo;
	private String destCountry;
	private Double price_total_sale;
	private Double price_special_packing;
	private Double price_inland_freight;
	private String awbNo;
	private String clearanceNo;
	private String quotationId;
	
	
	public String getQuotationId() {
		return quotationId;
	}
	public void setQuotationId(String quotationId) {
		this.quotationId = quotationId;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPackWeight() {
		return packWeight;
	}
	public void setPackWeight(String packWeight) {
		this.packWeight = packWeight;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getShipFrom() {
		return shipFrom;
	}
	public void setShipFrom(String shipFrom) {
		this.shipFrom = shipFrom;
	}
	public String getShipTo() {
		return shipTo;
	}
	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}
	public String getDestCountry() {
		return destCountry;
	}
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
	public Double getPrice_total_sale() {
		return price_total_sale;
	}
	public void setPrice_total_sale(Double price_total_sale) {
		this.price_total_sale = price_total_sale;
	}
	public Double getPrice_special_packing() {
		return price_special_packing;
	}
	public void setPrice_special_packing(Double price_special_packing) {
		this.price_special_packing = price_special_packing;
	}
	public Double getPrice_inland_freight() {
		return price_inland_freight;
	}
	public void setPrice_inland_freight(Double price_inland_freight) {
		this.price_inland_freight = price_inland_freight;
	}
	public String getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	public String getClearanceNo() {
		return clearanceNo;
	}
	public void setClearanceNo(String clearanceNo) {
		this.clearanceNo = clearanceNo;
	}
	
	
}
