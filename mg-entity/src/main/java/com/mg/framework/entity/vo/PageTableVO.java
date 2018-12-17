package com.mg.framework.entity.vo;

import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单形式的分页组件
 */
public class PageTableVO extends MgPageable {
	
	private static final long serialVersionUID = -2332973656118325329L;

	private List<TableHeaderCellVO> columns = new ArrayList<>();
	/**
	 * 数据集合
	 */
	private List<?> rowData;
	/**
	 * 扩展信息
	 */
	private Object extendData;

	public PageTableVO() {
	}
	public PageTableVO(Page page,PageTableVO vo) {
		if(page!=null){
			setRowData(page.getContent());
			setTotalCount(page.getTotalElements());
		}
		if(vo!=null){
			setPageNo(vo.getPageNo());
			setPageSize(vo.getPageSize());
		}
	}
	public PageTableVO(Page page,MgPageable vo) {
		if(page!=null){
			setRowData(page.getContent());
			setTotalCount(page.getTotalElements());
		}
		if(vo!=null){
			setPageNo(vo.getPageNo());
			setPageSize(vo.getPageSize());
		}
	}
	public List<?> getRowData() {
		return rowData;
	}

	public void setRowData(List<?> rowData) {
		this.rowData = rowData;
	}

	public Object getExtendData() {
		return extendData;
	}

	public void setExtendData(Object extendData) {
		this.extendData = extendData;
	}

	public List<TableHeaderCellVO> getColumns() {
		return columns;
	}

	public void setColumns(List<TableHeaderCellVO> columns) {
		this.columns = columns;
	}
}
