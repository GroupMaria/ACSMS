package com.acsms.org.vo;

public class OrderClosingVO {
		
		private String orderid ;
		private String StatusId;
		
		
		public OrderClosingVO() {
			super();
			
		}

		// Constructor
		public OrderClosingVO(String orderid,String StatusId)
		
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
		
		
		public String getStatusId() {
			return StatusId;
		}
		
		
		
		}
		
		
	




