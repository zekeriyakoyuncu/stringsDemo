package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı:"+mesaj.length());
		System.out.println("5. eleman:"+mesaj.charAt(4));//index olarak yazıyoruz.
		System.out.println(mesaj.concat(" Yaşasın!"));// yalnız mesaj değişmez değişmesi için mesaja atama yapmamız gerekir.
		System.out.println(mesaj.startsWith("B"));//ile başlıyormu (boolean türünden sonuç döndürür.)
		System.out.println(mesaj.endsWith("."));//dikkat edilmesi gereken başka bir husus case sens.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
	}

}
