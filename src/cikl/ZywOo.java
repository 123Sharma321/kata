package cikl;

import java.util.Arrays;
public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
        //сумма разници 
        sort(arr);
        int temp=0;
        int sum=0;
        if(arr.length>1){
            for(int i=0;i<arr.length-1;i++){
                    temp=arr[i]-arr[i+1];
                    sum +=temp;
            }return sum;
        }else return 0;


        //сортировка от большего к меньшему
    }private static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if (arr[j]<arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }return arr;
    }

}
