package com.javagf.cmc.utils;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.javagf.cmc.api.StudentApi;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(StudentApi.class);
	}

}
