package com.manipal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit tests for the exercise
 */
public class ExerciseTest 
extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ExerciseTest( String testName )
    {
        super( testName );
    }

    /** 
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ExerciseTest.class );
    }

    /**
     * Simple Test :-)
     */
    public void testExerciseInputVsOutput()
    {
        String[] args = {"-1"};        
        String expectedResult = "-1! = 1" + "\n";

        ByteArrayOutputStream myOutStream = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(myOutStream));

        Exercise.main(args);
        
        String actualResult = myOutStream.toString();

        assertEquals(expectedResult, actualResult);
    }
}
