package com.acsms.org.vo;

/**
 * @author Philip
 *
 */
public class OrderVO {
	private String orderid; 
public OrderVO(String orderid)
{
this.orderid = orderid;	
}
	//Order Table Values
public String getOrderid() {
	return orderid;
}
public void setOrderid(String orderid) {
	this.orderid = orderid;
}

}
