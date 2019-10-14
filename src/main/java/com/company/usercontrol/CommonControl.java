package com.company.usercontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonControl {

    /**
     * 执行服务器端转发跳转动作
     *
     * @param pg 转发的目标路径[注意:不包含视图解析的前后缀]
     * @return 返回目标页面
     */
    @RequestMapping("/forward")
    public String doForward(String pg) {
        return pg;
    }


    @RequestMapping("/changeorder")
    public String gotoCorder() {
        return "changeorder";
    }

    @RequestMapping("/selectorder")
    public String gotoSorder() {
        return "selectorder";
    }

    @RequestMapping("/addorder")
    public String gotoAOrder() {
        return "addorder";
    }


    @RequestMapping("/editmessage")
    public String gotoEMessage() {
        return "changemessage";
    }


    @RequestMapping("/selectproduct")
    public String gotoSproduct() {
        return "editmessage";
    }

    @RequestMapping("/addmessage")
    public String gotoAMessage() {
        return "addmessage";
    }

    @RequestMapping("/showsupplier")
    public String gotoSSupplier() {
        return "showsupplier";
    }

    @RequestMapping("/editSupplier")
    public String gotoESupplier() {
        return "editSupplier";
    }

    @RequestMapping("/addsupplier")
    public String gotoSupplier() {
        return "addsupplier";
    }
    @RequestMapping("/adduser")
    public String gotoUser() {
        return "adduser";
    }
    @RequestMapping("/changeusermessage")
    public String gotoCUser() {
        return "changeusermessage";
    }
    @RequestMapping("/selectuser")
    public String gotoSUser() {
        return "selectuser";
    }
    @RequestMapping("/selectuser2")
    public String gotoSUser2() {
        return "userInfoAjaxQueryWithPagination";
    }

    /**
     * 执行服务器端转发跳转动作
     *
     * @return 返回目标页面
     */
    @RequestMapping("/index")
    public String gotoIndex() {
        return "index";
    }
}
