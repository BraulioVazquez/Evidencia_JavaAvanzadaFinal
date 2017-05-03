package me.jmll.utm.rest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import me.jmll.utm.model.FileLinkListResource;
import me.jmll.utm.model.NotificationLinkListResource;
import me.jmll.utm.rest.exception.ResourceNotFoundException;
import me.jmll.utm.service.NotificationService;
import me.jmll.utm.service.UserService;

public class NotificacitonRest {
	@Autowired
	NotificationService notificationService;

	@RequestMapping(value = "file", 
			method = RequestMethod.OPTIONS,
			produces = { "application/xml", "text/xml" })
	@ResponseBody
	public ResponseEntity<String> showOptions (RequesEntity<String> requestEntity) {
		
		ResponseEntity<String> responseEntity = new ResponseEntity<> ("my response Body", HttpStatus.ok);
		
		HashMap<HttpMethod, String> response1 = new HashMap<>();
	}

	
	@RequestMapping(value = "file", 
			method = RequestMethod.GET, 
			produces = { "application/xml", "text/json" })
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	
	public Map<String, Object> getNotificationsJSON() { 
		List<Link> _links = new ArrayList<Link>(); _links.add(new Link(ServletUriComponentsBuilder
				.fromCurrentServletMapping().path("/")
				.build().toString(), "api")); _links.add(new Link(ServletUriComponentsBuilder
				.fromCurrentServletMapping().path("/notify/")
				.build().toString(), "self"));
				Map<String, Object> response = new Hashtable<>(2); response.put("_links", _links);
				response.put("data", notifications);
				return response;
	}

	@RequestMapping(value = "file", 
			method = RequestMethod.POST,
			produces = { "application/xml", "text/xml" })
	@ResponseBody
	@ResponseStatus(HttpStatus.ACCEPTED)
	
	public ResponseEntity<String> Notify (String subject, String message, String toAddress, String ccAddress) {
		this.notificationService.notify(subject, message, toAddress, ccAddress);
		ResponseEntity<String> responseEntity = new ResponseEntity<> ("my response Body", HttpStatus.ok);
	}
	
	
	public NotificationLinkListResource getNotificationsXML() {

List<Link> _links = new ArrayList<Link>(); 
_links.add(new Link(ServletUriComponentsBuilder.fromCurrentServletMapping().path("/");
build().toString(), "api")); 
_links.add(new Link(ServletUriComponentsBuilder.fromCurrentServletMapping().path("/notify/");
build().toString(), "self")); 
notificationLinksResource.setLinks(_links); notificationLinksResource.setNotifications(notifications);
 return notificationLinksResource;
		
		
		//HACE FALTA 
}
	
}
