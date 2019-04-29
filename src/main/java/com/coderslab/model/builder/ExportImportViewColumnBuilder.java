package com.coderslab.model.builder;

import com.coderslab.enums.ExportImportColumnType;
import com.coderslab.model.ExportImportViewColumn;

public class ExportImportViewColumnBuilder {

	private String columnTitle;
	private String columnNo;
	private ExportImportColumnType columnType;
	private String columnDescription;

	public ExportImportViewColumnBuilder setColumnTitle(String columnTitle) {
		this.columnTitle = columnTitle;
		return this;
	}

	public ExportImportViewColumnBuilder setColumnNo(String columnNo) {
		this.columnNo = columnNo;
		return this;
	}

	public ExportImportViewColumnBuilder setColumnType(ExportImportColumnType columnType) {
		this.columnType = columnType;
		return this;
	}

	public ExportImportViewColumnBuilder setColumnDescription(String columnDescription) {
		this.columnDescription = columnDescription;
		return this;
	}

	public ExportImportViewColumn build() {
		ExportImportViewColumn e = new ExportImportViewColumn();
		e.setColumnTitle(columnTitle);
		e.setColumnNo(columnNo);
		e.setColumnType(columnType);
		e.setColumnDescription(columnDescription);
		return e;
	}
}
