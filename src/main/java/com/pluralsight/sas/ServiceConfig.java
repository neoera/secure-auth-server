package com.pluralsight.sas;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder builder) throws Exception{
        builder.inMemoryAuthentication()
                .withUser("jack").password("{noop}pass1").roles("USER")
                .and()
                .withUser("john").password("{noop}pass2").roles("USER","OPERATOR");
    }
}
