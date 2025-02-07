package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

/*
 * @author CEL�L
 *
 */
public class Continue_Examples {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		int toplam, i, ustlimit, sayac;
		System.out.println("Gireceginiz ust limite kadar olan ve");
		System.out.println("3'e bolunebilen sayilar bulunacaktir.");
		System.out.println();
		System.out.println("Ust limiti giriniz: ");
		ustlimit =scan.nextInt();
		toplam = 0;
		sayac = 0;

		for (i = 1; i <= ustlimit; i++) {
			if (i % 3 != 0) {
				continue;
			}

			System.out.println("3'e bolunebilen sayi: " + i);
			toplam += i;
			sayac++;
		}

		System.out.println("3-" + ustlimit + " arasindaki 3 ile bolunebilen " + sayac + " tane sayi var.");
		System.out.println("Bu tur sayilarin toplami " + toplam);
		
		scan.close();
	}
}