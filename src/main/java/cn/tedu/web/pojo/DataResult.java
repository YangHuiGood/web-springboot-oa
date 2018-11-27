package cn.tedu.web.pojo;

import java.io.Serializable;

/**
 * 统计图数据对象封装
 * 
 * @author Join Snow
 *
 */
public class DataResult implements Serializable{
	private String date;
	private String time;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public DataResult(String date, String time) {
		this.date = date;
		this.time = time;
	}

	public DataResult() {
		
	}
	
	

}
