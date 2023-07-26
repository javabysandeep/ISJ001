package com.itshaala.config;

import com.itshaala.model.Course;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;
import java.util.Properties;

@Configuration
@PropertySource("application.properties")
@ComponentScan(basePackages = "com.itshaala")
@EnableTransactionManagement
public class DatabaseConfiguration {

    @Autowired
    Environment environment;

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUsername(environment.getProperty("dbUsername"));
        driverManagerDataSource.setPassword(environment.getProperty("password"));
        driverManagerDataSource.setUrl(environment.getProperty("url"));
        driverManagerDataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("driver")));
        return driverManagerDataSource;
    }

    @Bean
    public LocalSessionFactoryBean getLocalSessionFactoryBean() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.hdm2ddl", "create");

        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setAnnotatedClasses(Course.class);
        localSessionFactoryBean.setDataSource(getDataSource());
        localSessionFactoryBean.setHibernateProperties(properties);
        return localSessionFactoryBean;
    }

    @Bean
    public HibernateTemplate getHibernateTemplate() {
        HibernateTemplate hibernateTemplate = new HibernateTemplate();
        hibernateTemplate.setSessionFactory(getLocalSessionFactoryBean().getObject());
        return hibernateTemplate;
    }

}


 /*hibernate.dialect= org.hibernate.dialect.Oracle9Dialect
        hibernate.connection.driver_class= oracle.jdbc.driver.OracleDriver
        hibernate.connection.url= jdbc:oracle:thin:@localhost:1521:xe
        hibernate.connection.username= system
        hibernate.connection.password=jtp
        hibernate.show_sql=true
        hibernate.hbm2ddl=update    */