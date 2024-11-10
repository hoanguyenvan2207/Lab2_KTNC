package lab3;

import java.util.Arrays;
import java.util.List;

public class Lab3 {
    public int tinhTong(String aStr, String bStr){
        int a;
        int b;
        try{
            a = Integer.parseInt(aStr);
            b = Integer.parseInt(bStr);
            if(a < -10000 || a > 10000 || b < -10000 || b > 10000){
                throw new ArithmeticException("Gia tri cua a va b khong nho hon -10000 va khong lon hon 10000");
            }
            return a + b;
        } catch (NumberFormatException e){
            throw new NumberFormatException("So phai la so nguyen");
        }
    }

    public double tinhThuong(int a, int b) {
        if(a < -100 || a > 100 || b < -100 || b > 100){
            throw new IllegalArgumentException("Giá trị phải nằm trong khoảng từ -100 đến 100");
        }
        if(b == 0){
            throw new ArithmeticException("So b phai la so khac 0");
        }
        return (double) a / b;
    }


    public double tinhTrungBinh(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Không thể tính trung bình của danh sách trống.");
        }

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return sum / numbers.size();
    }

    public int getElementAtIndex(int[] arrays, int index){
        if (index < 0 || index >= arrays.length){
            throw new IndexOutOfBoundsException("Index nằm ngoại phạm vi của mảng");
        }
        return arrays[index];
    }
}
