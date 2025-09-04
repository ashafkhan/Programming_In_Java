import java.util.*;
public class code {

    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }

            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }

            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pairs(int arr[]){
        int tp=0;
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.err.print("("+curr+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+tp);
    }

    public static void printSubArrays(int arr[]){
        int ts=0;
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total sub-arrays: "+ts);
    }

    public static void subarraySum(int arr[]){
        int max_sum=0;
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                int curr_sum=0;
                for(int k=start; k<=end; k++){
                    curr_sum += arr[k];
                }
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: "+max_sum);
    }

    public static void subarraySum2(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix_arr[]=new int[arr.length];
        prefix_arr[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            prefix_arr[i]=prefix_arr[i-1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                
                curr_sum= (start == 0) ? prefix_arr[end] :prefix_arr[end]-prefix_arr[start-1];
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: "+max_sum);
    }

    public static int trappedRainwater(int height[]){
        int n=height.length;
        //leftmax boundary
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1; i<n; i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //rightmax boundary
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trapped_water=0;
        //loop
        for(int i=0; i<n; i++){
            //water_level=min(leftmax bound,rightmax bound)
            int water_level=Math.min(leftmax[i],rightmax[i]);

            //trapped_water=(water_level - height[i])
            trapped_water += water_level-height[i];
        }

        return trapped_water;
    }

    public static void main(String args[]){

        // butterfly(15);
        // solid_rhombus(5);

        // int arr[]={1,-2,6,-1,3};
        // pairs(arr);

        // printSubArrays(arr);

        // subarraySum(arr);

        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}
