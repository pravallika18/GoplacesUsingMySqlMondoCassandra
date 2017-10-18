package com.StackRoute.Goplaces.domain;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.datastax.driver.core.DataType;


@Table
public class Places {
	
	@PrimaryKey
	private int id;
	private String name;
	private String Address;
	private String Imgurl;
	public Places() {
		
	}
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getImgurl() {
		return Imgurl;
	}
	public void setImgurl(String imgurl) {
		Imgurl = imgurl;
	}
	public Places(int id, String name, String address, String imgurl) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		Imgurl = imgurl;
	}
	
	

}