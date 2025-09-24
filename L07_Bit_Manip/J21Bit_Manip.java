package L07_Bit_Manip;
public class J21Bit_Manip {
    public static void oddEvenCheck(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            //even
            System.out.println("Even");
        }else{
            //odd
            System.out.println("Odd");
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask=1<<i;
        if((n&bitMask)!=0){
            return 1;
        }else{
            return 0;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }

    public static int updtIthBit(int num, int i, int val){
        // if(val==0){
        //     return clearIthBit(num, i);
        // }else{
        //     setIthBit(num, i);
        // }

        //Better approach
        num=num & ~(1<<i); //clear
        num=num | (val<<i); //set if val==1, no change if val==0
        return num;
    }

    public static int clrLastIthBits(int num, int i){
        int bitMask=(~0<<i);
        return num&bitMask;
    }

    public static int clrBitsInRange(int num, int i, int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return num&bitMask;
    }

    public static boolean isPowOfTwo(int n){
        return (n&(n-1))==0;
    }

    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1) != 0){ //check LSB
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    // 

    public static void main(String[]args){
        int n=4;
        // oddEvenCheck(n);

        // System.out.println(getIthBit(15,2));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(6,1));
        // System.out.println(updtIthBit(7,3,1));
        // System.out.println(clrLastIthBits(15, 2));
        // System.out.println(clrBitsInRange(10, 2, 4));
        // System.out.println(isPowOfTwo(16));

        // System.out.println(countSetBits(16));
        System.out.println(fastExpo(5, 3));
    }
}
