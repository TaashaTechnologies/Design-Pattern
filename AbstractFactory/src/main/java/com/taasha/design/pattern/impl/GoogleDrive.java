package com.taasha.design.pattern.impl;

import com.taasha.design.pattern.factories.Drive;

public class GoogleDrive implements Drive{

	@Override
	public String getImage() {
		
		return "https://google.drive/12as45.jpeg";
	}
}
