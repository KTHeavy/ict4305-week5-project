/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.genericsmonthproject;

/**
 *
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Tauriac
 * @author Kevin Taylor
 * @param <T>
 */

public class Month<T> { 
    
    private T month;
    
    /**
     * method for adding month values
     * @param month
     */
    public void add(T month){
        
	this.month = month;
    }; 
    
    /**
     * method for returning month values
     * @return
     */
    public T get(){
	
	return month;
    }  
}; 