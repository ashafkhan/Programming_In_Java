package L10_Div_Conquer;
public class J29DivideN_conquer{

    public static void printArr(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }

        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //idx for left sorted part
        int j=mid+1; //idx for right sorted part
        int k=0; // idx for temp
        
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++; k++;
            }else{
                temp[k]=arr[j];
                j++; k++;
            }
        }

        //for leftover elems of 1st sorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //for leftover elems of 2nd sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //temp -> org arr
        for(int idx = 0; idx < temp.length; idx++){
            arr[si + idx] = temp[idx];
        }

    }

    public static void main(String args[]){
        int arr[]={6,3,2,9,5,2,8};
        int si=0;
        int ei=arr.length-1;
        mergeSort(arr, si, ei);
        printArr(arr);
    }
}