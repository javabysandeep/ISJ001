package com.itshaala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@PropertySource("application.properties")
public class SpringPropertiesConfiguration {

    @Autowired
    Environment environment;

   /* @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUsername(environment.getProperty("dbUsername"));
        driverManagerDataSource.setPassword(environment.getProperty("password"));
        driverManagerDataSource.setUrl(environment.getProperty("url"));
        driverManagerDataSource.setDriverClassName(Objects.requireNonNull(environment.getProperty("driver")));
        return driverManagerDataSource;
    }

    @Bean(name = "jdbcTemplate1")
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        return jdbcTemplate;
    }*/
}
