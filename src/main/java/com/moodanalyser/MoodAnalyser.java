package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message){
        this.message=message;
    }

    public String analyzeMood()throws MoodAnalyserException{
        if(message.contains("Sad"))
        {
            return "Sad";
        }
        else {
            return "Happy";
        }
    }
}
