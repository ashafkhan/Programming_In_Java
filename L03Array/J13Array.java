package L03Array;
import java.util.*;

class J13Array{

    public static int linear_search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int binary_search(int arr[], int key){
        Arrays.sort(arr);

        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }

    public static void getMinMax(int[] arr){
        // Code Here
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("Smallest val: "+smallest);
        System.out.println("Largest val: "+largest);
    }

    public static void reverseArray(int arr[]){
        // code here
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }

    public static void printPairs(int arr[]){
        int tp=0;
        for(int i=0; i<arr.length; i++){
            int curr=arr[i]; //2,4,6,8,10
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+curr+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+tp);
    }

    public static void printSubarrays(int arr[]){
        int ts=0;
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: "+ts);
    }

    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        // int key=0;
        
        // // int index=linear_search(arr, key);
        
        // int index=binary_search(arr, key);
        
        // if(index==-1){
        //     System.out.println("Not found");
        // }else{
        //     System.out.println("Found at index: "+index);
        // }

        // getMinMax(arr);

        // reverseArray(arr);
        // System.out.println("Reversed arr: ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // printPairs(arr);

        printSubarrays(arr);

    }
}