package me.jmll.utm.rest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import me.jmll.utm.model.FileLinkListResource;
import me.jmll.utm.rest.exception.ResourceNotFoundException;

public class DirectoryRest {
	
	@RequestMapping(value = "file", 
			method = RequestMethod.OPTIONS,
			produces = { "application/xml", "text/xml" })
	@ResponseBody
	
	public <HttpMethod> ResponseEntity<String> showOptions (RequesEntity<String> requestEntity) {
		
	ResponseEntity<String> responseEntity = new ResponseEntity<> ("my response Body", HttpStatus.ok);
	
	HashMap<HttpMethod, String> response1 = new HashMap<>();
	
	}

	
	@RequestMapping(value = "file", 
			method = RequestMethod.GET, 
			produces = { "application/xml", "text/json" })
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	
	public Map<String, Object> getFilesJSON() throws ResourceNotFoundException {
		
		Map<String, Object> response = new HashMap<>();
		Map<String, Object> file = new HashMap<>();
		
		DirectoryRest file1 = new DirectoryRest();
				
				if (!file.exist()){
					throws new ResourceNotFoundException("file with path " + file1.PATH + "was not foud");	
				}	
		
				response.setHeader("Content-Disposition", "inline: filename" + file1.getName());
				response.setHeader("Content-Legth", String.valueOf(file.length()));
				
				
				List<Link> _links = new ArrayList<Link>(); _links.add(new Link(ServletUriComponentsBuilder
						.fromCurrentServletMapping().path("/")
						.build().toString(), "api"));
						_links.add(new Link(ServletUriComponentsBuilder
						.fromCurrentServletMapping().path("/directory")
						.build().toString(), "self"));
						Map<String, Object> response = new Hashtable<>(2); response.put("_links", _links);
						response.put("data", file1);
						return response;
				
				
	}
	
	
	@RequestMapping(value = "user", 
			method = RequestMethod.GET,
			produces = { "application/xml", "text/xml" })
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	
	public FileLinkListResource getFilesXML() {
		
		Map<String, Object> response = new HashMap<>();
		Map<String, Object> file = new HashMap<>();
		
		DirectoryRest file1 = new DirectoryRest();
				
				if (!file.exist()){
					throws new ResourceNotFoundException("file with path " + file1.PATH + "was not foud");	
				}	
		
				response.setHeader("Content-Disposition", "inline: filename" + file1.getName());
				response.setHeader("Content-Legth", String.valueOf(file.length()));
				
				
				List<Link> _links = new ArrayList<Link>(); _links.add(new Link(ServletUriComponentsBuilder
						.fromCurrentServletMapping().path("/")
						.build().toString(), "api")); _links.add(new Link(ServletUriComponentsBuilder
						.fromCurrentServletMapping().path("/directory")
						.build().toString(), "self")); Object filesLinksResource;
						filesLinksResource.setLinks(_links);
						filesLinksResource.setFiles(file1); 
						return filesLinksResource; 
	}
	
	
	
}
