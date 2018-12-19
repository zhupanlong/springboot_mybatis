package com.zpl.springboot_mybatis.config;

import com.zpl.springboot_mybatis.interceptor.InitResearchItemInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Administrator on 2018/12/19.
 */
@Configuration
public class InitResearchItemConfiguration implements WebMvcConfigurer {
    @Bean
    public InitResearchItemInterceptor myInterceptor(){
        return new InitResearchItemInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //多个拦截器组成一个拦截器链
        // addPathPatterns用于添加拦截规则
        // excludePathPatterns用户排除拦截
        registry.addInterceptor(myInterceptor()).addPathPatterns("/**"); //对来自/** 全路径请求进行拦截
    }

}
