/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class messagefile {
 static ArrayList <String> messagesfile = new ArrayList<>();
 static  ArrayList <String> conversationfile = new ArrayList<>();
 static ArrayList <String> mychatfile = new ArrayList<>();
 static ArrayList <String> contacts = new ArrayList<>();
 static ArrayList <String> usersfile = new ArrayList<>();



static void  readmessagefile(){
try {
    BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test\\hii.txt"));
    String ss;
    while((ss=br.readLine())!=null){
        String a[]=ss.split(System.lineSeparator());
         for(int i=0;i<a.length;i++){
         messagesfile.add(a[i]+System.lineSeparator());
        }
    }
    br.close();
    } 
catch (IOException ex) {
     Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
     }
    
}
static void writemessagefile(){
 
try{
    BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\test\\hii.txt"));
    for (int i=0;i<messagesfile.size();i++){
         bw.write(messagesfile.get(i));
         }
    bw.close();
    } 
catch (IOException ex) {
    Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
    }
}
static void readconversationfile(){
try {
    BufferedReader con=new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test\\conversation1.txt"));
    String ss;
    while((ss=con.readLine())!=null){
String a[]=ss.split(System.lineSeparator()); 
for(int i=0;i<a.length;i++){
         conversationfile.add(a[i]+System.lineSeparator());
        }}
     
   
    con.close();
    } 
catch (IOException ex) {
     Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
     }
    
}
static void writeconversationfile(){
 
try{
    BufferedWriter con=new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\test\\conversation1.txt"));
    for (int i=0;i<conversationfile.size();i++){
      
       
         con.write(conversationfile.get(i));
         }
    con.close();
    } 
catch (IOException ex) {
    Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
    }
}
static void readmychatfile(){
try {
    BufferedReader chu=new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test\\mychat.txt"));
    String ss;
  while(( ss=chu.readLine())!=null){
   String a[]=ss.split(System.lineSeparator());
     for(int i=0;i<a.length;i++){
         mychatfile.add(a[i]+System.lineSeparator());
         
}}
 
    chu.close();
    } 
catch (IOException ex) {
     Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
     }
    
}
static void writemychatfile(){
 
try{
    BufferedWriter chu=new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\test\\mychat.txt"));
    for (int i=0;i<mychatfile.size();i++){
         
         chu.write(mychatfile.get(i));
         }
    chu.close();
    } 
catch (IOException ex) {
    Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
    }
}
static void readcontacts(){
try {
    BufferedReader cont=new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test\\contacts.txt"));
    String ss;
  while(( ss=cont.readLine())!=null){
   String a[]=ss.split(System.lineSeparator());
     for(int i=0;i<a.length;i++){
         contacts.add(a[i]+System.lineSeparator());
         
}}
 
    cont.close();
    } 
catch (IOException ex) {
     Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
     }
    
}
static void writecontacts(){
 
try{
    BufferedWriter cont=new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\test\\contacts.txt"));
    for (int i=0;i<contacts.size();i++){
         
         cont.write(contacts.get(i));
         }
    cont.close();
    } 
catch (IOException ex) {
    Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
    }
}
static void readusers(){
try {
    BufferedReader use=new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test\\users.txt"));
    String ss;
  while(( ss=use.readLine())!=null){
   String a[]=ss.split(System.lineSeparator());
     for(int i=0;i<a.length;i++){
         usersfile.add(a[i]+System.lineSeparator());
         
}}
 
    use.close();
    } 
catch (IOException ex) {
     Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
     }
    
}
static void writeusers(){
 
try{
    BufferedWriter cont=new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\test\\users.txt"));
    for (int i=0;i<usersfile.size();i++){
         
         cont.write(usersfile.get(i));
         }
    cont.close();
    } 
catch (IOException ex) {
    Logger.getLogger(messagefile.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
       

 

