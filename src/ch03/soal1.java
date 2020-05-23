package ch03;

public class soal1 {
    public static void main(String[] args){
        int x, y, maks;
        x = 10;
        y = 300;
        if (x>y) {
            maks = x;
        } else (y>x){
            maks = y;
        }
        System.out.println("Angka maksimum adalah= "+maks);
    }
}