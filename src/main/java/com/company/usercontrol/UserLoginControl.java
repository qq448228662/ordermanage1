package com.company.usercontrol;

import com.company.userbean.ProductBean;
import com.company.userbean.SupplierBean;
import com.company.userbean.bookBean;
import com.company.userbean.userlistBean;
import com.company.userservice.IUserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserLoginControl {


    @Resource
    private IUserInfoService userInfoService;




    /**
     * 使用ajax进行删除操作
     *
     * @param id 删除记录的主键id字段值
     * @return 删除操作的结果记录
     */
    @ResponseBody
    @RequestMapping("/doAjaxorderInfoDeleteByID")
    public int doAjaxQueryBByPramas(int id) {
        // 默认返回值
        int i = 0;
        // 调用service层进行删除操作
        i = userInfoService.deleteproductInfoByID(id);
        return i;
    }

    @ResponseBody
    @RequestMapping("/doAjaxorderInfoQueryByPramas")
    public  List<bookBean> selectproductmethod(bookBean supplierBean) {

        List<bookBean>  lstsupplier= userInfoService.selectbook(supplierBean);
        // 在springmvc中直接放回数据结构，springmvc会自动把数据结果集转换为 json数据串发给客户端
        // 如果不是springmvc框架，则需要使用手动或者第三方工具将结果集转换为json字符串发回给客户端
        return lstsupplier;

    }



    @RequestMapping("/updateorderByPrimaryKey")
    public String changeeorder(bookBean supplierBean) {
        // 调用Service层进行用户信息数据保存和修改操作
        int i = userInfoService.updatebookByPrimaryKey(supplierBean);
        // 根据操作结果进行视图转发处理
        return "changeorder";
    }


    /***
     * 插入新订单
     * @param productBean
     * @return
     */
    @RequestMapping("/insertorder")
    public String insertorderInfo(bookBean productBean) {
        // 调用Service层进行用户信息数据保存和修改操作
        int i = userInfoService.insertbook(productBean);
        // 根据操作结果进行视图转发处理

        return "addorder";
    }

    /**
     * 使用ajax进行删除操作
     *
     * @param id 删除记录的主键id字段值
     * @return 删除操作的结果记录
     */
    @ResponseBody
    @RequestMapping("/doAjaxproductInfoDeleteByID")
    public int doAjaxQueryPByPramas(int id) {
        // 默认返回值
        int i = 0;
        // 调用service层进行删除操作
        i = userInfoService.deleteproductInfoByID(id);
        return i;
    }

    @ResponseBody
    @RequestMapping("/doAjaxproductInfoQueryByPramas")
    public  List<ProductBean> selectproductmethod(ProductBean supplierBean) {

        List<ProductBean>  lstsupplier= userInfoService.selectproduct(supplierBean);
        // 在springmvc中直接放回数据结构，springmvc会自动把数据结果集转换为 json数据串发给客户端
        // 如果不是springmvc框架，则需要使用手动或者第三方工具将结果集转换为json字符串发回给客户端
        return lstsupplier;

    }

    @RequestMapping("/updateproductByPrimaryKey")
    public String changeproductmessage(ProductBean supplierBean) {
        // 调用Service层进行用户信息数据保存和修改操作
        int i = userInfoService.updateproductByPrimaryKey(supplierBean);
        // 根据操作结果进行视图转发处理
        return "changemessage";
    }


    /***
     * 插入新产品
     * @param productBean
     * @return
     */
    @RequestMapping("/insertProduct")
    public String insertProductInfo(ProductBean productBean) {
        // 调用Service层进行用户信息数据保存和修改操作
        int i = userInfoService.insertproduct(productBean);
        // 根据操作结果进行视图转发处理

        return "addmessage";
    }

    /**
     * 使用ajax进行删除操作
     *
     * @param id 删除记录的主键id字段值
     * @return 删除操作的结果记录
     */
    @ResponseBody
    @RequestMapping("/doAjaxSupplierInfoDeleteByID")
    public int doAjaxQuerySByPramas(String supplierid) {
        // 默认返回值
        int i = 0;

        int id_int=Integer.decode(supplierid);
        // 调用service层进行删除操作
        i = userInfoService.deleteSupplierInfoByID(id_int);
        return i;
    }

    @ResponseBody
    @RequestMapping("/doAjaxSupplierInfoQueryByPramas")
    public  List<SupplierBean> selectsuppliermethod(SupplierBean supplierBean) {

        List<SupplierBean>  lstsupplier= userInfoService.selectsupplier(supplierBean);
        // 在springmvc中直接放回数据结构，springmvc会自动把数据结果集转换为 json数据串发给客户端
        // 如果不是springmvc框架，则需要使用手动或者第三方工具将结果集转换为json字符串发回给客户端
        return lstsupplier;

    }
    @RequestMapping("/updatesupplierByPrimaryKey")
    public String changesuppliermessage(SupplierBean supplierBean) {
        // 调用Service层进行用户信息数据保存和修改操作
        int i = userInfoService.updatesupplierByPrimaryKey(supplierBean);
        // 根据操作结果进行视图转发处理
        return "editSupplier";
    }

   @RequestMapping("/insertSupplier")
    public String insertUserInfo(SupplierBean supplierBean) {
        // 调用Service层进行用户信息数据保存和修改操作
        int i = userInfoService.insertSupplier(supplierBean);
        // 根据操作结果进行视图转发处理

        return "addsupplier";
    }
    /*
    映射关系：要求实体类的属性名和前台页面的表单控件的name属性值一一对应
    课堂作业：
        如果使用 @RequestParam 对方法参数进行绑定，是否可行？
     */
    @RequestMapping("/login4")
    public ModelAndView doLogin4(userlistBean userInfoB) {
        System.out.println("basepath:" + System.getProperty("server.basePath"));
        // 返回的视图对象
        ModelAndView mav = new ModelAndView();
        // 设置modelandview要显示的页面名:默认进入登录成功页面
        mav.setViewName("index");
        if (userInfoB != null) {
            System.out.println("后台登录处理：" + userInfoB.getUsername() + ":" + userInfoB.getPassword());
        } else {
            System.out.println("后台登录：null");
        }
        // 调用service的接口方法，进行登录的业务逻辑处理
        List<userlistBean> lstUserInfos = userInfoService.doLogin(userInfoB);

        // 登录判定
        if (lstUserInfos != null && lstUserInfos.size() > 0) {
            // 登录成功，缓存当前登录成功的数据
            // 课下作业：ModelAndView的缓存级别对应的是那个？  requestScope
            mav.addObject("loginedUserName", lstUserInfos.get(0).getUsername());
        } else {
            // 登录不成功
            System.out.println("登录失败");
            // 返回登录页面
            //mav.setViewName("../../login");  /// 注意：springmvc进行视图解析时，不会处理 ../ ,而是直接拼接字符串
            mav.setViewName("login");
            // 使用字符串方式作为响应函数的返回值
            // 扩展作业：是否还有其他的解决方案？
        }

        // 返回ModelAndView对象
        return mav;
    }



    @RequestMapping("/updateByPrimaryKey")
    public String changemessage(userlistBean userInfoBean) {
        // 调用Service层进行用户信息数据保存和修改操作
        int i = userInfoService.UpdateUserInfo(userInfoBean);
        // 根据操作结果进行视图转发处理
        return "changeusermessage";
    }

    @RequestMapping("/insertuser")
    public String insertUserInfo(userlistBean userInfoBean) {
        // 调用Service层进行用户信息数据保存和修改操作
        int i = userInfoService.insertuser(userInfoBean);
        // 根据操作结果进行视图转发处理

        return "adduser";
    }





    /**
     * 保存和修改用于信息
     *
     * @param userInfoBean 用户参数实体类
     * @param file_userimg 用于接收客户端发送的流文件对象
     * @return 结果视图
     */
    @ResponseBody
    @RequestMapping("/saveOrUpdateUserinfoViaAjax")
    public Map<String,Object> saveOrUpdateUserInfoViaAjax(userlistBean userInfoBean, MultipartFile file_userimg) {

        // 调用Service层进行用户信息数据保存和修改操作
        int i = userInfoService.UpdateUserInfo(userInfoBean);
        // 返回响应信息
        Map<String,Object> map = new HashMap<>();
        map.put("msg","更新成功");
        return map;
    }
    /**
     * 添加了 @ResponseBody 表名该方法响应的是一个ajax类型的请求，
     * retrun返回的就是对ajax请求的响应内容，而不再是视图的路径
     */
    @ResponseBody
    @RequestMapping("/doAjaxDemo")
    public String doAjaxDemo() {
        // 业务逻辑处理完成后获取的响应信息
        String strMsg = "ajax hello!";
        return strMsg;
    }

    /**
     * ajax进行数据查询处理
     *
     * @param userInfoBean 查询参数信息
     * @return 查询结果集
     */
    @ResponseBody
    @RequestMapping("/doAjaxUserInfoQueryByPramas")
    public List<userlistBean> doAjaxQueryByPramas(userlistBean userInfoBean) {

        // 调用service层经进行数据库查询操作
        List<userlistBean> lstUserInfos = userInfoService.doLogin(userInfoBean);
        // 在springmvc中直接放回数据结构，springmvc会自动把数据结果集转换为 json数据串发给客户端
        // 如果不是springmvc框架，则需要使用手动或者第三方工具将结果集转换为json字符串发回给客户端
        return lstUserInfos;

    }

    /**
     * 使用ajax进行删除操作
     *
     * @param username 删除记录的主键id字段值
     * @return 删除操作的结果记录
     */
    @ResponseBody
    @RequestMapping("/doAjaxUserInfoDeleteByID")
    public int doAjaxQueryByPramas(String username) {
        // 默认返回值
        int i = 0;
        // 调用service层进行删除操作
        i = userInfoService.deleteUserInfoByID(username);
        return i;
    }

}
