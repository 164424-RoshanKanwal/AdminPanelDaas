package com.cfs.adminpaneldata.models;

import java.util.Arrays;
import java.util.Date;

public class AdminPanelPreviewAttributes {

	private String titleOfTraining;
	private String trainerName;
	private Date startDate;
	private Date endDate;
	private int daysSurveyAvailable;
	private String[] questions;
	private double ratings;
	private String suggestions;
	
	public AdminPanelPreviewAttributes() {
		
	}

	public AdminPanelPreviewAttributes(String titleOfTraining, String trainerName, Date startDate, Date endDate,
			int daysSurveyAvailable, String[] questions, double ratings, String suggestions) {
		super();
		this.titleOfTraining = titleOfTraining;
		this.trainerName = trainerName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.daysSurveyAvailable = daysSurveyAvailable;
		this.questions = questions;
		this.ratings = ratings;
		this.suggestions = suggestions;
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
		return questions;
	}
	public void setQuestions(String[] questions) {
		this.questions = questions;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	
	@Override
	public String toString() {
		return "AdminPanelPreviewAttributes [titleOfTraining=" + titleOfTraining + ", trainerName=" + trainerName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", daysSurveyAvailable=" + daysSurveyAvailable
				+ ", questions=" + Arrays.toString(questions) + ", ratings=" + ratings + ", suggestions=" + suggestions
				+ "]";
	}
	
	
	
}
