package me.jmll.utm.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OptionsDoc {

	private HashMap<HttpMethod, String> methods = new HashMap<HttpMethod, String>;

	@XmlElement(name = "link")
	public OptionsDoc() {
		return methods;
	}
	
}
