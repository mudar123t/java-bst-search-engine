/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructuresproject2;

/**
 *
 * @author ASUS
 */
public class Osama_Mudar_LinkedList<M> {

    Osama_Mudar_ListNode<M> head;
    private int size;

    void add(M data) { // adds to the end of the list
        Osama_Mudar_ListNode<M> newNode = new Osama_Mudar_ListNode<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Osama_Mudar_ListNode<M> temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public M get(int index) { // get by index 
        if (index > size) {
            System.out.println("Index out of bounds");
            return null;
        } else {
            Osama_Mudar_ListNode<M> temp = head;
            if (isEmpty()) {
                return null;
            }
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public Osama_Mudar_FileCounter getFileCounter(String value) { //get by value
        if (isEmpty()) {
            System.out.println("The list is Empty.");
        }
        for (int i = 0; i < size; i++) {
            if (value.equals((Osama_Mudar_FileCounter)this.get(i))) {
                return (Osama_Mudar_FileCounter)this.get(i);
            }
        }
        System.out.println("The value you are searching does NOT exist in this list");
        return null;
    }
    
    
    public int getIndexByValue(String value){
        Osama_Mudar_ListNode<M> temp = head;
        if (isEmpty()) {
            return -1;
        }
        int i;
        for (i = 0; i < size; i++) {
            if (value.equals(temp.data)) {
                return i;
            }
            temp = temp.next;
        }
        return i;
    }

    public void set(int index, M value) {
        Osama_Mudar_ListNode<M> temp = head;
        if (index >= this.length()) {
            System.out.println("index out of bounds");
            return;
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data = value;
    }

    public boolean contains(M value) {
        boolean check = false;
        if (isEmpty()) {
            return check;
        } else {
            for (int i = 0; i < size; i++) {
                if (this.get(i) != null) {
                    if (this.get(i).equals(value)) {
                        check = true;
                        break;
                    }
                }
            }
        }
        return check;
    }

    void printList() {
        Osama_Mudar_ListNode<M> temp = head;
        System.out.print("[");
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data);
                temp = temp.next;
            } else {
                System.out.print(temp.data + ",");
                temp = temp.next;
            }
        }
        System.out.print("]\n");
    }
    
    String getList() {
        Osama_Mudar_ListNode<M> temp = head;
        String list = "";
        list += "[";
        while (temp != null) {
            if (temp.next == null) {
                list += temp.data;
                temp = temp.next;
            } else {
                list += temp.data + ",";
                temp = temp.next;
            }
        }
        list += "]\n";
        return list;
    }


}
