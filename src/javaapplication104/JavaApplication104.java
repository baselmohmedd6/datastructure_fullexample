/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication104;



import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author BASEL
 */
public class JavaApplication104 {
 
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
 //convert from string to Ascii
String A1 = "Hey its basel, where are you";
byte[] A2 = A1.getBytes();


//print the Array   
System.out.println("THE Array : ");
for (int i=0; i<A2.length; i++){
System.out.println(A2[i]);}
System.out.println("THE Array count is : "+A2.length);


//the bubble sort of the array
        byte []temp=A2;
        JavaApplication104 o = new JavaApplication104(); 
        o.bubbleSort(temp); 
        System.out.println("bubble Sorted array"); 
        o.printArray(temp); 
        
        
//the bubble sort with the non duplicated elements 
           System.out.println("the non duplicate and sorted array : ");
        byte[] A3 = removeduplicated(temp);
        for(int i:A3){
        System.out.println(i);}
        System.out.println("THE Array count After removing duplicated elements : "+A3.length);
        byte search ;
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter the number you want to search for : ");
        search=sc.nextByte();
        
        
        
   //THE binary search of the array
      int val = Arrays.binarySearch(A3,search);
        boolean found = false;
        for (int n : A3)
        {
            if (n == search)
            {
                found = true;
                
            }
        }
        if(found)
            System.out.println(search + " is found in : "+val);
        else{
            System.out.println(search+ " is not found");
        }
        
//the stack section
        
         System.out.println("-------------------------------------THE EVEN AND ODD STACKS:----------------------------------------- " );
    Stacks s=new Stacks(A2.length);
    for (int i=0;i<A2.length;i++)
    {
        
        if(A2[i]%2==1)
        {
            s.pushodd(A2);
           System.out.println("Odd stack : " + s.popodd());
           
        }
       else if(A2[i]%2==0)
        {
            s.pusheven(A2);  
            System.out.println("Even stack : " + s.popeven());
        }    
        
    }
        
    
    }
    //method to remove the dublicated elements
     public static byte[] removeduplicated(byte[] input){
        
         byte i = 1; 
        byte j = 0;
        
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }    
        }
        byte[] output = new byte[j+1];
        for(int o=0; o<output.length; o++){
            output[o] = input[o];
        }
         
        return output;
    }
     //the bubble sort implemention
    void bubbleSort(byte arr[]) 
    { 
        byte n = (byte) arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                   
                    byte temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = (byte) temp; 
                } 
    } 
    
    void printArray(byte arr[]) 
    { 
        byte n = (byte) arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.println(arr[i] ); 
        System.out.println(); 
    } 
   
    
}