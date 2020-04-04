package com.moodanalyser;

public class MoodAnalyserException extends Exception {
    public enum ExceptionType{
        NULL,EMPTY,NO_SUCH_CLASS,NO_SUCH_METHOD
    }
    public ExceptionType type;

    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
    public MoodAnalyserException(String message) {

        super(message);
    }
}
