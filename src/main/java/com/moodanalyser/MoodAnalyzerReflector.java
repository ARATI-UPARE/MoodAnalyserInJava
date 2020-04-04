package com.moodanalyser;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyzerReflector {
    //Reflection For Default Constructor
    public static MoodAnalyser  createMoodAnalyserDefault(){
        try {
            Constructor constructor = Class.forName("com.moodanalyser.MoodAnalyser").getConstructor();
            MoodAnalyser moodAnalyzer = (MoodAnalyser) constructor.newInstance();
            return  moodAnalyzer;
        } catch (ClassNotFoundException | NoSuchMethodException e ) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  static  Constructor<?> getConstructor(String className,Class constructor) throws MoodAnalyserException {
        try {
            Class<?> moodAnalyzer = Class.forName(className);
            return  moodAnalyzer.getConstructor(constructor);
        } catch (ClassNotFoundException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_SUCH_CLASS,e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NO_SUCH_METHOD,e.getMessage());
        }
    }
}
