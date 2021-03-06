/*
 *       Filename:  PrimeNumbers.java
 *
 *    Description:  Exercise 6.25 - Prime Numbers
 *
 *        Created:  14/10/15 17:06:57
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PrimeNumbers{
    public static void main(String[] args){
        int count = 0;
        for(int i=2; i<10000; i++){
            if(isPrime(i)){
                System.out.printf("%d, ", i);
                count++;
            }
            // output formatting
            if(count == 10){
                count = 0;
                System.out.println();
            }
        }
        System.out.println();
    }
    // only need to check those numbers not divisible by 2
    // if number is divible by any number > 1 then is not prime.
    public static boolean isPrime(int n){
        for(int i=2; 2*i<n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    // TODO : Finish this. Getting the wrong results so obviously don't
    // understand
    public static boolean isPrimeRefined(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(Math.sqrt(n) % i == 0)
                return false;
        }
        return true;
    }
}
