/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj2;

import java.io.*;

/**
 *
 * @author Master
 */
public class Uno {
    public String getLine(String msg){
        String rez="";
        System.out.println(msg);
        Console in=System.console();
        if(in!=null){
            rez=System.console().readLine();
        }else{
            System.out.println("Я не можу працювати в середовищі IDE, тільки в консолі");
        }
        return rez;
    }
}
