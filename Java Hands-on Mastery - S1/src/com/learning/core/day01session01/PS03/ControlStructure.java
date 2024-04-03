package com.learning.core.day01session01.PS03;

public class ControlStructure {

    public String[] PrintMonths(int... nums)
    {
        String[] arr = new String[nums.length];
        int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                arr[j]="January";
                j++;
            }
            else
            if(nums[i]==2)
            {
                arr[j]="February";
                j++;
            }
            else
            if(nums[i]==3)
            {
                arr[j]="March";
                j++;
            }
            else
            if(nums[i]==4)
            {
                arr[j]="April";
                j++;
            }
            else
            if(nums[i]==5)
            {
                arr[j]="May";
                j++;
            }
            else
            if(nums[i]==6)
            {
                arr[j]="June";
                j++;
            }
            else
            if(nums[i]==7)
            {
                arr[j]="July";
                j++;
            }
            else
            if(nums[i]==8)
            {
                arr[j]="August";
                j++;
            }
            else
            if(nums[i]==9)
            {
                arr[j]="September";
                j++;
            }
            else
            if(nums[i]==10)
            {
                arr[j]="October";
                j++;
            }
            else
            if(nums[i]==11)
            {
                arr[j]="November";
                j++;
            }
            else
            if(nums[i]==12)
            {
                arr[j]="December";
                j++;
            }
            else
            {
                arr[i]="Invalid Input";
                j++;
            }

        }
        return arr;
    }


    public String[] printDays(int... nums)
    {
        int n = nums.length;
        String[] arr = new String[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                arr[j]="Monday";
                j++;
            }
            else
            if(nums[i]==2)
            {
                arr[j]="Tuesday";
                j++;
            }
            else
            if(nums[i]==3)
            {
                arr[j]="Wednesday";
                j++;
            }
            else
            if(nums[i]==4)
            {
                arr[j]="Thursday";
                j++;
            }
            else
            if(nums[i]==5)
            {
                arr[j]="Friday";
                j++;
            }
            else
            if(nums[i]==6)
            {
                arr[j]="Saturday";
                j++;
            }
            else
            if(nums[i]==7)
            {
                arr[j]="Sunday";
                j++;
            }
            else
            {
                arr[j]="Invalid Input";
                j++;
            }
        }
        return arr;
    }

    public String printGrades(int num)
    {
        if(num>=60)
        {
            return "Grade A";
        }
        else if(num>=45)
        {
            return "Grade B";
        }
        else if(num>=35)
        {
            return "Grade C";
        }
        else
        {
            return "Fail";
        }

    }

    public void printPattern(int num) {
        for(int i=1;i<=num;i++)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public void printFactorial(long num) {
        long product=1;
        long x = num;
        while(num>0)
        {
            product*=num;
            num--;
        }
        System.out.println("Factorial of "+x+" is "+product);
    }
}
