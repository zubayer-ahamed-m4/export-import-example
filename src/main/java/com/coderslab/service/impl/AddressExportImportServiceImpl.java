package com.coderslab.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coderslab.service.ExportImportService;

@Service("addressexportimportService")
public class AddressExportImportServiceImpl extends AbstractExportImport implements ExportImportService {

	@Override
	public String showExportImportModule() {
		return "asyncimportexport";
	}

	@Override
	public List<String> getHeaders() {
		return null;
	}

}
