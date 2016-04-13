package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@RequestMapping("/hello")
	public Map<String,Object> hello() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("id", UUID.randomUUID().toString());
	    model.put("text", "Hello by MyRestController");
	    return model;
	}

}
