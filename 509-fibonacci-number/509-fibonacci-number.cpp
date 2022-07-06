class Solution {
public:
   
    int fib(int n) {
      vector<int>memo(n+1,0);
        return fibcal(memo,n);
    };
     int fibcal(vector<int>&memo,int n)
    {
        if(n<=1)
            return n;
        if(memo[n]!=0)
            return memo[n];
        return memo[n]=fibcal(memo,n-1)+fibcal(memo,n-2);
    }
};
 