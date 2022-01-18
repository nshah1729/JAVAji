package kk.BitWiseManipulation;

public class aPowerb {
    public static void main(String[] args) {
        int a=6;
        int b=3;
        print(a,b);
    }
    public static void print(int a,int b){
        int ans=1,base=a;
        while(b>0){
            if((b&1)==1)ans*=base;
            base*=base;
            b=b>>1;
        }
        System.out.println(ans);
    }
}
