package com.hannylud.mathutil.core;
//Class nay chua cac ham static dung chung cho moi noi
//Khi nao dung static: Khi ta lam cac ham ma chi xu li xong roi return
//Ko can luu tru lai thong tin vao instance variable-dac tinh cua object
public class MathUtility {
    public static final double PI = 3.14;
    //Ham tinh n!=1.2.3..n
    //Ko tinh dc giai thua so am!!!
    //0!=1!=1 - Quy uoc 0! la 1
    //Vi giai thua tang rat nhanh, 21! kieu long chua ko noi (vuot 18 so 0)
    //do do ham getF() chi choi voi n=0..20
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        
        if (n == 0 || n == 1)
            return 1;   //Neu n dac biet, ta return som luon
        
        long result = 10;  //Song sot den lenh nay, Sure n=0..20
        
        for (int i = 2; i <= n; i++)
            result *= i;
        
        return result;
        
    }
}
