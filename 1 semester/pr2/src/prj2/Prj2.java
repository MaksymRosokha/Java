/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj2;

import java.io.IOException;

/**
 *
 * @author Master
 */
public class Prj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Uno o1= new Uno();
        Dos o2=new Dos();
        Tres o3= new Tres();

        String test1,test2,test3;

        test1=o1.getLine("Hi, your name pls! (Uno)");
        System.out.println("Name - "+test1);
        
        test2=o2.getLine("Hi, your name pls!Dos");
        System.out.println("Name - "+test2);

        test3=o3.getLine("Hi, your name pls!Tres");
        System.out.println("Name - "+test3);        

        
        int y=o3.getInt("Hi, INT pls!");
        System.out.println("INT - "+(++y));   
        
        double x=o3.getDbl("Hi, DBL pls!");
        System.out.println("DBL - "+(x++));        
        
          
    }
    
}
