package com.coderslab.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExportImportView {

	private String moduleName;
	private String pageTitle;
	private List<ExportImportViewColumn> moduleColumns;
	
	private boolean showDownloadTab;
	private boolean showImportTab;
	private String downloadTabName;
	private String importTabName;

	private boolean showFileDelimiter;
	private boolean showIgnoreFirstRow;
	private boolean showUpdateExistingRecord;
	private boolean showDownloadAll;
	private boolean showNotes;
	private List<String> notes;
}
