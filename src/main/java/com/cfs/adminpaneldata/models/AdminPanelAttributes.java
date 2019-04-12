package com.cfs.adminpaneldata.models;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="FeedbackForm")
public class AdminPanelAttributes {

	@Id
	private String formId;
	
	private String titleOfTraining;
	private String trainerName;
	private Date startDate;
	private Date endDate;
	private int daysSurveyAvailable;
	private String[] questions;
	
	
	String pattern = "dd MMMMM yyyy";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
	public AdminPanelAttributes() {
			
	}
	
	public AdminPanelAttributes(String titleOfTraining, String trainerName, Date startDate, Date endDate,
			int daysSurveyAvailable, String... questions) {
		super();
		

		String customDate = simpleDateFormat.format(startDate);
		
		this.formId = titleOfTraining + " " + customDate.toString();
		this.titleOfTraining = titleOfTraining;
		this.trainerName = trainerName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.daysSurveyAvailable = daysSurveyAvailable;
		this.questions = questions;
	}
	
	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getTitleOfTraining() {
		return titleOfTraining;
	}
	public void setTitleOfTraining(String titleOfTraining) {
		this.titleOfTraining = titleOfTraining;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getDaysSurveyAvailable() {
		return daysSurveyAvailable;
	}
	public void setDaysSurveyAvailable(int daysSurveyAvailable) {
		this.daysSurveyAvailable = daysSurveyAvailable;
	}
	public String[] getQuestions() {
	//int count = questions.length;
		return questions;
		
	}
	public void setQuestions(String[] questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "AdminPanelAttributes [titleOfTraining=" + titleOfTraining + ", trainerName=" + trainerName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", daysSurveyAvailable=" + daysSurveyAvailable
				+ ", questions=" + Arrays.toString(questions) + "]";
	}
	
	
	
}
