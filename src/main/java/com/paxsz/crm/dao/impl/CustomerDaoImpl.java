package com.paxsz.crm.dao.impl;

import com.paxsz.crm.bean.Customer;
import com.paxsz.crm.dao.CustomerDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

    @Override
    public Customer findById(Long id) {
        return getHibernateTemplate().get(Customer.class, id);
    }
}
