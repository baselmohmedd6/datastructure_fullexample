/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication104;

/**
 *
 * @author BASEL
 */
public class Stacks 

{ 
   private byte maxsize;
   private byte[] Array;
   private byte top;
   byte cont=maxsize;
   
   public Stacks(int s)
   {
      maxsize = (byte) s;
      Array = new byte[maxsize];
      top = -1;     
   }
   
   public boolean isEmpty() 
   {
      return (top == -1);
   }
   
   public boolean isFull() 
   {
      return (top == maxsize - 1);
   }
   
   public void pusheven(byte[] j) 
   {
    Array[++top] = j[cont++];
    }
   
    public void pushodd(byte[]j)
    {
    
    Array[++top] =j[cont++]; 
      
    }
    
   public byte popeven() {
      return Array[top--];
   }
   
    public byte  popodd() {
      return Array[top--];
   }
}
