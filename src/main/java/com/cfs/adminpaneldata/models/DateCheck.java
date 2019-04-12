package com.cfs.adminpaneldata.models;

import java.util.Date;

public class DateCheck {

	public static void main(String[] args) {
		AdminPanelAttributes ad = new AdminPanelAttributes("Hello India", "", new Date(), new Date(), 3, "r", "rr");
		System.out.println(ad.getQuestions());
		System.out.println(ad.getFormId());
	}	
}
