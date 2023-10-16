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
    
    //5! = 1.2.3.4.5
    //5! = 4!.5 = 5 x 4!
    //4! = 1.2.3.4
    //4! = 3!.4 = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1! - DỪNG LẠI NHEN, KO ĐUỔI NHAU NỮA
    //N! = N x (N - 1)! -> CTHỨC ĐỆ QUY XUẤT HIỆN
    //ĐỆ QUY - RECURSION - GỌI LẠI CHÍNH MÌNH VƠI QUY MÔ NHỎ HƠN
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        
        if (n == 0 || n == 1)
            return 1;   //Neu n dac biet, ta return som luon
        
        return n * getFactorial(n - 1);
        
        //Tối ưu code, thay ruột của cái hàm để chạy ngon hơn
        //nhanh hơn, hoặc code viết đẹp hơn
        //hoặc fix bug thì phải sửa code
        //DÙ BẠN SỬA CODE VÌ LÝ DO GÌ, THÌ CODE PHẢI ĐC TEST LẠI
        //VÀ TEST LẠI ĐỂ ĐẨM BẢO NÓ VẪN XANH NHƯ LẦN TRƯỚC
        //NẾU TA VIẾT CODE ĐI KÈM TEST SCRIPT THÌ VIỆC TEST LẠI CÁO
        //HÀM SẼ CỰC NHANH, KO CẦN DÙNG MẮT ĐỂ DÒ TƯNG DONG LỆNH ĐÚNG SAI
        //MÀ CHỈ CẦN NHÌN MÀU XANH LÀ ĐỦ - VÌ HÀM TRẢ VỀ NHƯ EXPECTED
        //TEST LẠI NHỮNG GÌ ĐÃ TỪNG TEST -> REGRESSION TEST
        //                                  KIỂM THỬ HỒI QUY
        //KIỂM THỬ LẠI HÀM LÚC NÀY CỰC NHANH VÌ GITHUB ACTIONS LO GIÙM
        //TA CHỈ CẦN MÀU XANH HOẶC NHẬN EMAIL CHỬI VÌ CODE ĐÓ
    }
    
//    public static long getFactorial(int n){
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1;   //Neu n dac biet, ta return som luon
//        
//        long result = 1;  //Song sot den lenh nay, Sure n=0..20
//        
//        for (int i = 2; i <= n; i++)
//            result *= i;
//        
//        return result;
//        
//    }
}