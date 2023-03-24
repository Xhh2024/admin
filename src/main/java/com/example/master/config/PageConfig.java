package com.example.master.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 分页配置
 * @author 谢环环
 * @date 2023/03/25
 */
@Configuration
public class PageConfig {

    /**
     * mybatis +拦截器
     * @return {@link MybatisPlusInterceptor}
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        //创建一个拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //添加拦截满足条件的sql语句
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
