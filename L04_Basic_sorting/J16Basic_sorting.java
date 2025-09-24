package L04_Basic_sorting;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class J16Basic_sorting {
    
    public static void bubble_sort(int arr[]){
        int swapCount=0;
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                    swapCount++;
                }
            }
            if(swapCount==0) break;
        }
        System.out.println("Number of swaps: "+swapCount);
    }

    public static void selection_sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minIndex=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            //swap
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertion_sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr=arr[i];
            int prev=i-1;
            //find correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void counting_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(arr[i],largest);
        }
        int count[]=new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print_arr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        // bubble_sort(arr);
        // selection_sort(arr);
        // insertion_sort(arr);
        // Arrays.sort(arr,0,5);
        
        // Integer nums[]={5,4,1,3,2};
        // Arrays.sort(nums, Collections.reverseOrder());

        counting_sort(arr);
        print_arr(arr);

    }
}
