package com.sy.controller;

//import com.sy.model.common.Menu;
import com.alibaba.fastjson.JSON;
import com.sy.model.User;
import com.sy.model.resp.BaseResp;
//import com.sy.service.common.MenuService;
//import com.sy.service.common.UserService;

import com.sy.service.UserServic;
import com.sy.tool.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.List;

@Controller
public class LoginController {

    //private Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    private UserServic userService;
//    @Autowired
//    private MenuService menuService;
    BaseResp baseResp = new BaseResp();
    //2.织入公告service
    //3.织入资讯service


    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/admin.html")
    public String toIndex(){

        return "index";
    }

    /**
     * 跳转到主页
     * @return
     */
    @RequestMapping("/main.html")
    public String toMain(){
        return "main";
    }

    /**
     * 用户登录
     * @return
     */
    @RequestMapping("/login.html")
    @ResponseBody
    public String doLogin(User user, HttpSession session){

        try {
            User currentUser = userService.getLoginUser(user);
            if(null!=currentUser){
                //跳转到main.jsp
                //把List<Menu>转化为json,前端通过JS解析该数据
//                String menus= menuService.makeMenus(currentUser.getRoleId());
//                session.setAttribute("menus", menus);
                session.setAttribute(Constants.SESSION_USER, currentUser);
                return Constants.LOGIN_SUCCESS;
            }
        }catch (Exception e){
            e.printStackTrace();
            //写入日志文件
            //logger.error("用户登录异常", e);
        }
        return Constants.LOGIN_FAILED;

    }
    @RequestMapping(value = "/isLogin.html",method = RequestMethod.GET)
    @ResponseBody
    public String isLogin(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute(Constants.SESSION_USER);
//        String menus=(String) request.getSession().getAttribute("menus");
        if (user == null) {
            baseResp.setSuccess(0);
            baseResp.setErrorMsg("未登入");
            return JSON.toJSONString(baseResp);
        } else {
            baseResp.setSuccess(1);
            baseResp.setErrorMsg("已登入");
            try {
//                String menus= menuService.makeMenus(user.getRoleId());
//                System.out.println(menus);
//                实时更新用户
                User user1=userService.getLoginUser(user);
//                user1.setMenus(menus);
                baseResp.setData(user1);
            } catch (Exception e) {
                e.printStackTrace();
                baseResp.setData(user);
            }
         return JSON.toJSONString(baseResp);
        }
    }
    @RequestMapping(value = "/logout.html")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "index";
    }


}
