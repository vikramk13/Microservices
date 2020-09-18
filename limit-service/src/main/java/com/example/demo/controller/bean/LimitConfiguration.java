package com.example.demo.controller.bean;

public class LimitConfiguration {
	
	 private int mimimum ;
	 private int maximum;
	
	
	
	public LimitConfiguration() {
		
		// TODO Auto-generated constructor stub
	}



	public LimitConfiguration(int mimimum, int maximum) {
		super();
		this.mimimum = mimimum;
		this.maximum = maximum;
	}



	public int getMimimum() {
		return mimimum;
	}



	

	public int getMaximum() {
		return maximum;
	}



	

}
