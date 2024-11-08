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
public class Help {
    private int arr[];
    
    public Help(int arr[]){
        this.arr=arr;
    }
    
    public int getMax(){
        int MAX;
        MAX=arr[0];
        int i=0;
        while(i<arr.length){
            if(MAX<arr[i]){
                MAX=arr[i];
            }
            i++;
        }
        return MAX;
    }
    
    public int getMin(){
        int MIN;
        MIN=arr[0];
        for(int i=0;i<arr.length; i++){
            if(MIN>arr[i]){
                MIN=arr[i];
            }
        }
        return MIN;
    }    
    
    public int[] sortLH(){
        return new int[4];
    }
    
    public int[] sortHL(){
        return new int[4];
    }    
}
