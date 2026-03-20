
import java.util.*;
public class TwoPointers{

private static  int arr[] ={1,2,3,4,5,6};

public static void main(String[] a){

System.out.println("Before: "+Arrays.toString(arr));
int left,right;

left=0;
right=arr.length-1;

while(left < right){

int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;

left++;
right--;
}


System.out.println("After: "+Arrays.toString(arr));
}



}
