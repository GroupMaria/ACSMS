package com.acsms.org.vo;

public class SearchOrderId<Customer> {
	OrderID findCustomerByid(int id){
		boolean exist=false;

		if(this.orders.isEmpty()) {
		    return null;
		}

		for(int i=0;i<this.customers.size();i++) {
		    if(this.customers.get(i).getId() == id) {
		        exist=true;
		        break;
		    }

		    int customerId;

		    if(exist) {
		        customerId = this.customers.get(id);
		    } else {
		        customerId = this.customers.get(id);
		    }
		}

		return customerId;

		}

}
