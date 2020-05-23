package ch04;

public class Soal_6L {
    public static void main(String[] args) {
        int[] ary = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int i = 1;

        do{
            if (ary[i] %2 == 0 && ary[i-1] %2 == 0){
                System.out.print("Selisih dari " + ary[i-1] + " dan " + ary[i] + " = ");
                System.out.println(ary[i-1] + ary[i] + " ");
            }
            i++;
        } while(i < ary.length);

	//Nama	: Raihan Mahdy
	//NIM	: 11950115174
	//Kelas	: TIF 2-D

    }
}