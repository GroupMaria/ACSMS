package com.acsms.org.vo;

import java.util.ArrayList;
import java.util.List;

public class OrderClosingVO {

	private String orderid;
	private int StatusId;
	private String message;
	private List<String> status=new ArrayList<String>();

	public OrderClosingVO() {
		super();

	}

	// Constructor
	public OrderClosingVO(String orderid, int StatusId)

	{
		super();
		this.orderid = orderid;
		this.StatusId = StatusId;

	}

	public String getorderid() {
		return orderid;
	}

	public void setorderId(String orderid) {
		this.orderid = orderid;
	}

	public int getStatusId() {
		return StatusId;
	}

	public void setstatusid(int status) {
		this.StatusId = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}

}
