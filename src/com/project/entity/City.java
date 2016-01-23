package com.project.entity;

   /**
    * city 实体类
    * Thu Jan 21 13:45:16 CST 2016 chenww
    */ 


public class City{

	private int cityid;

	private String cityname;

	private int parentid;

	public void setCityid(int cityid){
		this.cityid=cityid;

	}
	public int getCityid(){
		return cityid;

	}
	public void setCityname(String cityname){
		this.cityname=cityname;

	}
	public String getCityname(){
		return cityname;

	}
	public void setParentid(int parentid){
		this.parentid=parentid;

	}
	public int getParentid(){
		return parentid;

	}
}

