/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstnb;

/**
 *
 * @author Master
 */
public class FirstNB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr= new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.println("arr["+i+"]="+ arr[i]);
        }
        
        Help help= new Help(arr);
        int MAX= help.getMax();
        int MIN= help.getMin();
        
        int arrLH[]=help.sortLH();
        int arrHL[]=help.sortHL();
        
        System.out.println("MAX = "+MAX);
        System.out.println("MIN = "+MIN);
    }
    
}
