
import java.util.Scanner;
public class ArraySample{
   public static  void main(String arg[]){

         int [] arr = new int[5];
           Scanner sc = new Scanner(System.in);
              System.out.println("Enter array elements : " );
             for(int i=0;i<arr.length;i++)
            {
                    System.out.println("enter array ["+i+"] index value :"); 
                    arr[i]=sc.nextInt();

             }    
          for(int i=0;i<arr.length;i++)
       {
             System.out.println(arr[i]+",");
       }        

}
}

