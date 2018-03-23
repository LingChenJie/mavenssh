package com.paxsz.crm.service;

import com.paxsz.crm.bean.Customer;

public interface CustomerService {

    /**
     * 根据ID获取客户信息
     *
     * @param id
     * @return
     */
    Customer findById(Long id);
}
