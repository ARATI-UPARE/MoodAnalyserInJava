package com.moodanalyzer;
import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalyserException;
import com.moodanalyser.MoodAnalyzerReflector;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzeTest {

    MoodAnalyser moodAnalyzer;

    //TC:1.1
    @Test
    public void givenSadMoodMessage_shouldReturnSad() {

        try {
            moodAnalyzer = new MoodAnalyser("I am in Sad mood");
            Assert.assertEquals("Sad",moodAnalyzer.analyzeMood());
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
    //TC:1.2
    @Test
    public void givenHappyMoodMessage_shouldReturnHappy() {

        try {
            moodAnalyzer = new MoodAnalyser("I am in Happy mood");
            Assert.assertEquals("Happy",moodAnalyzer.analyzeMood());
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }

    }
    //TC:2.1
    @Test
    public void givenNULLMessage_shouldReturnHappy() {

        try {
            moodAnalyzer = new MoodAnalyser("NULL");
            Assert.assertEquals("Happy",moodAnalyzer.analyzeMood());
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
    //TC:3.1
    @Test
    public void givenMood_whenNull_shouldReturnCustomMessage() {
        moodAnalyzer = new MoodAnalyser(null);
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NULL,e.type);
        }
    }
    //TC:3.2
    @Test
    public void givenMood_whenEmpty_shouldReturnCustomMessage() {
        moodAnalyzer = new MoodAnalyser("");
        try {
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.EMPTY,e.type);
        }
    }

    //TC:4.1
    @Test
    public void givenMoodAnalyzerClassUsingDefaultConstructor_whenProper_shouldReturnObject() {
        MoodAnalyser moodAnalyzerReflector = MoodAnalyzerReflector.createMoodAnalyserDefault();
        Assert.assertEquals(new MoodAnalyser(),moodAnalyzerReflector);
    }
    //TC:4.2
    @Test
    public void givenClassName_whenImproper_shouldReturnMoodAnalyzerException() {
        try {
            MoodAnalyzerReflector.getConstructor("com.moodanalyser.MoodAnalyser",Integer.class);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_METHOD,e.type);
        }
    }
    //TC:4.3
    @Test
    public void givenClassName_whenConstructorNotProper_shouldReturnMoodAnalyzerException() {

        try {
            MoodAnalyzerReflector.getConstructor("com.moodanalyser.MoodAnalyzer",String.class);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NO_SUCH_CLASS,e.type);
        }
    }
}
