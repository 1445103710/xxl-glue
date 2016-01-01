package com.xxl.core.model;

import java.util.Date;

/**
 * @author xuxueli 2016-1-1 19:18:58
 */
public class CodeLog {
	
	private int id;
	private String name;
	private String source;
	private String remark;
	private Date addTime;
	private Date updateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return "CodeLog [id=" + id + ", name=" + name + ", source=" + source + ", remark=" + remark + ", addTime="
				+ addTime + ", updateTime=" + updateTime + "]";
	}
	
}
