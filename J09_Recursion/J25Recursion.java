package J09_Recursion;
public class J25Recursion {
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }

    public static int sumOfNums(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNums(n-1);
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        // int fnm1=factorial(n-1);
        // int fn=n*fnm1;
        // return fn;
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);
        int fn=fnm1+fnm2;
        return fn;
        // return fibonacci(n-1)+fibonacci(n-2);
    }

    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1) return true;
        if(arr[i]>arr[i+1]) return false;
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length-1) return -1;
        if(arr[i]==key) return i;
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        //check rest array first
        int restIndex=lastOccurence(arr, key, i+1);
        if(restIndex!=-1){
            return restIndex;
        }
        //check current
        if(arr[i]==key){
            return i;
        }
        return -1;
    }

    public static int power(int x, int n){
        if(n==0) return 1;
        return x*power(x,n-1);
    }

    public static int optimizedPower(int x, int n){
        if(n==0) return 1;
        int halfPower=optimizedPower(x, n/2);
        int halfPowerSq=halfPower*halfPower;
        //n is odd
        if(n%2 != 0){
            halfPowerSq=x*halfPower*halfPower;
        }
        return halfPowerSq;
    }
    
    public static void main(String args[]){
        // printDecreasing(10);
        // printInc(10);

        // System.out.println(sumOfNums(5));

        // System.out.println(factorial(4));
        // System.out.println(fibonacci(26));

        // int arr[]={1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));

        int arr[]={8,3,6,9,5,10,2,5,3,4};
        // System.out.println(firstOccurence(arr,5,0));
        // System.out.println(lastOccurence(arr,3,0));

        // System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 10));

    }

}
