/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.genericsmonthproject;

/**
 *
 * @author ipiesh
 * @param <T>
 */
public class Month<T> { 
    
    private T month; 

    public Month() {

	month = null;
    }
    
    
    public void add(T month){
        
	this.month = month;
    }; 
    
    public T get(){
	
	return month;
    }  
}; 