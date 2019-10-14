package com.company.userservice;

import com.company.userbean.ProductBean;
import com.company.userbean.SupplierBean;
import com.company.userbean.bookBean;
import com.company.userbean.userlistBean;


import java.util.List;

public interface IUserInfoService {

    /***
     * 订单模块
     * @param username
     * @return
     */

    public int deletebookInfoByID(int username);
    public List<bookBean> selectbook(bookBean supplierBean);
    public int updatebookByPrimaryKey(bookBean supplierBean);
    public int insertbook(bookBean supplierBean);


    /***
     * 产品模块
     * @param username
     * @return
     */
    public int deleteproductInfoByID(int username);
    public List<ProductBean> selectproduct(ProductBean productBean);
    public int  updateproductByPrimaryKey(ProductBean productBean);
    public int insertproduct(ProductBean productBean);





    /**
     * 根据id主键删除用户信息
     *
     * @param username 主键值
     * @return 操作结果记录
     */
    public int deleteSupplierInfoByID(int username);

    /***
     *
     * @param supplierBean
     * @return 操作结果
     */
    public List<SupplierBean> selectsupplier(SupplierBean supplierBean);

    /***
     *  更新供应商的信息
     * @param supplierBean
     * @return 操作结果
     */
    public int  updatesupplierByPrimaryKey(SupplierBean supplierBean);


    /***
     * 供应商插入操作
     * @param supplierBean
     * @return 操作结果
     */

    public int insertSupplier(SupplierBean supplierBean);

    /**
     * 登录查询：根据登录传入用户名密码进行登录查询操作
     *
     * @param userInfoBean 登录参数信息实体类
     * @return 查询结果集
     */
    public List<userlistBean> doLogin(userlistBean userInfoBean);

    /**
     * 保存和修改用于信息
     *
     * @param userInfoBean 用户参数实体类
     * @return 操作结果
     */
    public int UpdateUserInfo(userlistBean userInfoBean);
    /**
     * 新建用户信息
     *
     * @param userInfoBean 用户参数实体类
     * @return 操作结果
     */
    public int insertuser(userlistBean userInfoBean);

    /**
     * 根据id主键删除用户信息
     *
     * @param username 主键值
     * @return 操作结果记录
     */
    public int deleteUserInfoByID(String username);
}
