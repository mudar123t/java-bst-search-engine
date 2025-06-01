/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructuresproject2;

/**
 *
 * @author ASUS
 */
public class Osama_Mudar_TreeNode {

    String Data;
    Osama_Mudar_TreeNode left;
    Osama_Mudar_TreeNode right;
    Osama_Mudar_LinkedList<Osama_Mudar_FileCounter> counters;

    public Osama_Mudar_TreeNode() {
        
    }
    
    public Osama_Mudar_TreeNode(String value) {
        this.Data = value;
        this.left = null;
        this.right = null;
        this.counters = new Osama_Mudar_LinkedList();
    }

    void printCounters() {
        System.out.print("[");
        for (int i = 0; i < counters.length(); i++) {
            if (i == counters.length() - 1) {
                System.out.print(counters.get(i).fileName + " : " + counters.get(i).counter);
            } else {
                System.out.print(counters.get(i).fileName + " : " + counters.get(i).counter + " , ");
            }
        }
        System.out.println("]");
    }
    
    String getCounters(){
        String list = "";
        list += "[";
        for (int i = 0; i < counters.length(); i++) {
            if (i == counters.length() - 1) {
                list += (counters.get(i).fileName + " : " + counters.get(i).counter);
            } else {
                list += (counters.get(i).fileName + " : " + counters.get(i).counter + " , ");
            }
        }
        list += ("]");
        
        return list;
    }

}
