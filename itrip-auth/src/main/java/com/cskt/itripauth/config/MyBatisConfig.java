package com.cskt.itripauth.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 李谟卓
 * @Description:
 * @date 2020-09-18 15:15
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"com.cskt.mapper"})
public class MyBatisConfig {
    /**
     * 配置分页插件，从3.4.0开始使用新的配置方式
     * @return
     */
    @Bean
    public MybatisPlusInterceptor plusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }


}
