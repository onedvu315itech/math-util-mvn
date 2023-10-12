package com.hannylud.mathutil.main;

import com.hannylud.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        //dev phai test code cua minh, co 3 cach
        //Cach #1: In ket qua xu li cua ham ra man hinh
        
        //Nhac lai cong viec cua QC bao gom:
        //Thiet ke Test Case, Run Test Case, ghi lai Bug neu co
        //          Test Case, Test Run               Log Bug > Jira, BugZilla
        //TEST CASE: noi ra ban se test app the nao
        //bang cach dua vao data, gia tri ky vong, cach dung app voi bo data do ntn
        //Lat hoi run thu xem sao !!! -> TEST RUN
        
        //de thi PE luon o day!!! Thiet ke TEST CASE
        //Ta thiet ke Test Case de test ham tinh giai thua ta vua viet
        //Test Code thi dc goi la Unit Test
        //Test Case cho Unit Test thi goi la "Unit Test" Test Case
        
        //TEST CASE #1: Check getFactorial() with n = 0
        //STEPS/PROCEDURES:
        //      1. Given n = 0
        //      Invoke/call getFactorial(n = 0)
        
        //EXPECTED RESULT: the method returns 1 stands for 0! = 1
        //STATUS    :PASSED? or FAILED? -> Luc chay ham moi biet ket qua => Goi la TEST RUN
        //                                                                                  Test di test lai nhieu lan
        
        //Test Case #1: Case n = 0
        int n = 0; // Tinh huong kiem tra 0!
        long expected = 1; //0! hy vong la 1, ko can lap trinh cx ra kq nay
        long actual = MathUtility.getFactorial(0); //0! thuc te la may, goi ham va run la biet ngay
        
        //So sanh giua expected == actual hay ko?
        System.out.println("0! -> expected =  " + expected +
                                        "| actual = " + actual);
        //Cach 1: Kiem thu = suc nguoi: Mat nhin, nao nghi
        // done
      
        
        //TEST CASE #2: Check getFactorial(n = 1)
        //STEPS/PROCEDURES:
        //      1. Given n = 1
        //      2. Invoke/Call getFactorial(n = 1)
        
        //EXPECTED RESULT
        //      the method returns 1 (standing for 1! = 1)
        
        //STATUS: PASSED? or FAILED? - to be updated later, when finishing TEST RUN
        //Test Case #2
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! -> expected = " + expected +
                                        "| actual = " + actual);
        
        
        //TEST CASE #3: Check getFactorial(n = 5)
        //STEPS/PROCEDURES:
        //      1. Given n = 5
        //      2. Invoke/Call getFactorial(n = 5)
        
        //EXPECTED RESULT
        //      the method returns 120 (standing for 5! = 120)
        
        //STATUS: PASSED? or FAILED? - to be updated later, when finishing TEST RUN
        //Test Case #3
        System.out.println("5! -> expected = 120" +
                                        "| actual = " + MathUtility.getFactorial(5)); 
        
    }
}
