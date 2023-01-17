import java.util.Scanner;
import java.util.*;

public class moveZero {

    public static void moveZero(int arr[]) {

        int c=0;
          int temp[]=new int[arr.length];
          for(int i=0;i<arr.length;i++){
             
               if(arr[i]!=0){
                temp[c++]=arr[i];
               }
          }

          while(c<arr.length){
            temp[c++]=0;
          }

          for(int j=0;j<temp.length;j++){
           arr[j]=temp[j];
           System.out.print(arr[j] +" ");
          }
          

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        moveZero(arr);

    }
}
