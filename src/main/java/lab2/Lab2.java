package lab2;

public class Lab2 {
    public long tinhTongTu1DenN(int n){
        if(n < 1 || n > 100) throw new ArithmeticException("So phai lon hon 0");
        return (long)n * (n + 1) / 2;
    }

    public int TinhTongSoLeTu1DenN(int n){
        if (n < 1 || n > 50) return -1;
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public long tinhGiaiThua(int n){
        if (n < 0 || n > 13) return -1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
