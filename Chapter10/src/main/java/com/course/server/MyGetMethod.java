package com.course.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.StringReader;
import java.util.Objects;

@RestController//我的被扫描的类；
public class MyGetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)//表示要访问的地址；
    public String getCookies(HttpServletResponse response){
        //HttpServerletRequest 装请求信息的类，表示访问服务端的时候，必须携带Cookie，没有就会访问失败；
        //HttpServerletResponse 装相应信息的类；表示把信息推送给服务端，没有也可以返回成功；
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "恭喜获得cookies成功";
    }

    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    public String getWithCookies(HttpServletRequest request){

        //访问浏览器时，必须带cookie;
        Cookie [] cookies = request.getCookies();
        /**
         * 判断对象是空
         */
        if (Objects.isNull(cookies)){
            return "你必须携带cookie信息";
        }
        for (Cookie cookie :cookies){
            if (cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "这是一个需要携带cookie才能访问的get请求";
            }
        }
        return "你必须携带cookie信息";
    }

    /*
     * 开发一个需要携带参数才能访问的get请求；
     */



}
