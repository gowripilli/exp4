/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oddeven;

/**
 *
 * @author GOWRI
 */
public class OddEven {
    static int num(int n)
    {
     int i,even=0,odd=0,rem;   
       while(n>0)
       {
           rem=n%10;
           if(rem%2==0)
           {
               even=even+1;
           }
           else
           {
               odd=odd+1;
           }
           n=n/10;
       }
       return even;
    }
    public static void main(String[] args) {
        int n=16235;
        int numeven=num(n);
        System.out.println("the even count is" + numeven);
    }
}
