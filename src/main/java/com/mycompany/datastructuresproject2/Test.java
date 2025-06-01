/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructuresproject2;

import java.util.function.BinaryOperator;

/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) {
        Osama_Mudar_BinarySearchTree tree = new Osama_Mudar_BinarySearchTree();

        tree.insert("osama");
        tree.insert("mudar");
        tree.insert("ibrahim");
        tree.insert("Ahmet");

        Osama_Mudar_FileCounter f1 = new Osama_Mudar_FileCounter("File1");
        Osama_Mudar_FileCounter f2 = new Osama_Mudar_FileCounter("File2");

        tree.get("osama").counters.add(f1);
        tree.get("osama").counters.add(f2);
        
//        tree.printTree();
        System.out.println(tree.contains("mudar1"));

    }
}
