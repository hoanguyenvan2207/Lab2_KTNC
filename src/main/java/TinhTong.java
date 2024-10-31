public class TinhTong {
    public int tinhTongTu1DenN(int n){
        if(n < 1) return 0;
        return n * (n + 1) / 2;
    }

    public int TinhTongSoLeTu1DenN(int n){
        if (n < 1) return 0;
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public long tinhGiaiThua(int n){
        if (n < 0) return -1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
