import java.util.*;

public class SlidingWindow{

private static int arr[] ={3,5,2,1,4,2,6};

public static void main(String[] a){
Set<Integer> set=new HashSet<>();
int left=0;
int maxLength=0;
int start=0;
for(int i=0;i<arr.length;i++){

while(set.contains(arr[i])){

set.remove(arr[left]);
left++;
}

set.add(arr[i]);
if(i-left+1> maxLength){
maxLength=i-left+1;
start=left;
}
}
System.out.println("MaxLength: "+maxLength);
for(int i=start;i<start+maxLength;i++){

System.out.print(arr[i]+" ");
}

System.out.println();
}


}
