/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa2.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 *
 * @author vip1
 */
public class SA2Project {

    /**
     * @param args the command line arguments
     */
    static Sport s= new Sport("tennis");
    static Sport s2= new Sport("football");
    public static String msg;
    public static String playerN;
    public static void main(String[] args) {
        
   
        
        int choose;
        int cont=1;
    /*JFrame f = new JFrame("A JFrame");
    f.setSize(250, 250);
    f.setLocation(300,200);
    final JTextArea textArea = new JTextArea(10, 40);
    textArea.append("0-exit\n1-add user\n2-view all users\n3-change state");
    JTextField nameF = new JTextField("Enter your choice");
    nameF.setBounds(50, 100, 200, 30);
    String x=nameF.getText();
    System.out.println(x);
    //Gchoose=Integer.parseInt(x);
    f.getContentPane().add(BorderLayout.CENTER, textArea);
    final JButton button = new JButton("Click Me");
    f.getContentPane().add(BorderLayout.SOUTH, button);
    button.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.append("Button was clicked\n");

        }
    });

    f.setVisible(true);
*/
        do{
            System.out.println("0-exit\n1-add user\n2-view all users\n3-change state");
            Scanner sc=new Scanner(System.in);
            cont=sc.nextInt();
            //cont=Gchoose;
            switch(cont){
                case 0:
                    break;
                case 1:
                {
                    addUser();
                    Scanner ss=new Scanner(System.in);
                    int c=1;
                    
                    do{
                    System.out.println("1-add another user  2-goto admin");
                    c=ss.nextInt();
                    if(c==1)
                        addUser();
                    if(c==2)
                        break;
                    }
                    while(c!=2);
                }
                case 3:
                {
                    admin();
                }
            }
        }
        while(cont!=0);
    }
    
   public static void addUser()
   {
        Scanner sc2=new Scanner(System.in);
        System.out.println("please enter your name: ");
        String name=sc2.nextLine();
        Person p=new Person(name);
        System.out.println("1-Tennis --- 2-Football");
        Scanner sc3=new Scanner(System.in);
        int choice=sc3.nextInt();
        if(choice==1)
           s.add(p);
        if(choice==2)
           s2.add(p);
        
   }
   
   public static void admin()
   {
       System.out.println("change state of 1-Tennis 2-Football");
                    Scanner sc4=new Scanner(System.in);
                    Scanner sc6=new Scanner(System.in);
                    int choice2=sc4.nextInt();
                    if(choice2==1)
                    {
                        newsTennis t=new newsTennis() {};
                        System.out.println("Enter the player's name: ");
                        String playerName=sc6.nextLine();
                        t.addNews(playerName);
                    }
                    if(choice2==2){
                        newsFootball t=new newsFootball() {};
                        System.out.println("Enter the player's name: ");
                        String playerName=sc6.nextLine();
                        t.addNews(playerName);
                    }
   }
    
}
