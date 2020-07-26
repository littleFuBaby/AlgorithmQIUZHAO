package com.ruoyi.grokking.algorithms.number;

public class Pow {

    /**
     * method 1<br/>
     * note: directly use java api to calculate number power
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow1(double x, int n) {
        return Math.pow(x, n);
    }

    /**
     * method 2 by using iteration
     * @param x
     * @param n
     * @return
     */
    public double myPow2(double x, int n) {
        double result = 1.0;
        double value = x;
        long times = n;
        if(times < 0){
            times = -times;
        }
        while(times > 0){
            if(times % 2 == 1){
                result *= value;
            }
            value *= value;
            times /= 2;
        }
        return n < 0 ? 1.0 / result : result;
    }

}
