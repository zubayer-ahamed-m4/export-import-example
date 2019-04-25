package com.coderslab.service.impl;

import com.coderslab.service.ExportImportService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractExportImport implements ExportImportService {

	@Override
	public String showExportImportModule() {
		return "redirect:/";
	}


}
