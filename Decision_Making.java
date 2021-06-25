/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;
import java.util.Scanner;
/**
 *
 * @author Atoyebi Adesoji
 * TOPIC: Decision making.
 */
public class Decision_Making {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String Staff, Shift, Grade;
    int NOP,NOT, NO, NOPa, NOTa;
    
    System.out.println("Enter if you are a permanent or temporary staff");
    Staff = sc.next();
    System.out.println("Enter the number of packages you have delivered");
    NOP = sc.nextInt();
    System.out.println("Enter the number of times you travelled");
    NOT = sc.nextInt();
    System.out.println("Enter (Y/N) if you had shift");
    Shift = sc.next();
    System.out.println("Enter your grade");
    Grade = sc.next();
    
    System.out.println("=========================================");
    
    double  SH, SH1;
    double A1, A2, A3, A1a, A2a, A3a;
    
    System.out.println("The number of pakages delivered is "+NOP);
    System.out.println("You have travelled "+NOT+" times");
         
    
    switch(Staff){
        case "permanent":
        NOPa = NOP * 50;
        NOTa = NOT * 75;
        NO = NOPa + NOTa;
        switch (Shift) {
            case "Y":
                SH = (NO*10)/100;
                SH1 = SH+NO;
                switch(Grade){
                    case "A1":
                        A1 = (SH1 * 5)/100;
                        A1a = SH1+A1;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+SH1);
                        System.out.println("Your bonous is $"+A1);
                        System.out.println("Your earning is $"+A1a);
                        System.out.println("You are a "+Staff+" staff");
                        
                        break;
                    case "A2":
                        A2 = (SH1 * 10)/100;
                        A2a = SH1+A2;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+SH1);
                        System.out.println("Your bonous is $"+A2);
                        System.out.println("Your earning is $"+A2a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                    case "A3":
                        A3 = (SH1 * 15)/100;
                        A3a = SH1+A3;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+SH1);
                        System.out.println("Your bonous is $"+A3);
                        System.out.println("Your earning is $"+A3a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                        
                }break;    
                
            case "N":
                switch(Grade){
                    case "A1":
                        A1 = (NO * 5)/100;
                        A1a = A1+NO;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+NO);
                        System.out.println("Your bonous is $"+A1);
                        System.out.println("Your earning is $"+A1a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                    case "A2":
                        A2 = (NO * 10)/100;
                        A2a = A2+NO;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+NO);
                        System.out.println("Your bonous is $"+A2);
                        System.out.println("Your earning is $"+A2a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                    case "A3":
                        A3 = (NO * 15)/100;
                        A3a = A3+NO;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+NO);
                        System.out.println("Your bonous is $"+A3);
                        System.out.println("Your earning is $"+A3a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                }       break;
                
            default:
                System.out.println("Invalid! Try again.");
                break;
        } }
    switch(Staff){
            case "temporary":
            NOPa = NOP * 30;
            NOTa = NOT * 65;
            NO = NOPa + NOTa;
        switch (Shift) {
            case "Y":
                SH = (NO*10)/100;
                SH1 = SH+NO;
                switch(Grade){
                    case "A1":
                        A1 = (SH1 * 5)/100;
                        A1a = A1+SH1;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+SH1);
                        System.out.println("Your bonous is $"+A1);
                        System.out.println("Your earning is $"+A1a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                    case "A2":
                        A2 = (SH1 * 10)/100;
                        A2a = A2+SH1;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+SH1);
                        System.out.println("Your bonous is $"+A2);
                        System.out.println("Your earning is $"+A2a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                    case "A3":
                        A3 = (SH1 * 15)/100;
                        A3a = A3+SH1;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+SH1);
                        System.out.println("Your bonous is $"+A3);
                        System.out.println("Your earning is $"+A3a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                        
                }       
                break;
            case "N":
                switch(Grade){
                    case "A1":
                        A1 = (NO * 5)/100;
                        A1a = A1+NO;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+NO);
                        System.out.println("Your bonous is $"+A1);
                        System.out.println("Your earning is $"+A1a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                    case "A2":
                        A2 = (NO * 10)/100;
                        A2a = A2+NO;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+NO);
                        System.out.println("Your bonous is $"+A2);
                        System.out.println("Your earning is $"+A2a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                    case "A3":
                        A3 = (NO * 15)/100;
                        A3a = A3+NO;
                        System.out.println("Your grade is "+Grade);
                        System.out.println("Your basic pay is $"+NO);
                        System.out.println("Your bonous is $"+A3);
                        System.out.println("Your earning is $"+A3a);
                        System.out.println("You are a "+Staff+" staff");
                        break;
                } break;
                
            default:
                System.out.println("Invalid! Try again.");
                break;
        }break;
            
    }
        
        
    
    
    
    
    
    
    
    
    
    
    
    /*
    A1 FOR PERMANENT STAFF = 137.5 /27.4 BONUS
    A1 FOR TEMP STAFF  = 104.5 / 25.4
    A2 FOR PER. STAFF = 13.8
    A2 FOR TEMP STAFF = 10.5
    A3 FOR PER STAFF = 9.7
    A3 FOR TEMP STAFF = 7
    */
    //String Staff, Grade;
    //System.out.println("Enter if you are a permanent staff or temporary staff");
    //Staff = sc.next();
    //System.out.println("Enter your grade (e.g A1, A2, A3)");
    //Grade = sc.next();
    
    /*
    if("permanent".equals(Staff) && "A1".equals(Grade)){
            System.out.println("Your bonus is $27.4");        
    }else if("permanent".equals(Staff) && "A2".equals(Grade)){
            System.out.println("Your bonus is $13.8");
    }else if("permanent".equals(Staff) && "A3".equals(Grade)){
            System.out.println("Your bonus is $9.7");
    }else if("temporary".equals(Staff) && "A1".equals(Grade)){
            System.out.println("Your bonus is $25.4");
    }else if("temporary".equals(Staff) && "A2".equals(Grade)){
            System.out.println("Your bonus is $10.5");
    }else if("temporary".equals(Staff) && "A3".equals(Grade)){
            System.out.println("Your bonus is $7");
    }
    */
    /*
        switch(Staff){
            case "permanent":
                switch(Grade){
                    case "A1":
                        System.out.println("Your bonus is $27.4");
                        break;
                    case "A2":
                        System.out.println("Your bonus is $13.8");
                        break;
                    case "A3":
                        System.out.println("Your bonus is $9.7");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
            case "temporary":
                switch(Grade){
                    case "A1":
                        System.out.println("Your bonus is $25.4");
                        break;
                    case "A2":
                        System.out.println("Your bonus is $10.5");
                        break;
                    case "A3":
                        System.out.println("Your bonus is $7");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
        }
    
    */
    
    }    
}
    

