package arrayex; //지영이 문제

import java.util.Iterator;

public class ArrayTest07_Jiyoung {

   public static void main(String[] args) {
      
      
      int arr[] = {56,87,12,32,53,89,90,92,96,100};
      int sum = 0;
      int avg = 0;
      int temp = 0;
      int max = arr[0];
      
      for (int i = 0; i < arr.length; i++) {
         sum+=arr[i];
      }
      avg = sum/arr.length;
      
      for (int i = 1; i < arr.length; i++) {
         if(max<arr[i])
            max=arr[i];
      }
      
      System.out.println("\n=======================================");
      System.out.println("10개의 값을 입력해주세요");
      for (int i = 0; i < arr.length; i++) 
         System.out.println(i+1 + "번째 값 : "+ arr[i]);
         
      
      System.out.println("**********************************\nResult");
      System.out.println("합산 : "+ sum +", 평균 : " + avg + ", 최댓값 :"+max);
      
      for (int i = 0; i < arr.length; i++) 
         System.out.print(arr[i]+ " ");
      
      System.out.println("\n=======================================");
      
      for (int i = 0; i < arr.length; i++) {
         for (int j = i; j < arr.length; j++) {
            if(arr[i]<arr[j]) {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
         System.out.print(arr[i]+" ");
      }

      }
      
   }

