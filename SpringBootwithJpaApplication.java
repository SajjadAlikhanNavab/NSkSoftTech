package com.nsksoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nsksoft.demo.pojo.Organization;
import com.nsksoft.demo.repository.OrgnizationRepository;

@SpringBootApplication
public class SpringBootwithJpaApplication {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(SpringBootwithJpaApplication.class, args);
		 OrgnizationRepository org=context.getBean(OrgnizationRepository.class);
		 Organization org1=new Organization();
		              org1.setOrg_id(12);
		              org1.setOrg_name("Snycon");
		              org1.setAddress("Bangalore");
		    org.save(org1);
		              
		       System.out.println("Object Saved Successfuly");
	
	
	
	
	}
}
