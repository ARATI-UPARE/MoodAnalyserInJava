package com.moodanalyser;

import java.util.Objects;

public class MoodAnalyser {
    private String message;

    // DEFAULT CONSTRUCTOR
    public MoodAnalyser() {
    }

    // PARAMETRISED CONSTRUCTOR
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

    @Override
    public boolean equals(Object obj) {
        if (this  == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())return false;
        MoodAnalyser that=(MoodAnalyser )obj;
        return Objects.equals(message,that.message);
    }
}
