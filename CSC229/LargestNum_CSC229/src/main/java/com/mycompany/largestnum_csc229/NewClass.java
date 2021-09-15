/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.largestnum_csc229;

/**
 *
 * @author maazh
 */
public class NewClass {
    
    static int largestNum(int array[], int size){
        int num = Integer.MIN_VALUE;
        int i = 0;
        
        while (i<size){
            if(array[i] > num){
                num = array[i];
            }
            i++;
        }
        return num;
    }
    
    public static void main(String[] args) {
        
        NewClass nc = new NewClass();
        
        int array[] =  {1, 2, 3, 44, 664};
                
        int num = nc.largestNum(array, array.length);
        
        System.out.println(num);
        
    }
}
