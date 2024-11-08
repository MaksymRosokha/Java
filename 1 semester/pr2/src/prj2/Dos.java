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
public class Dos {
    public String getLine(String msg) throws IOException{
        String rez;
        System.out.println(msg);
        /*
        InputStreamReader y=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(y);
        */
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        rez=in.readLine();
        return rez;
    }
}
