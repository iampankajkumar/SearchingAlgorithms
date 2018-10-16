import java.util.*;

public class LinearSearch{
    
  public static void main(String args[]){
      System.out.println("Please enter size of of the list");
      Scanner sc=new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] =new int[size];
      System.out.println("Size of the list. : "+size);
      for(int i=0;i<size;i++)
        {
            System.out.println("Please enter element no. : "+(i+1));
            arr[i]=sc.nextInt();
        }
      System.out.println("Please enter element to be search. :");  
      int search = sc.nextInt();
      System.out.println(searchElement(arr,search));
      }
      
public static String searchElement(int arr[], int x){
        for( int i=0; i<arr.length;i++)
        if(arr[i] == x)
            return "Element found at "+i+" index.";
        return "No element found !"; 
    }
  }