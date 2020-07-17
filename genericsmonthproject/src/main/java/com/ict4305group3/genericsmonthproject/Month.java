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
 * @author Dawn Touriac
 * @author Kevin Taylor
 * @param <T>
 */

public class Month<T> { 
    
    private T month; 

    // create constructor
    public Month() {

	month = null;
    }
    
    // create method for adding values
    public void add(T month){
        
	this.month = month;
    }; 
    
    // create method for returning values
    public T get(){
	
	return month;
    }  
}; 