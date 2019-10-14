package com.company.userdao;

import com.company.userbean.bookBean;

import java.util.List;

public interface bookBeanMapper {
    int deleteByPrimaryKey(Integer bookid);

    int insert(bookBean record);

    int insertSelective(bookBean record);

    bookBean selectByPrimaryKey(Integer bookid);

    List<bookBean> selectByPrimaryKey2(bookBean bookid);

    int updateByPrimaryKeySelective(bookBean record);

    int updateByPrimaryKey(bookBean record);
}