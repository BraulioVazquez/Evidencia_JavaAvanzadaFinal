package me.jmll.utm.rest;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import me.jmll.utm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


public class FileRest {
	
@Autowired
		FileRest FileRest;

		@RequestMapping(value = "file", 
				method = RequestMethod.GET,
				produces = { "application/xml", "text/xml" })
		@ResponseBody
		@ResponseStatus(HttpStatus.OK)
		
		public ResponseEntity<String> showOptions (RequesEntity<String> requestEntity) {
			
			ResponseEntity<String> responseEntity = new ResponseEntity<> ("my response Body", HttpStatus.ok);
			HashMap<HttpMethod, String> response1 = new HashMap<>();
		}
		
		
	
		@RequestMapping(value = "file", 
				method = RequestMethod.GET, 
				produces = { "application/xml", "text/json" })
		@ResponseBody
		@ResponseStatus(HttpStatus.OK)
		
		public downloadFile (@PathVariable("file") String file) throws ResourceNotFoundException {
			
			File file1 = new getFile(file)
			
			if (!file.exist()){
				throws new ResourceNotFoundException("file with path " + file1.PATH + "was not foud");
				
			}
			
			response.setHeader("Content-Disposition", "inline: filename" + file1.getName());
			response.setHeader("Content-Legth", String.valueOf(file.length()));
			
			return new ModelAndView(new RedirectView(DownladView())); 	
			
	}
		
		
		@RequestMapping(value = "File", 
				method = RequestMethod.DELETE, 
				produces = { "application/xml", "text/xml" })
		@ResponseBody
		@ResponseStatus(HttpStatus.OK)
		
		public String deleteFile(@PathVariable("file") String file) throws ResourceNotFoundException{
			
			String file1 = new FileRest(file1);
					
					if (!file1.delete()){
						throws new ResourceNotFoundException("file with path " + file1.PATH + "was delete");
						
					}
					
					response.setHeader("Content-Disposition", "inline: filename" + file1.getName());
					response.setHeader("Content-Legth", String.valueOf(file1.length()));
			
			return file1;
		}

		
		@RequestMapping(value = "File", 
				method = RequestMethod.POST, 
				produces = { "application/xml", "text/xml" })
		@ResponseBody
		@ResponseStatus(HttpStatus.OK)
		
		public <CommonsMultipartFile> ResponseEntity<String> uploadFile (RequesEntity<String> requestEntity) {
			
			Object key;
			
			Object multipartRequest;
			
			CommonsMultipartFile multipartFile = (CommonsMultipartFile) multipartRequest.getFile(key);
		
			Object file;
			
			FileRest file1 = new FileRest();
		 
					response.setHeader("Location",file1.PATH);
			return new ResponseEntity<File>(file1,HttpStatus.CREATED);
		}
			
	
	}

