package com.zpl.springboot_mybatis.interceptor;

import com.zpl.springboot_mybatis.dao.DAO;
import com.zpl.springboot_mybatis.model.ResearchItem;
import com.zpl.springboot_mybatis.model.ResearchItemExample;
import com.zpl.springboot_mybatis.service.impl.BaseCommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2018/12/19.
 */
@Component
public class InitResearchItemInterceptor implements HandlerInterceptor {
    @Autowired
    private BaseCommonServiceImpl<ResearchItem> baseCommonServiceImpl;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(null!=request.getSession().getAttribute("itemlist")){
            return true;
        }
        Object[] params=new Object[1];
        ResearchItemExample researchItemExample=new ResearchItemExample();
        ResearchItemExample.Criteria criteria=researchItemExample.createCriteria();
        criteria.andResearchflagEqualTo("1");
        params[0]=researchItemExample;
        List<ResearchItem> list= (List<ResearchItem>) this.baseCommonServiceImpl.invoke(baseCommonServiceImpl.getResearchItemMapper(), DAO.SELECTBYEXAMPLE,params);
        request.getSession().setAttribute("itemlist",list);
        System.out.println("request before 拦截");
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
