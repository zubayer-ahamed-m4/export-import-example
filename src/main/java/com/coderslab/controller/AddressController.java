package com.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/address")
public class AddressController {

	@GetMapping
	public String loadAddressImportExportPage() {
		log.info("Loading export import page for : {}");
		return "address";
	}

}
