public static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n) {
        
   if (n == 1) return t1;
   if (n == 2) return t2;
   
   BigInteger value = t1.add(t2.pow(2));
   
   if (n == 3) return value;
   
   return fibonacciModified(t2, value, n - 1);
}