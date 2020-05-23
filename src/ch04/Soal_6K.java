package ch04;

public class Soal_6K {
    public static void main(String[] args) {
        int[] ary = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan Angka-Angka yang setelahnya bernilai lebih besar");
        System.out.println("-------------------------------");
        for (int i = 1; i < ary.length; i++){
            if ( ary[i] > ary[i-1]){
                System.out.println(ary[i-1]);
            }
        }

	//Nama	: Raihan Mahdy
	//NIM	: 11950115174
	//Kelas	: TIF 2-D

    }
}