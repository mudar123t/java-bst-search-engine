/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructuresproject2;

/**
 *
 * @author ASUS
 */
public class Osama_Mudar_FileCounter {
    String fileName;
    int counter;
    
    public Osama_Mudar_FileCounter(String fileName){
        this.counter = 1;
        this.fileName = fileName;
              
    }
    
    public static boolean fileExist (String value, Osama_Mudar_LinkedList<Osama_Mudar_FileCounter> list){
        for (int i = 0; i < list.length(); i++) {
            if (value.equals(list.get(i).fileName)) {
                return true;
            }
        }
        return false;
    }
    
    public static Osama_Mudar_FileCounter getFileCounter (String value, Osama_Mudar_LinkedList<Osama_Mudar_FileCounter> list){
        if (list.isEmpty()) {
            System.out.println("The list is Empty.");
        }
        for (int i = 0; i < list.length(); i++) {
            if (value.equals(list.get(i).fileName)) {
                return list.get(i);
            }
        }
        System.out.println("The value you are searching does NOT exist in this list");
        return null;
    }
    
    
}
