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
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Tauriac
 * @author Kevin Taylor
 */
public class MonthApp {

    public static void main(String[] args) {

        HashMap<Integer, String> monthMap = buildMonthMap();

        // print keys and values
        for (Integer i : monthMap.keySet()) {
            System.out.println(i + " = " + monthMap.get(i));
        }
    }

    private static ArrayList<Integer> buildMonthIndexList() {
        // create month object for index
        Month<Integer> monthIndex = new Month<>();

        // create array object for storing month indices
        ArrayList<Integer> monthIndexList = new ArrayList<>();

        // add values to index array monthIndicies
        for (int i = 1; i < 13; i++) {
            monthIndex.add(i);
            monthIndexList.add(monthIndex.get());
        }
        return monthIndexList;
    }

    private static ArrayList<String> buildMonthNameList() {
        // create month object for name
        Month<String> monthName = new Month<>();

        // create array object for storing month names
        ArrayList<String> monthNameList = new ArrayList<>();

        // add values to value array monthNameArray
        monthName.add("January");
        monthNameList.add(monthName.get());

        monthName.add("February");
        monthNameList.add(monthName.get());

        monthName.add("March");
        monthNameList.add(monthName.get());

        monthName.add("April");
        monthNameList.add(monthName.get());

        monthName.add("May");
        monthNameList.add(monthName.get());

        monthName.add("June");
        monthNameList.add(monthName.get());

        monthName.add("July");
        monthNameList.add(monthName.get());

        monthName.add("August");
        monthNameList.add(monthName.get());

        monthName.add("September");
        monthNameList.add(monthName.get());

        monthName.add("October");
        monthNameList.add(monthName.get());

        monthName.add("November");
        monthNameList.add(monthName.get());

        monthName.add("December");
        monthNameList.add(monthName.get());

        return monthNameList;
    }

    private static HashMap<Integer, String> buildMonthMap() {
        ArrayList<Integer> monthIndicies = buildMonthIndexList();
        ArrayList<String> monthNames = buildMonthNameList();

        // Create a HashMap object called monthMap
        HashMap<Integer, String> monthMap = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            monthMap.put(monthIndicies.get(i), monthNames.get(i));
        }

        return monthMap;
    }
}
