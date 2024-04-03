package com.learning.core.day01session02;

import java.util.Scanner;

public class D01P04_1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        while(true)
        {
            a=sc.nextInt();
            if(a>=1 && a<=40)
                break;
            else System.out.println("enter number between 1 and 40");
        }
        while(true)
        {
            b=sc.nextInt();
            if(b>=1 && b<=40)
                break;
            else System.out.println("enter number between 1 and 40");
        }

        int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {
            while(true)
            {
                arr[i]=sc.nextInt();
                if(arr[i]>=1 && arr[i]<=40)
                    break;
                else System.out.println("enter number between 1 and 40");
            }
        }

        int count=0,count1=0;
        for(int i=0;i<5;i++)
        {
            if(a==arr[i])
                count++;
            if(b==arr[i])
                count1++;
        }

        if(count>=1 && count1>=1)
        {
            System.out.println("Its Bingo");
        }
        else
        {
            System.out.println("Not Found");
        }

    }
}

