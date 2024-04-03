package com.learning.core.day01session02;

public class D01P04_2 {

    public static void main(String[] args)
    {
        int[] A = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};

        int sum=0,avg=0;
        for(int i=0;i<15;i++)
        {
            sum+=A[i];
        }
        avg=sum/14;

        A[15]=sum;
        A[16]=avg;

        int min=Integer.MAX_VALUE;
        for(int i=0;i<17;i++)
        {
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        A[17]=min;

        for(int i=0;i<18;i++)
        {
           System.out.print(A[i]+" ");
        }

    }
}
