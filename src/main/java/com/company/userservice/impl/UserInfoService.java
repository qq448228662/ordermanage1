package com.company.userservice.impl;


import com.company.userbean.ProductBean;
import com.company.userbean.SupplierBean;
import com.company.userbean.bookBean;
import com.company.userdao.ProductBeanMapper;
import com.company.userdao.SupplierBeanMapper;
import com.company.userdao.bookBeanMapper;
import com.company.userservice.IUserInfoService;
import com.company.userbean.userlistBean;
import com.company.userdao.userlistBeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoService implements IUserInfoService {



    // 依赖注入和反转控制
    @Resource
    private userlistBeanMapper userInfoM;
    @Resource
    private SupplierBeanMapper supplierBeanMapper;
   @Resource
    private ProductBeanMapper productBeanMapper;
     @Resource
    private bookBeanMapper bookBeanM;


    @Override
    public int deletebookInfoByID(int username) {
        // 默认返回值
        int i = 0;
        // 调用Dao层进行删除操作
        // 物理删除
        //i = userInfoM.deleteByPrimaryKey(userid);
        // 逻辑删除
        i = bookBeanM.deleteByPrimaryKey(username);
        return i;
    }

    @Override
    public List<bookBean> selectbook(bookBean supplierBean) {
        // 调用Dao层进行数据库查询操作
        List<bookBean> lstsupplierInfos = bookBeanM.selectByPrimaryKey2(supplierBean);
        return lstsupplierInfos;
    }

    @Override
    public int updatebookByPrimaryKey(bookBean supplierBean) {
        // 默认返回值
        int i = 0;

        // 修改操作
        i = bookBeanM.updateByPrimaryKey(supplierBean);

        return i;
    }

    @Override
    public int insertbook(bookBean supplierBean) {
        int i = 0;
        i = bookBeanM.insertSelective(supplierBean);
        return i;
    }


    @Override
    public int deleteproductInfoByID(int username) {
        // 默认返回值
        int i = 0;
        // 调用Dao层进行删除操作
        // 物理删除
        //i = userInfoM.deleteByPrimaryKey(userid);
        // 逻辑删除
        i = productBeanMapper.deleteByPrimaryKey9(username);
        return i;
    }

    @Override
    public List<ProductBean> selectproduct(ProductBean productBean) {
        // 调用Dao层进行数据库查询操作
        List<ProductBean> lstsupplierInfos = productBeanMapper.selectByPrimaryKey29(productBean);
        return lstsupplierInfos;
    }

    @Override
    public int updateproductByPrimaryKey(ProductBean productBean) {
        // 默认返回值
        int i = 0;

        // 修改操作
        i = productBeanMapper.updateByPrimaryKey9(productBean);

        return i;
    }

    @Override
    public int insertproduct(ProductBean productBean) {
        int i = 0;
        i = productBeanMapper.insert9(productBean);
        return i;
    }

    @Override
    public int deleteSupplierInfoByID(int sid) {
        // 默认返回值
        int i = 0;
        // 调用Dao层进行删除操作
        // 物理删除
        //i = userInfoM.deleteByPrimaryKey(userid);
        // 逻辑删除
        i = supplierBeanMapper.deleteByPrimaryKey(sid);
        return i;
    }

    @Override
    public List<SupplierBean> selectsupplier(SupplierBean supplierBean) {
        // 调用Dao层进行数据库查询操作
        List<SupplierBean> lstsupplierInfos = supplierBeanMapper.selectsupplierByPrimaryKey(supplierBean);
        return lstsupplierInfos;
    }

    @Override
    public int updatesupplierByPrimaryKey(SupplierBean supplierBean) {
        // 默认返回值
        int i = 0;

        // 修改操作
        i = supplierBeanMapper.updateByPrimaryKey(supplierBean);

        return i;


    }

    //插入供应商
    @Override
    public int insertSupplier(SupplierBean supplierBean) {
        int i = 0;
        i = supplierBeanMapper.insertSelective(supplierBean);
        return i;
    }




    @Override
    public List<userlistBean> doLogin(userlistBean userInfoBean) {
        // 调用Dao层进行数据库查询操作
        List<userlistBean> lstUserInfos = userInfoM.doLogin(userInfoBean);
        return lstUserInfos;
    }

    @Override
    public int UpdateUserInfo(userlistBean userInfoBean) {
        // 默认返回值
        int i = 0;

            // 修改操作
            i = userInfoM.updateByPrimaryKey(userInfoBean);

        return i;
    }

    @Override
    public int insertuser(userlistBean userInfoBean) {


        int i = 0;
        i = userInfoM.insertSelective(userInfoBean);
        return i;
    }


    @Override
    public int deleteUserInfoByID(String username) {
        // 默认返回值
        int i = 0;
        // 调用Dao层进行删除操作
        // 物理删除
        //i = userInfoM.deleteByPrimaryKey(userid);
        // 逻辑删除
        i = userInfoM.deleteByPrimaryKey(username);
        return i;
    }

}
