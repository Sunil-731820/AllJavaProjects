package com.java.rest;

import java.io.File;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;


@Path("/files")
public class FileDownloadService {
	
	private static final String FILE_PATH = "C:\\Users\\sunilg\\Desktop\\Dependency\\All SS\\Provider Details\\p1.PNG";
	
	@GET  
    @Path("/image")  
    @Produces("image/png")
	public Response getFile() {
		System.out.println("I Am Calling This Functions");
		File file = new File(FILE_PATH);
		ResponseBuilder response = Response.ok(file);
		 response.header("Content-Disposition","attachment; filename=\"javatpoint_image.png\"");  
	     return response.build();  
	}
}
