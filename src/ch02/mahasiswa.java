package ch02;

public class mahasiswa {
	String nim;
	String nama;
	String alamat;
	String hp;
	
	public String getNim() {
		return nim;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
	public String getHP() {
		return hp;
	}
	
	public void cetak() {
		System.out.println("NIM : " + nim);
		System.out.println("Nama : " + nama);
		System.out.println("Alamat : " + alamat);
		System.out.println("HP : " + hp);
	}
}