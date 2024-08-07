
package com.mycompany.mavenproject1;
import java.io.*;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author a
 */
public class Mavenproject1 {

   public static void main(String[] args) {
   
    
     //  messagefile file =new messagefile ();
       messagefile.readmessagefile();messagefile.readconversationfile();messagefile.readmychatfile();messagefile.readcontacts();messagefile.readusers();
       Scanner in = new Scanner(System.in);
       String ChatRoom_name ;   
       Users currentuser;
       currentuser =new Users(Users.login());
      
       currentuser.tree.uploadtree(currentuser);
      currentuser.uploadcontacts(currentuser);
   // currentuser.tree.undo(file, currentuser.tree.root,"xc");
       System.out.println(currentuser.userid);
   while(true){
    boolean exit =false;
     System.out.println("1.log in with another user");
     System.out.println("2.creat new chat");
     System.out.println("3.send message");
     System.out.println("4.display messages ");
     System.out.println("5.display contacts");
     System.out.println("6.display chats name");
     System.out.println("7.exit");
       System.out.println("8.add contact");
     int x=in.nextInt();
      switch(x){
         case 1:
             
                currentuser=new Users(Users.login());
                currentuser.tree.uploadtree( currentuser);
                currentuser.uploadcontacts(currentuser);


                 break;
          case 2:
                
                
                chat_room   chi = new chat_room();
                chi=chi.add_chatRoom(currentuser);
                
               //    System.out.println( currentuser.tree.root.left.left.user_name);
                
                break;
          case 3:
              System.out.println("enter chat name");
              ChatRoom_name=in.next();
                           //   currentuser.tree.uploadmessage(currentuser.tree.root,ChatRoom_name );
              currentuser.tree.store_message(currentuser.tree.root,ChatRoom_name,currentuser); 
      
              break;
          case 4:
               System.out.println("enter chat name to display messages");
               ChatRoom_name=in.next();
               currentuser.tree.display_messages(currentuser.tree.root,ChatRoom_name);
               break;
          case 5:
               
              currentuser.displaycontacts(currentuser);
              break;
          case 6:
            currentuser.tree.inorder();
              break;
          case 7:
              exit=true;
              break;
          case 8:
             currentuser. addcontact(currentuser);
             break;
          case 9: 
             // currentuser=(currentuser.register());
                System.out.println("enter chat name to display info");
               ChatRoom_name=in.next();
             currentuser.tree.chatRoomInfo(currentuser.tree.root,ChatRoom_name);
              break;
      }
     if ( exit==true)
        break;
   }
   messagefile.writemessagefile();messagefile.writeconversationfile();messagefile.writemychatfile();messagefile.writecontacts();messagefile.writeusers();
//       System.out.println(currentuser.tree.root.right.user_name);
        //    System.out.println(currentuser.tree.root.left.user_name);

}
}

   
    
