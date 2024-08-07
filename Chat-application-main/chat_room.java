package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.BST_class.Node;

import java.io.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

class chat_room {
    
    //شويه فاريبلز :)
        Scanner s = new Scanner(System.in) ;
          
	 static int counter = 0;
        int ChatRoom_ID; 
        int numberofmembers ;
	List<Users> users = new LinkedList <>(); 
         
	List<Message> messages = new LinkedList <>(); 
	String ChatRoomType;            
  
        
      

    //constrcutors
    public chat_room() {
        counter++;
        ChatRoom_ID=counter;
    }
  
     public chat_room add_chatRoom( Users me ){
        chat_room chat = new chat_room();
        String name="";
       
      if(messagefile.conversationfile.isEmpty())chat.ChatRoom_ID=0;
      else{
        String ss=messagefile.conversationfile.get(messagefile.conversationfile.size()-1);
        String a[]=ss.split(",");
        chat.ChatRoom_ID=Integer.parseInt(a[0])+1;
         }
       

        System.out.println("Choose your chat type [\"Ordinary\" , \"Group\"]");
        chat.ChatRoomType = s.next();
        
        if(chat.ChatRoomType.equals("Ordinary") ){
        chat.numberofmembers=2;
          
           
            System.out.println("write user phone to make chat");
            String phone=s.next();
            
             Users contact=me.searchuser(phone);
        //    users.add(contact); 
         String f=  check_if_chat_exist(me,contact);
            if (!f.equals("")){
                return null;
            }
             System.out.println("hello");
   chat. users.add(me); chat. users.add(contact);
   name =phone;
        }
   else if(chat.ChatRoomType.equals("Group"))
    { chat.users.add(me); 
          System.out.println("write group name ");
          name=s.next();
        System.out.println("select number of users you want to chat with\n");
        chat.numberofmembers = s.nextInt();
        
        for( int l = 0 ; l < chat.numberofmembers ; l++){
            System.out.println("write contact name to add in group");
           String namee=s.next();
          Users contact=me.searchcontactbyname(namee);
            chat.users.add(contact); 
           
        } 
        chat.numberofmembers ++;

   }

     me.tree.insert(name, me,chat);
    addmychatinfile( chat,name);
    return chat;
 } 
       
   
  void addmychatinfile(chat_room chi,String name){
     
      if(chi.ChatRoomType.equals("Group")){
           for(int i=0;i<chi.users.size();i++){
         messagefile.mychatfile.add(Integer.toString(chi.ChatRoom_ID)+(",")+(Integer.toString(chi.users.get(i).userid))+","+name+","+System.lineSeparator());

    
    }
          
      }else {
       messagefile.mychatfile.add(Integer.toString(chi.ChatRoom_ID)+(",")+(Integer.toString(chi.users.get(0).userid))+","+name+","+System.lineSeparator());
      messagefile.mychatfile.add(Integer.toString(chi.ChatRoom_ID)+(",")+(Integer.toString(chi.users.get(1).userid))+","+chi.users.get(0).mobile_no+","+System.lineSeparator());

      }

   
      messagefile.conversationfile.add(Integer.toString(chi.ChatRoom_ID)+","+chi.ChatRoomType+","+Integer.toString(chi.numberofmembers)+","+System.lineSeparator());
    
  }     
String check_if_chat_exist(Users me,Users contact){
    /*بشوف لو الشات موجود اصلا عشان معملش نفس الشات مرتين 
    الكلام دا ف حاله الشات ال اورديناري بس لاكن لو جروب فهو عادي اعمل كذا جروب مع نفس الاشخاص ف مش هتعمل مشكله
   لو الشات اورديناري هاخد الشخصين الي المفروض اضيفهم ف الشات دول قبل ما اعمل الشات و اشوف في بينهم شات معمول قبل كدا ولا لا لو لقيت مش هعملهم شات جديد لو ملقتش هعمل الشات عادي 
    فباخد ال اي دي  بتاع الشخصين دول واروح ادور ف ماي شات فايل
  لو لقيت شات جامعهم هروح للكونفيرسيشن فايل واتاكد ان الشات الي بينهم دا اورديناري لو طلع اورديناري يبقي في بينهم شات ومش هعمل واحد جديد
    */
    for (int i = 0; i <messagefile.mychatfile.size(); i++) {
       String ss=messagefile.mychatfile.get(i);
       String a[]=ss.split(",");
       if (me.userid==Integer.parseInt(a[1])){
       String ss_contact="",a_contact[]={};
       if(i!=0){
            ss_contact=messagefile.mychatfile.get(i-1);
             a_contact=ss_contact.split(",");

       }
        String ss_contact2="", a_contact2[]={};
          if (i!=messagefile.mychatfile.size()-1){
              ss_contact2=messagefile.mychatfile.get(i+1);
              a_contact2 =ss_contact2.split(",");
          }
      
      
  
       if (!"".equals(ss_contact2)&&a_contact2[0].equals(a[0])&& a_contact2[1].equals(Integer.toString(contact.userid)))
       {System.out.println("hi");
           String get_conv_id=messagefile.conversationfile.get(Integer.parseInt(a[0]));
         String aa[]=get_conv_id.split(",");
         if(aa[0].equals(a[0])||aa[1].equals("Ordinary")){
             System.out.println("the chat is already exist ");
             return aa[0];
         }}
         else  if (!"".equals(ss_contact)&&a_contact[0].equals(a[0])&& a_contact[1].equals(Integer.toString(contact.userid)))
         {   System.out.println("hi");
           String get_conv_id2=messagefile.conversationfile.get(Integer.parseInt(a[0]));
           String aaa[]=get_conv_id2.split(",");
           if(aaa[0].equals(a[0])||aaa[1].equals("Ordinary")){
                  System.out.println("the chat is already exist ");
                  return aaa[0];
             }
          }
           
       
    }
    }
            return "";
}
}      