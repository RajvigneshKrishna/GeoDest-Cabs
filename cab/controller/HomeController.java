package com.transport.cab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="/aboutUs")
	public String aboutUs() {
		return "aboutUs";
	}
	
	@RequestMapping(value="/services")
	public String services() {
		return "services";
	}
	
	@RequestMapping(value="/carsList")
	public String carsList() {
		return "carsList";
	}
	
	@RequestMapping(value="/contactUs")
	public String contactUs() {
		return "contactUs";
	}
}
