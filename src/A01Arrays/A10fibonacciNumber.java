// https://leetcode.com/problems/fibonacci-number/description/

package A01Arrays;
public class A10fibonacciNumber {
    public int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        int n1=0;
        int n2=1;
        
        int temp = 0;
        for(int i=2; i<=n; i++)
        {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }

        return temp;
    }    
}