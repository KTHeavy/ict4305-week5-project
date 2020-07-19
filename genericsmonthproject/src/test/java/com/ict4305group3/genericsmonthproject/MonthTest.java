/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.genericsmonthproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Touriac
 * @author Kevin Taylor
 */
public class MonthTest {
    
    Month<Integer> monthInt = new Month<>();
    Month<String> monthString = new Month<>();

    public MonthTest() {
        //Test String Month
        String expectedMonthStr = "January";
        monthString.add("January");
        String actualMonthStr = monthString.get();
        assertEquals(expectedMonthStr, actualMonthStr);
        
        //Test Int Month
        int expectedMonthInt = 1;
        monthInt.add(1);
        int actualMonthInt = monthInt.get();
        assertEquals(expectedMonthInt, actualMonthInt);
    }

    /**
     * Test of get method, of class Month.
     */
    @Test
    public void testGet() {
}
    
}
