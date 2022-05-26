package org.example;

import org.springframework.context.annotation.Bean;

public class Config {
    @Bean
    public Customer getCustomer(){
        Customer cust = new Customer();
        cust.setId(101);
        cust.setCname("Ranjitha Agencies");
        cust.setAddress("Coimbatore");

        return cust;
    }
}
