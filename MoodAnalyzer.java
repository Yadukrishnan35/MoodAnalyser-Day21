package com.moodAnalyzer;

public class MoodAnalyzer {
		
	final String SAD = "Sad";
	final String HAPPY = "Happy";
	
	public String moodAnalyzer(String message) {
		
		if(message.contains("SAD")) {
			
			return SAD;
		}
		
		else {
			
			return HAPPY;
		}
	}

	public static void main(String[] args) {
		
		MoodAnalyzer mood = new MoodAnalyzer();
		String message = "Im SAD";
		
		System.out.println(mood.moodAnalyzer(message) + "Mood");
	}
}
