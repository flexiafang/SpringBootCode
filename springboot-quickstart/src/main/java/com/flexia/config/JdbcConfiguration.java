package com.flexia.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Author hustffx
 * @Date 2020/6/29 21:26
 */
@Configuration // 声明是一个配置类
// @PropertySource("classpath:jdbc.properties") // 读取资源文件
// @EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

     /*@Value("${jdbc.driverClassName}")
     private String driverClassName;
     @Value("${jdbc.url}")
     private String url;
     @Value("${jdbc.username}")
     private String username;
     @Value("${jdbc.password}")
     private String password;*/

    // @Autowired
    // private JdbcProperties jdbcProperties;

    /*public JdbcConfiguration(JdbcProperties jdbcProperties) {
        this.jdbcProperties = jdbcProperties;
    }*/

    /*@Bean // 把方法的返回值注入spring容器中
    public DataSource createDataSource(JdbcProperties jdbcProperties) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }*/

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource createDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
