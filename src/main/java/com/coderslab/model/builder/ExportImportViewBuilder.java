package com.coderslab.model.builder;

import java.util.List;

import com.coderslab.model.ExportImportView;
import com.coderslab.model.ExportImportViewColumn;

public class ExportImportViewBuilder {

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

	public ExportImportViewBuilder setModuleName(String moduleName) {
		this.moduleName = moduleName;
		return this;
	}

	public ExportImportViewBuilder setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
		return this;
	}

	public ExportImportViewBuilder setModuleColumns(List<ExportImportViewColumn> moduleColumns) {
		this.moduleColumns = moduleColumns;
		return this;
	}

	public ExportImportViewBuilder setShowDownloadTab(boolean showDownloadTab) {
		this.showDownloadTab = showDownloadTab;
		return this;
	}

	public ExportImportViewBuilder setShowImportTab(boolean showImportTab) {
		this.showImportTab = showImportTab;
		return this;
	}

	public ExportImportViewBuilder setDownloadTabName(String downloadTabName) {
		this.downloadTabName = downloadTabName;
		return this;
	}

	public ExportImportViewBuilder setImportTabName(String importTabName) {
		this.importTabName = importTabName;
		return this;
	}

	public ExportImportViewBuilder setShowFileDelimiter(boolean showFileDelimiter) {
		this.showFileDelimiter = showFileDelimiter;
		return this;
	}

	public ExportImportViewBuilder setShowIgnoreFirstRow(boolean showIgnoreFirstRow) {
		this.showIgnoreFirstRow = showIgnoreFirstRow;
		return this;
	}

	public ExportImportViewBuilder setShowUpdateExistingRecord(boolean showUpdateExistingRecord) {
		this.showUpdateExistingRecord = showUpdateExistingRecord;
		return this;
	}

	public ExportImportViewBuilder setShowDownloadAll(boolean showDownloadAll) {
		this.showDownloadAll = showDownloadAll;
		return this;
	}

	public ExportImportViewBuilder setShowNotes(boolean showNotes) {
		this.showNotes = showNotes;
		return this;
	}

	public ExportImportViewBuilder setNotes(List<String> notes) {
		this.notes = notes;
		return this;
	}

	public ExportImportView build() {
		ExportImportView e = new ExportImportView();
		e.setModuleName(this.moduleName);
		e.setPageTitle(this.pageTitle);
		e.setModuleColumns(moduleColumns);
		e.setShowDownloadTab(showDownloadTab);
		e.setShowImportTab(showImportTab);
		e.setDownloadTabName(downloadTabName);
		e.setImportTabName(importTabName);
		e.setShowFileDelimiter(showFileDelimiter);
		e.setShowIgnoreFirstRow(showIgnoreFirstRow);
		e.setShowUpdateExistingRecord(showUpdateExistingRecord);
		e.setShowDownloadAll(showDownloadAll);
		e.setShowNotes(showNotes);
		e.setNotes(notes);
		return e;
	}
}
