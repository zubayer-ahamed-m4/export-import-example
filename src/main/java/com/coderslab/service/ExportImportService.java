package com.coderslab.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface ExportImportService {

	/**
	 * DISPLAY EXPORT IMPORT PAGE FOR {MODULE}
	 * 
	 * @return {@link String}
	 */
	public String showExportImportModule();

	public List<String> getHeaders();

}
