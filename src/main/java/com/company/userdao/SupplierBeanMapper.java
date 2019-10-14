package com.company.userdao;

import com.company.userbean.SupplierBean;

import java.util.List;

public interface SupplierBeanMapper {
    List<SupplierBean> selectsupplierByPrimaryKey(SupplierBean supplierBean);

    int deleteByPrimaryKey(Integer supplierid);

    int insert(SupplierBean record);

    int insertSelective(SupplierBean record);

    SupplierBean selectByPrimaryKey(Integer supplierid);

    int updateByPrimaryKeySelective(SupplierBean record);

    int updateByPrimaryKey(SupplierBean record);
}