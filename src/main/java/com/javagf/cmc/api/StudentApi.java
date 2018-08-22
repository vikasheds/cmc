package com.javagf.cmc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.javagf.cmc.utils.RestConstants;

@Component
@Path(RestConstants.API + RestConstants.STUDENT_API)
@Produces(MediaType.TEXT_PLAIN)
public class StudentApi {

	public static final String HELLO = "hello";

	@Path(HELLO)
	@GET
	public String sayHello() {
		return "Hello World";
	}

}
