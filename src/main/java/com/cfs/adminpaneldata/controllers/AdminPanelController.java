package com.cfs.adminpaneldata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cfs.adminpaneldata.models.AdminPanelAttributes;
import com.cfs.adminpaneldata.models.AdminPanelPreviewAttributes;

@RestController
public class AdminPanelController {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@RequestMapping("/add-survey")
	public String addSurvey(@RequestBody AdminPanelAttributes adminPanelAttributes) {

		adminPanelAttributes.setFormId(adminPanelAttributes.getFormId());
		mongoTemplate.insert(adminPanelAttributes);
	
	return "Successfully Inserted";
	}
	
	@GetMapping("/preview")
	public AdminPanelPreviewAttributes sendPreview() {
	
	//future implementation	
	return null;
	}
	
}
