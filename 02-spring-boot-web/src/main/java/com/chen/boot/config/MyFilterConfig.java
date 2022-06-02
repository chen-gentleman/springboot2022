package com.chen.boot.config;

import com.chen.boot.filter.MyFilter;
import com.chen.boot.filter.MyFilter2;
import com.chen.boot.filter.MyFilterWithAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * @Author @Chenxc
 * @Date 2022/6/2 10:16
 */
public class MyFilterConfig {
    @Autowired
    private MyFilter filter;
    @Autowired
    private MyFilter2 myFilter2;

    @Bean
    public FilterRegistrationBean<MyFilter> setUpMyFilter(){
        FilterRegistrationBean<MyFilter> myFilterFilterRegistrationBean = new FilterRegistrationBean<>();
        myFilterFilterRegistrationBean.setFilter(filter);
        myFilterFilterRegistrationBean.setOrder(1);
        myFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/api/*"));
        return myFilterFilterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<MyFilter2> setUpMyFilter2(){
        FilterRegistrationBean<MyFilter2> myFilterWithAnnotationFilterRegistrationBean = new FilterRegistrationBean<>();
        myFilterWithAnnotationFilterRegistrationBean.setOrder(2);
        myFilterWithAnnotationFilterRegistrationBean.setFilter(myFilter2);
        myFilterWithAnnotationFilterRegistrationBean.setUrlPatterns(Arrays.asList("/api/*"));
        return myFilterWithAnnotationFilterRegistrationBean;
    }
}
