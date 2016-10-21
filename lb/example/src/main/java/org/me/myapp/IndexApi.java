package org.me.myapp;

import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexApi {
	
	@Autowired
	private Environment environment;

	@GetMapping("/server/name")
	public String getName() {
		return environment.getProperty("server.name", "myserver");
	}
	
	@GetMapping("/server/env")
	public Map<String, String> getEnvironment() {
		return System.getenv();
	}
	
	@GetMapping("/server/properties")
	public Properties getProperties() {
		return System.getProperties();
	}
	
}
