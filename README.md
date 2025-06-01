# Java BST-Based Search Engine

This project is a miniature search engine built using Java that parses and indexes a set of HTML files using a Binary Search Tree (BST). Designed as a data structures coursework project, it demonstrates tree traversal, file parsing, and search operations.

## Project Context
- Course: Data Structures
- Year: 2024–2025
- Team: Mudar Shawakh & Osama Dervisoglu

## Features
- Parses multiple HTML files
- Ignores stop words via a customizable ignore list
- Indexes keywords using a Binary Search Tree
- Allows keyword search across all files
- Outputs matching documents

## Tech Stack
- Java 8+
- Maven
- Basic File I/O

## How It Works
1. Parses `.html` files in `HTML Files/`
2. Removes stop words from `ignoreList.txt`
3. Indexes keywords into a custom `BinarySearchTree`
4. Accepts user input and returns matching documents

## How to Run
`bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.mycompany.datastructuresproject2.Main"


## File Structure
src/
├── Main.java
├── Osama_Mudar_BinarySearchTree.java
HTML Files/
├── file1.html ... file10.html
├── ignoreList.txt

## Report
See MudarShawakh_OsamaDervisoglu_DAtaProject.pdf for full documentation.

## Notes
This is a console-based academic implementation, not a production-grade engine.

Emphasis is on BST logic, not web crawling or advanced ranking.

