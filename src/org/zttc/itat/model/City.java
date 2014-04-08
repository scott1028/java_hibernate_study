package org.zttc.itat.model;

public class City {
	public int id;
	public String name;
	// public String CountryCode;
	// public String District;
	// public int Population;
	
	// 如果沒有定義存取介面會跳錯
	public int getid(){
		return this.id;
	}
	
	public void setid(int id){
		this.id=id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
//	
//	public String getCountryCode(){
//		return this.CountryCode;
//	}
//	
//	public void setCountryCode(String CountryCode){
//		this.CountryCode=CountryCode;
//	}
//	
//	public String getDistrict(){
//		return this.District;
//	}
//	
//	public void setDistrict(String District){
//		this.District=District;
//	}
//	
//	public int getPopulation(){
//		return this.Population;
//	}
//	
//	public void setPopulation(int Population){
//		this.Population=Population;
//	}
}
