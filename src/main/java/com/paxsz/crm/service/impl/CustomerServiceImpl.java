package com.paxsz.crm.service.impl;

import com.paxsz.crm.bean.Customer;
import com.paxsz.crm.dao.CustomerDao;
import com.paxsz.crm.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao cd;

    @Override
    public Customer findById(Long id) {
        return cd.findById(id);
    }

    public void setCd(CustomerDao cd) {
        this.cd = cd;
    }
}
