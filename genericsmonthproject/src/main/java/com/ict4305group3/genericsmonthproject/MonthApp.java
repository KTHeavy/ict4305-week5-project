/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.genericsmonthproject;

/**
 *
 * @author ipiesh
 */
public class MonthApp {
    public static void main(String[] args) {
        // define
        Month<Integer> monthIndex = null;
        Month<String> monthName = null;
        // adding values
        monthIndex.add(new Integer(12));
        monthName.add(new String("December"));
    }
}
