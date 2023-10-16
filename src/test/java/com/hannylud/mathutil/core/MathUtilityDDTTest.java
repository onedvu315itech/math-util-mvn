package com.hannylud.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilityDDTTest {
    
    //TA TÁCH BỘ DATA KIỂM THỬ RA KHỎI CÁC CÂU LỆNH SO SÁNH
    //KỸ THUẬT NÀY GỌI LÀ DDT - Data Driven Testing
    //KIỂM THỬ HÀM, APP MÀ TÁCH RIÊNG BỘ DATA RA 1 CHỖ ĐỂ DỄ KIỂM
    //DATA TEST TA ĐỂ RIÊNG RA 1 CHỖ, THƯỜNG LÀ MẢNG, HAY FILE EXCEL HOẶC TABLE
    //0! -> 1
    //1! -> 1
    //2! -> 2
    //3! -> 6
    //4! -> 24
    //5! -> 120
    //THẤY MÙI CỦA MẢNG 2 CHIỀU
    
    public static Object[][] initData(){
//        int[] a = {PHẦN TỬ CỦA MẢNG 1 CHIỀU CÁCH NHAU DẤU PHẨY}
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {5, 120}
                             // n, expected
                              };
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnOk(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
