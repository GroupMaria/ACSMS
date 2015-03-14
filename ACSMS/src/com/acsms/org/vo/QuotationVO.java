package com.acsms.org.vo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Adam
 *
 */
public class QuotationVO {

	/**
	 * Default Constructor
	 * 
	 */
	public QuotationVO() {

	}
	
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
	private String productSellingPrice;
	private String productSellingPriceQuote;
	private String sellingPriceQuotedBy;
	
	
	private String fuelAdjustments;
	private String containerStuffing;
	private String othersAirFreight;
	

	private String inlandFreight;
	private String inlandFreightQuote;
	private String inlandFreightQuotedBy;
	private String inlandUnloading;
	private String inland_Pier_deliver;
	private String inland_terminal_handle;
	private String inland_other;

	
	private String insurance_all_risk;
	private String insurance_srcc;
	private String insurance_warrisk;
	private String inlandFreightothers;
	private String InternationalFreightQuote1;
	private String InternationalFreightQuotedBy;
	private String ForwardingFees;
	private String ConsularPrice;
	private String InspectionFees;
	private String BankingCharges;
	private String OtherCharges;
	private String OtherCharge1Name;
	private String OtherCharge1;
	private String OtherCharge2Name;
	private String OtherCharge2;
	private String TotalExportquotation;

	DateFormat format = new SimpleDateFormat("YYYY-MM-dd");

	public String getDatePrepared() throws ParseException {

		Date date =format.parse(DatePrepared);
		return format.format(date);
	}

	public void setDatePrepared(String datePrepared) {
		DatePrepared = datePrepared;
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

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
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

	public String getProductSellingPrice() {
		return productSellingPrice;
	}

	public void setProductSellingPrice(String productSellingPrice) {
		this.productSellingPrice = productSellingPrice;
	}

	public String getProductSellingPriceQuote() {
		return productSellingPriceQuote;
	}

	public void setProductSellingPriceQuote(String productSellingPriceQuote) {
		this.productSellingPriceQuote = productSellingPriceQuote;
	}

	public String getSellingPriceQuotedBy() {
		return sellingPriceQuotedBy;
	}

	public void setSellingPriceQuotedBy(String sellingPriceQuotedBy) {
		this.sellingPriceQuotedBy = sellingPriceQuotedBy;
	}

	public String getInlandFreight() {
		return inlandFreight;
	}

	public void setInlandFreight(String inlandFreight) {
		this.inlandFreight = inlandFreight;
	}

	public String getInlandFreightQuote() {
		return inlandFreightQuote;
	}

	public void setInlandFreightQuote(String inlandFreightQuote) {
		this.inlandFreightQuote = inlandFreightQuote;
	}

	public String getInlandFreightQuotedBy() {
		return inlandFreightQuotedBy;
	}

	public void setInlandFreightQuotedBy(String inlandFreightQuotedBy) {
		this.inlandFreightQuotedBy = inlandFreightQuotedBy;
	}

	public String getInlandFreightothers() {
		return inlandFreightothers;
	}

	public void setInlandFreightothers(String inlandFreightothers) {
		this.inlandFreightothers = inlandFreightothers;
	}

	public String getInternationalFreightQuote1() {
		return InternationalFreightQuote1;
	}

	public void setInternationalFreightQuote1(String internationalFreightQuote1) {
		InternationalFreightQuote1 = internationalFreightQuote1;
	}

	public String getInternationalFreightQuotedBy() {
		return InternationalFreightQuotedBy;
	}

	public void setInternationalFreightQuotedBy(
			String internationalFreightQuotedBy) {
		InternationalFreightQuotedBy = internationalFreightQuotedBy;
	}

	public String getForwardingFees() {
		return ForwardingFees;
	}

	public void setForwardingFees(String forwardingFees) {
		ForwardingFees = forwardingFees;
	}

	public String getConsularPrice() {
		return ConsularPrice;
	}

	public void setConsularPrice(String consularPrice) {
		ConsularPrice = consularPrice;
	}

	public String getInspectionFees() {
		return InspectionFees;
	}

	public void setInspectionFees(String inspectionFees) {
		InspectionFees = inspectionFees;
	}

	public String getBankingCharges() {
		return BankingCharges;
	}

	public void setBankingCharges(String bankingCharges) {
		BankingCharges = bankingCharges;
	}

	public String getOtherCharges() {
		return OtherCharges;
	}

	public void setOtherCharges(String otherCharges) {
		OtherCharges = otherCharges;
	}

	public String getOtherCharge1Name() {
		return OtherCharge1Name;
	}

	public void setOtherCharge1Name(String otherCharge1Name) {
		OtherCharge1Name = otherCharge1Name;
	}

	public String getOtherCharge1() {
		return OtherCharge1;
	}

	public void setOtherCharge1(String otherCharge1) {
		OtherCharge1 = otherCharge1;
	}

	public String getOtherCharge2Name() {
		return OtherCharge2Name;
	}

	public void setOtherCharge2Name(String otherCharge2Name) {
		OtherCharge2Name = otherCharge2Name;
	}

	public String getOtherCharge2() {
		return OtherCharge2;
	}

	public void setOtherCharge2(String otherCharge2) {
		OtherCharge2 = otherCharge2;
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

	public void setInlandUnloading(String inlandUnloading) {
		this.inlandUnloading = inlandUnloading;
	}

	public void setInland_Pier_deliver(String inland_Pier_deliver) {
		this.inland_Pier_deliver = inland_Pier_deliver;
	}

	public void setInland_terminal_handle(String inland_terminal_handle) {
		this.inland_terminal_handle = inland_terminal_handle;
	}

	public void setInland_other(String inland_other) {
		this.inland_other = inland_other;
	}

	public String getInlandUnloading() {
		return inlandUnloading;
	}

	public String getInland_Pier_deliver() {
		return inland_Pier_deliver;
	}

	public String getInland_terminal_handle() {
		return inland_terminal_handle;
	}

	public String getInland_other() {
		return inland_other;
	}

	public String getInsurance_all_risk() {
		return insurance_all_risk;
	}

	public void setInsurance_all_risk(String insurance_all_risk) {
		this.insurance_all_risk = insurance_all_risk;
	}

	public String getInsurance_srcc() {
		return insurance_srcc;
	}

	public void setInsurance_srcc(String insurance_srcc) {
		this.insurance_srcc = insurance_srcc;
	}

	public String getInsurance_warrisk() {
		return insurance_warrisk;
	}

	public void setInsurance_warrisk(String insurance_warrisk) {
		this.insurance_warrisk = insurance_warrisk;
	}
	

	public String getFuelAdjustments() {
		return fuelAdjustments;
	}

	public void setFuelAdjustments(String fuelAdjustments) {
		this.fuelAdjustments = fuelAdjustments;
	}

	public String getContainerStuffing() {
		return containerStuffing;
	}

	public void setContainerStuffing(String containerStuffing) {
		this.containerStuffing = containerStuffing;
	}

	public String getOthersAirFreight() {
		return othersAirFreight;
	}

	public void setOthersAirFreight(String othersAirFreight) {
		this.othersAirFreight = othersAirFreight;
	}

}
