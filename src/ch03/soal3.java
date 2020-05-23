package ch03;

import java.util.scanner;

public class soal3 {
    public static void main(String[] args){
       
	   Scanner masukkan = new Scanner (System.in);
	   
	   System.out.print("Bilangan : ");
	   int bil = masukkan.nextInt();
	   
	   if (bil > 0 && bil <= 4){
	       System.out.println("Pembagi terkecil adalah " + angka);
	   } else {
	      for (int p = 3; p <= masukkan; p++){
		     if ( bil %p == 0){
			  System.out.println("Pembagi terkecil adalah " + p);
			  break;
			}
	     }
	   }
	 }
  } 