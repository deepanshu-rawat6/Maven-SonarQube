package org.example;

public class Main {
//  Using Sieve of Eratosthenes
    public int countPrimes(int n) {
        boolean[] primes=new boolean[n];
        int c=0;
        seive(n,primes);
        for(int i=2;i<n;i++){
            if(!primes[i]) c++;
        }
        return c;
    }
    public void seive(int n , boolean[] primes){
        for(int i=2;i*i<n;i++){
            if(!primes[i]){
                for(int j=i*2;j<n;j+=i){
                    primes[j]=true;
                }
            }
        }
    }

//    Java function logic
    public int sum (int a,int b) {
        return a + b;
    }
    
//    This function contain some bugs
    public void operations() {
        int p = 9;
        int q = 3;
        try {
            System.out.println((float) p / q);
        } catch (ArithmeticException e) {
            System.out.println("Please, a non-zero value of q");
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.sum(10,20));
        System.out.println(obj.countPrimes(100));
        obj.operations();
    }
}