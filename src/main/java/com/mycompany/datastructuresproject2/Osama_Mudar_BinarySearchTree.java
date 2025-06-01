/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.datastructuresproject2;

import javax.swing.DefaultListModel;

/**
 *
 * @author ASUS
 */
public class Osama_Mudar_BinarySearchTree {

    DefaultListModel<String> model1 = new DefaultListModel<>();
    Osama_Mudar_TreeNode root;

    void insert(String value) {
        Osama_Mudar_TreeNode newNode = new Osama_Mudar_TreeNode(value);
        if (root == null) {
            root = newNode;
        } else {
            Osama_Mudar_TreeNode current = root;
            while (current != null) {
                if (value.compareTo(current.Data) < 0) {
                    if (current.left == null) {
                        current.left = newNode;
                    }
                    current = current.left;
                } else if (value.compareTo(current.Data) > 0) {
                    if (current.right == null) {
                        current.right = newNode;
                    }
                    current = current.right;
                } else {
                    return;
                }
            }
        }
    }

    public Osama_Mudar_TreeNode get(String key) {
        Osama_Mudar_TreeNode node = getRecursive(root, key);
        return node != null ? node : null;
    }

    private Osama_Mudar_TreeNode getRecursive(Osama_Mudar_TreeNode current, String key) {
        if (current == null || key.equals(current.Data)) {
            return current;
        }

        if (key.compareTo(current.Data) < 0) {
            return getRecursive(current.left, key);
        } else {
            return getRecursive(current.right, key);
        }
    }

    public boolean contains(String value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Osama_Mudar_TreeNode current, String value) {
        if (current == null) {
            return false;
        }
        if (value.equals(current.Data)) {
            return true;
        }
        if (value.compareTo(current.Data) < 0) {
            return containsRecursive(current.left, value);
        } else {
            return containsRecursive(current.right, value);
        }
    }

    public void printTreeInOrder(DefaultListModel mo) {
        inOrderTraversal(root, mo);
    }

    private void inOrderTraversal(Osama_Mudar_TreeNode node, DefaultListModel mo) {
        if (node != null) {
            inOrderTraversal(node.left, mo);
//            System.out.print(node.Data + " : ");
            mo.addElement(node.Data + " : " + node.getCounters());
//            node.printCounters();
            inOrderTraversal(node.right, mo);
        }
    }

    public void printTreePreOrder(DefaultListModel mo) {
        preOrderTraversal(root, mo);
    }

    private void preOrderTraversal(Osama_Mudar_TreeNode node, DefaultListModel mo) {
        if (node != null) {
            mo.addElement(node.Data + " : " + node.getCounters());
            preOrderTraversal(node.left, mo);
            preOrderTraversal(node.right, mo);
        }
    }

    public void printTreePostOrder(DefaultListModel mo) {
        postOrderTraversal(root, mo);
    }

    private void postOrderTraversal(Osama_Mudar_TreeNode node, DefaultListModel mo) {
        if (node != null) {
            postOrderTraversal(node.left, mo);
            postOrderTraversal(node.right, mo);
            mo.addElement(node.Data + " : " + node.getCounters());
        }
    }

}
