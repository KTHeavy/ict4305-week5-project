/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.genericsmonthproject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ipiesh
 */
public class MonthApp {
    public static void main(String[] args) {
        // define
        Month<Integer> monthIndex = new Month<>();
        Month<String> monthName = new Month<>();
	ArrayList<Integer> monthIndexArray = new ArrayList<>();
	ArrayList<String> monthNameArray = new ArrayList<>();
        // adding values
        
	for (int i = 1; i < 13; i++) {
	    monthIndex.add(i);
	    monthIndexArray.add(monthIndex.get());
	}

        monthName.add("January");
	monthNameArray.add(monthName.get());

	monthName.add("February");
	monthNameArray.add(monthName.get());

	monthName.add("March");
	monthNameArray.add(monthName.get());

	monthName.add("April");
	monthNameArray.add(monthName.get());

	monthName.add("May");
	monthNameArray.add(monthName.get());

	monthName.add("June");
	monthNameArray.add(monthName.get());

	monthName.add("July");
	monthNameArray.add(monthName.get());

	monthName.add("August");
	monthNameArray.add(monthName.get());

	monthName.add("September");
	monthNameArray.add(monthName.get());

	monthName.add("October");
	monthNameArray.add(monthName.get());

	monthName.add("November");
	monthNameArray.add(monthName.get());

	monthName.add("December");
	monthNameArray.add(monthName.get());
	
	HashMap<Integer, String> monthMap = new HashMap<>();
	for (int i = 0; i < 12; i++) {
	    monthMap.put(monthIndexArray.get(i), monthNameArray.get(i));

	}
	for (Integer i : monthMap.keySet()) {
	    System.out.println( i + " = " + monthMap.get(i));
	}
    }
}
