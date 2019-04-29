package com.coderslab.model;

import com.coderslab.enums.ExportImportColumnType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExportImportViewColumn {

	private String columnTitle;
	private String columnNo;
	private ExportImportColumnType columnType;
	private String columnDescription;

}
