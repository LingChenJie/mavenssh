package com.paxsz.crm.action;

import com.opensymphony.xwork2.ActionSupport;
import com.paxsz.crm.bean.Customer;
import com.paxsz.crm.service.CustomerService;

public class CustomerAction extends ActionSupport {

    private Long custId;

    private Customer customer;

    private CustomerService cs;

    public String findCustById() {

        customer = cs.findById(custId);

        System.out.println(customer.toString());

        return SUCCESS;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCs(CustomerService cs) {
        this.cs = cs;
    }
}
