package com.feign.interceptor;

import com.feign.tool.JwtToken;
import com.feign.tool.encodeChinese;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String[] suffix=httpServletRequest.getServletPath().split("[.]");
        if(suffix.length==0){
            if(httpServletRequest.getParameter("token")!=null){
                Object test= JwtToken.verifyToken(httpServletRequest.getParameter("token"));
                if(test.equals("not bind")){
                    String error=new encodeChinese().encode("token失效");
                    httpServletResponse.sendRedirect("/login/login.html?error="+error);
                    return  false;
                }else {

                    return true;
                }
            }else{
                String error=new encodeChinese().encode("未登录，请登录");
                httpServletResponse.sendRedirect("/login/login.html?error="+error);
                return false;
            }
        }else{
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
