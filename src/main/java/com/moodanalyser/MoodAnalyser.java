package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message){
        this.message=message;
    }

    public String analyzeMood()throws MoodAnalyserException  {
        try {
            if(message.isEmpty()){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,"Message is Empty ");
            }
            if (message.contains("Sad")) {
                return "Sad";
            }return "Happy";
        }catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL,"Null Message");
        }
    }
}
