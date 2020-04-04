package com.moodanalyzer;
import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalyserException;
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
}
