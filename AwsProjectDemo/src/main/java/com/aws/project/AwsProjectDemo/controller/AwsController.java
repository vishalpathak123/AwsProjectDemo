package com.aws.project.AwsProjectDemo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author VISHAL KUMAR
 *
 */
@RestController
public class AwsController {

	@RequestMapping("/ok")
	public String ok() {
		return "OK";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String greeting(@RequestParam(name = "name", required = true) String name) {
		System.out.println("********Starting AWS Application********");
		System.out.println("Name : "+name);
		StringBuilder result = new StringBuilder();
		if (StringUtils.isEmpty(name)) {
			result.append("Please Enter Valid Name.");
		} else {
			result.append("Hello ").append(name).append(" ! Welcome to my World.");
		}
		System.out.println("***********Ending AWS Application***********");
		return result.toString();
	}

}
