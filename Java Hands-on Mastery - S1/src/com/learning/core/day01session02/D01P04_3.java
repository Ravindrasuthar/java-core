package com.learning.core.day01session02;

import java.util.Scanner;

public class D01P04_3 {

    public static int findFirstOccurance(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findFirstOccurance(arr,n));
    }
}
