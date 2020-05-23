package ch02;

public class ObjectProduct{
	public static void main (String[] args){
         produk x1 = new produk();
		 x1.barcode = "423332223";
		 x1.nama = "Pepsodent";
		 x1.tanggalKedaluarsa = new date(2021,7,2);
		 x1.harga = 8900;
		 
		 produk x2 = new produk();
		 x2.barcode = "5122211121";
		 x2.nama = "KitKat";
		 x2.tanggalKedaluarsa = new date(2021,1,21);
		 x2.harga = 14500;
		 
		 System.out.println(x1.nama + " (" + x1.barcode + " )");
		 System.out.println("Harga: Rp" + x1.harga);
		 System.out.println("Exp: " + x1.tanggalKedaluarsa.toString());
		 
		 System.out.println("=============================");
		 
		 System.out.println(x2.nama + " (" + x2.barcode + " )");
		 System.out.println("Harga: Rp" + x2.harga);
		 System.out.println("Exp: " + x2.tanggalKedaluarsa.toString());
	}
}