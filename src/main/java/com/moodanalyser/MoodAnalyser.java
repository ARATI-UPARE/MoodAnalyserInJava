package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message){
        this.message=message;
    }

    public String analyzeMood()throws MoodAnalyserException  {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            }return "Happy";
        }catch (NullPointerException e){
            e.printStackTrace();
            return "Happy";
        }
    }
}
