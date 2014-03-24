package com.pwp.vo;

import java.io.Serializable;

/**
 * 日程的VO类
 * @author jack_peng
 *
 */
public class ScheduleVO implements Serializable{

	private int scheduleID;
	private int scheduleTypeID;
	private int remindID;
	private String scheduleContent;
	private String scheduleDate;
	private String time;
	private long alartime;
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public ScheduleVO(){}
	
	public ScheduleVO(int scheduleID,int scheduleTypeID,int remindID,String scheduleContent,String scheduleDate,String time,Long alartime){
		this.scheduleID = scheduleID;
		this.scheduleTypeID = scheduleTypeID;
		this.remindID = remindID;
		this.scheduleContent = scheduleContent;
		this.scheduleDate = scheduleDate;
		this.time=time;
		this.alartime=alartime;
	}
	
	public long getAlartime() {
		return alartime;
	}

	public void setAlartime(long alartime) {
		this.alartime = alartime;
	}

	public int getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}
	public int getScheduleTypeID() {
		return scheduleTypeID;
	}
	public void setScheduleTypeID(int scheduleTypeID) {
		this.scheduleTypeID = scheduleTypeID;
	}
	public int getRemindID() {
		return remindID;
	}
	public void setRemindID(int remindID) {
		this.remindID = remindID;
	}
	public String getScheduleContent() {
		return scheduleContent;
	}
	public void setScheduleContent(String scheduleContent) {
		this.scheduleContent = scheduleContent;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	
}
