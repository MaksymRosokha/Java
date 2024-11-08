/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj2;

import java.util.Scanner;

/**
 *
 * @author Master
 */
public class Tres {
    private  Scanner in= new Scanner(System.in);
    public String getLine(String msg){
        String rez;
        System.out.println(msg);
        rez=in.nextLine();
        return rez;
    }      
    
    public double getDbl(String msg){
        double rez;
        System.out.println(msg);
        rez=in.nextDouble();
        return rez;
    }    
    
    
    public int getInt(String msg){
        int rez;
        System.out.println(msg);
        rez=in.nextInt();
        return rez;
    }       
}
