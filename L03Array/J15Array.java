package L03Array;
import java.util.*;

public class J15Array {
    public static boolean containsDuplicates(int arr[]){
        int n=arr.length;
        if(n==0) return false;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    

    public static void main(String args[]){
        int arr[]={0,0};
        System.out.println(containsDuplicates(arr));
    }
}
