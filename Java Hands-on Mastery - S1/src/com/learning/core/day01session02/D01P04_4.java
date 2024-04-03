package com.learning.core.day01session02;

import java.util.Scanner;

public class D01P04_4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        findAllCombination(arr,n,k);
    }

    private static void findAllCombination(int[] arr, int n, int k) {
        if(k>n || n==0)
        {
            System.out.println("Invalid Input!!!");
            return;
        }

        for(int i=0;i<=n-k;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
