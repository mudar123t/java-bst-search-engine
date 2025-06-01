/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructuresproject2;

import java.io.BufferedReader;
import org.jsoup.Jsoup;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.jsoup.nodes.Document;

/**
 *
 * @author ASUS
 */
public class Main {

    private static Osama_Mudar_LinkedList<String> readIgnoreWords(String filePath) throws IOException {
        Osama_Mudar_LinkedList<String> ignoreWords = new Osama_Mudar_LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ignoreWords.add(line.trim());
            }
        }
        return ignoreWords;
    }

    public static void main(String[] args) {

        String ignoreListFilePath = "C:/Users/ASUS/Documents/NetBeansProjects/DataStructuresProject2/HTML FIles/ignoreList.txt";

        Osama_Mudar_BinarySearchTree tree = new Osama_Mudar_BinarySearchTree();
        int counter = 1;
        for (int i = 1; i <= 10; i++) {
            String f = "file" + i;
            String filePath = "C:/Users/ASUS/Documents/NetBeansProjects/DataStructuresProject2/HTML FIles/" + f + ".html";
            try {
                Osama_Mudar_LinkedList<String> ignoreWords = readIgnoreWords(ignoreListFilePath);

                File input = new File(filePath);
                Document document = Jsoup.parse(input, "UTF-8");

                String allText = document.getElementsByTag("text").text();

                Scanner s = new Scanner(allText);

                while (s.hasNext()) {
                    String word = s.next();
                    if (!ignoreWords.contains(word)) {
//                        wordList.add(word);
                        if (tree.contains(word)) {
                            if (Osama_Mudar_FileCounter.fileExist(f, tree.get(word).counters)) { // if we are increasing the counter of the file we are in 
                                Osama_Mudar_FileCounter.getFileCounter(f, tree.get(word).counters).counter++;   //tree.get(word).counters.getFileCounter(f).counter++;
                            } else { // if we are creating new file counter for an existing word 
                                Osama_Mudar_FileCounter fc = new Osama_Mudar_FileCounter(f);
                                tree.get(word).counters.add(fc);
                            }
                        } else { // if we are inserting a completly new word 
                            tree.insert(word);
                            Osama_Mudar_FileCounter fc = new Osama_Mudar_FileCounter(f);
                            tree.get(word).counters.add(fc);
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }
//        tree.printTree();
    }
}
