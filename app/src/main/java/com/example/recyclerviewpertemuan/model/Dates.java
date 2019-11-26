package com.example.recyclerviewpertemuan.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Dates implements Serializable {

	@SerializedName("maximum")
	private String maximum;

	@SerializedName("minimum")
	private String minimum;

	public String getMaximum(){
		return maximum;
	}

	public String getMinimum(){
		return minimum;
	}
}