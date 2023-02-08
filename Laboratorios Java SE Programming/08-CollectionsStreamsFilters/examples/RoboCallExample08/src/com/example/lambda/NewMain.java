/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.lambda;

/**
 *
 * @author IBM
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person.Builder pb = new Person.Builder();
        pb.address("").age(0).state("");
        Person p = pb.build(String n, String a);
        

    }
    
}
