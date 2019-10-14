package com.company.userdao;

import com.company.userbean.ProductBean;

import java.util.List;

public interface ProductBeanMapper {

    int deleteByPrimaryKey9(Integer productid);

    int insert9(ProductBean record);

    int insertSelective9(ProductBean record);

    ProductBean selectByPrimaryKey9(Integer productid);

    List<ProductBean> selectByPrimaryKey29(ProductBean record);

    int updateByPrimaryKeySelective9(ProductBean record);

    int updateByPrimaryKey9(ProductBean record);
}