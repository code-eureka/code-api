package com.eureka.helloworld.api.configuration;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.eureka.helloworld.api.resources.DemoResource;

@ApplicationPath("v1")
@Configuration
public class DemoApplication extends ResourceConfig {
	   public DemoApplication() {
		   register(DemoResource.class);
	   }
}
