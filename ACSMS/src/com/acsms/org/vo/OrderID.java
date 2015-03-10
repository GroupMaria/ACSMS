package com.acsms.org.vo;

public class OrderID {
	

	    private Integer orderId;
	    private int itemId;

	    public int hashCode() {
	        return ((this.getOrderId()==null
	                        ?0:this.getOrderId().hashCode())
	                 ^ ((int) this.getItemId()));
	    }

	    private int getItemId() {
			// TODO Auto-generated method stub
			return 0;
		}

		private Object getOrderId() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean equals(Object otherOb) {
	        if (this == otherOb) {
	            return true;
	        }
			return false;
	        
	        }
	        
	    

	    public String toString() {
	        return "" + orderId + "-" + itemId;
	    }
	    	
	}
	
	

