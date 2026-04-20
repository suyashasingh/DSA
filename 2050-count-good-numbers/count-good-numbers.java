class Solution {
    long mod = 1000000007;

    public int countGoodNumbers(long n) {

        long even = (n+1)/2;
        long odd = n/2;

        long evenPart = power(5, even);
        long oddPart = power(4, odd);

        return (int)((evenPart * oddPart)%mod);
        
    }

    public long power(long x, long n){
        if(n == 0) return 1;
        long half = power(x, n/2);

        if(n%2 == 0){
            return (half*half)%mod;
        }
        else{
            return (x*half*half)%mod;
        }
    }
}

//tc - O(log n) sc - O(log n)