/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nable_examtwo;

import java.util.Scanner;

/**
 *
 * @author Jake Marson Nable
 */
public class Nable_ExamTwo {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        storage.insertionNode("Fita");
        storage.insertionNode("Pride Power");
        storage.insertionNode("Canola Oil");
        storage.insertionNode("Nescafe Black Coffe");
        storage.insertionNode("Ariel Power");
        storage.insertionNode("Rebisco");
        storage.insertionNode("Steelwool");
        storage.insertionNode("Head and Shoulders");
        storage.insertionNode("Nova");
        storage.insertionNode("Tanduay");
        storage.insertionNode("Bearbrand");
        storage.insertionNode("Nautre Spring Meniral");
        storage.insertionNode("Coke");
        storage.insertionNode("Sprite");
        storage.insertionNode("Royal");
        storage.insertionNode("Sugar");
         int loop = 0;
         do{
            menu();
            System.out.println("Do you want to have another transaction?\n[1] NO. \n[2] YES.");
            int choice = scan.nextInt();
            
            if(choice == 1){
                System.out.println("Ok, Have a nice day!");
            }else{
                System.out.println("Ok, Another transaction");
                loop++;
            }
        }while(loop == 1);
    }
     public static void menu() throws Exception{    
         System.out.println("What do you want to do?");
         System.out.println("1. Question One");
         System.out.println("2. Question Two");
         int choice = scan.nextInt();
         
         switch (choice) {
             case 1:
                 one();
                 break;
             case 2:
                 tindahan();
                 break;
             default:
                 throw new AssertionError();
         }
     }
     
     //Question One
     
     public static void one() throws Exception{
         Nable_ExamTwo list = new Nable_ExamTwo();
        System.out.println("Welcome to Question Two");
        System.out.println("1. Insert name");
        System.out.println("2. Display names");
        int choice = scan.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Enter name");
                String name = scan.nextLine();
                list.add(name);
                System.out.println("Enter position");
                int position = scan.nextInt();
                
                
                break;
            case 2:
                System.out.println(list);
                break;
        }
     }
     
     
     //Question Two
     static  Nable_ExamTwo storage = new Nable_ExamTwo();
     
    public static String tindahan() throws Exception{
        
        
        System.out.println("Welcome to Question Two");
        System.out.println("1. Search for Goods");
        System.out.println("2. Display some Goods");
        int choice = scan.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("What do you want?");
                String ignore = scan.nextLine();
                String target = scan.nextLine();
                
                NodeGoods result = storage.searchNode(target);
                if (result != null) {
                    System.out.println(result.dataGoods + " is available in the sari sari store." );
                    System.out.println("Do you want to buy the goods?\n YES\n NO");
                    String input = scan.nextLine();
                    if(input.equalsIgnoreCase("yes")){
                        String temporary = headGoods.dataGoods;
                        headGoods = headGoods.nextGoods;
                        return temporary;
                        
                        } else{
                            System.out.println("ok, have a nice day!");
                        }     
                    } else {
                        System.out.println("Sorry, it is not available at the moment.");
                    }
                break;
            case 2:
                storage.display();
                break;
        }
        return null;
        
    }
        public void display()throws Exception{
        if (headGoods == null){
            throw new Exception("Queue is Empty");
        }
        
        NodeGoods temporary = headGoods;
        
        while (temporary != null) {            
            System.out.println(temporary.dataGoods + "");
            temporary = temporary.nextGoods;
        }
        System.out.println("NULL \n");
    }
//    public String delete(String result)throws Exception{
//        if(head == null){
//            throw new Exception("Queue is emty");
//        }
//        
//        String temporary = head.data;
//        head = head.next;
//        return temporary;
//    }
    
    public static NodeGoods headGoods;

    private void add(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    static class NodeGoods {
        String dataGoods;
        NodeGoods nextGoods;
        
        NodeGoods(String data){
            this.dataGoods = data;
            this.nextGoods = null;
        }
    }
    
    
    public void insertionNode(String data){
        NodeGoods newNode = new NodeGoods(data);
        if(headGoods == null){
            headGoods = newNode;
        }else{
            NodeGoods current = headGoods;
            while(current.nextGoods != null){
                current = current.nextGoods;
            }
            current.nextGoods = newNode;
        }
    }
        public NodeGoods searchNode(String target){
        NodeGoods current = headGoods;
        while(current != null){
            if(current.dataGoods.equalsIgnoreCase(target)){
                return current;
        }
        current = current.nextGoods;
        }      
        return null;
    }
}
