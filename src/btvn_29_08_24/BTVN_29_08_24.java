package btvn_29_08_24;

import java.util.Scanner;

public class BTVN_29_08_24 {
    public static float[] importData(float[] arrays){
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<arrays.length;i++)
            {
                System.out.print("Nhap phan tu thu "+(i+1)+": ");
                arrays[i]=sc.nextFloat();
            }
            return arrays;
    }
    public static void printData(float[] arrays){
        System.out.println("Mang vua nhap la: ");
        for(float num : arrays)
        {
            System.out.println(num+" ");
        }
        System.out.println();
    }
    public static float findMax2(float[] arrays){
          if(arrays.length<2){
              System.out.println("Mang phai cos it nhat 2 phan tu");
              return Float.NaN;
          }
          float max1= Float.MIN_VALUE;
          float max2=Float.MIN_VALUE;
          for(float num : arrays){
              if(num > max1){
                  max2=max1;
                  max1=num;
              }
              else if(num > max2 && num != max1){
                  max2=num;
              }
          }
          if (max2 == Float.MIN_VALUE){
              System.out.println("Khong co gia tri lon thu hai trong mang");
              return Float.NaN;
          }
          return max2;
    }
    public static float[] deleteOddNumber(float[] arrays){
        int count=0;
        for(float num : arrays){
            if(num % 2 == 0 ){
                count++;
            }
        }
        float[] newArray = new float[count];
        int index = 0;
        for(float num : arrays){
            if((int) num % 2 ==0){
                newArray[index++] = num;
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        float [] arrays = new float[n];
        arrays=importData(arrays);
        printData(arrays);
        float max2 = findMax2(arrays);
        if(!Float.isNaN(max2)){
            System.out.println("Gia tri phan tu lon thu 2 trong mang: " + max2);
        }
        arrays = deleteOddNumber(arrays);
        System.out.println("Mang sau khi xoa cac phan tu le: ");
        printData(arrays);
        
    }
    
}
