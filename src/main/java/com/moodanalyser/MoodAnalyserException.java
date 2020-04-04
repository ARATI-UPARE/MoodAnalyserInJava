package com.moodanalyser;

public class MoodAnalyserException extends Exception {
    public enum ExceptionType{
        NULL,EMPTY
    }
    public ExceptionType type;

    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
