import java.util.*;
public class PractiseQuesBitManu {

    //What is the value of x^x for any valueof x
    public static int fastexpo(int a, int n){
        int ans =1; 
        while(n>0){
            if((n & 1) != 0){
                ans = ans *a;
            }
            n = n>>1;
            a = a*a;
        }
        return ans;
    }
    // Swap two numbers without using Third variable 
    // Using XOR we did as XOR of same nums gives 0 and different nums 1
    public static void Swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }

    //Add 1 to an integer using Bit Manipulation.(Hint: try using Bitwise NOT Operator
    public static void add1(int num){
        num = -(~num);
        System.out.println(num);
    }
    public static void main(String args[]){
        Swap(5,7);
        add1(5);
        System.out.println(fastexpo(2,5));
    }
}
