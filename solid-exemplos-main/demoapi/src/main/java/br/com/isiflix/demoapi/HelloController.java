package br.com.isiflix.demoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private Environment environment;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello API - value:" + environment.getProperty("item.value");
	}

}
