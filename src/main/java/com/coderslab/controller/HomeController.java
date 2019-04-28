/**
 * 
 */
package com.coderslab.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zubay
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String loadHomePage() {
		return "index";
	}

	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}
}
