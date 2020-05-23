package ch03;

public class soal2 {
    public static void main(String[] args){
        int x, y, z, maks;
        x = 10;
        y = 300;
        z = 20;
        if (x>y && x>z) {
            maks = x;
        } else if (y>x && y>z){
            maks = y;
        } else{
            maks = z;
        }
        System.out.println("Angka maksimum adalah= "+maks);
    }
}