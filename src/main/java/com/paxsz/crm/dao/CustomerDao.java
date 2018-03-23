package com.paxsz.crm.dao;

import com.paxsz.crm.bean.Customer;

public interface CustomerDao {

    /**
     * 根据ID获取客户信息
     *
     * @param id
     * @return
     */
    Customer findById(Long id);
}
