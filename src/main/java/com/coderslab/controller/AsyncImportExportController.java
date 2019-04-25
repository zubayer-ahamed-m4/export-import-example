package com.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coderslab.service.ExportImportService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/asyncimportexport")
public class AsyncImportExportController {

	@Autowired ApplicationContext applicationContext;

	@RequestMapping("/{module}")
	public String showExportImportModule(@PathVariable String module, Model model) {
		ExportImportService exServiceImpl = getService(module);
		if (exServiceImpl == null) {
			return "redirect:/";
		}
		return exServiceImpl.showExportImportModule();
	}

	private ExportImportService getService(String module) {
		if(module == null || module.length() < 1) return null;

		ExportImportService exServiceImpl = null;
		try {
			exServiceImpl = (ExportImportService) applicationContext.getBean(module.concat("Service"));
		} catch (Exception e) {
			log.error("Error is : {}", e.getMessage());
		}
		return exServiceImpl;
	}
}
