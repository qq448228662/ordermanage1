package com.company.userdao;

import com.company.userbean.userlistBean;

import java.util.List;

public interface userlistBeanMapper {
    /**
     * 登录查询操作
     *
     * @param record 参数实体类
     * @return 查询结果集
     */
    List<userlistBean> doLogin(userlistBean record);

    int deleteByPrimaryKey(String username);

    int insert(userlistBean record);

    int insertSelective(userlistBean record);

    userlistBean selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(userlistBean record);

    int updateByPrimaryKey(userlistBean record);
}