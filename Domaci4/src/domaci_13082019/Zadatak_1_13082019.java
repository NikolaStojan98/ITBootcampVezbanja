package domaci_13082019;

public class Zadatak_1_13082019 {
	public static void main(String[] args) {
		int i = 5, j = 8, k = 3;

		i = ++j + ++k;// vrednost j uveca za jedan pa sabere sa vrednoscu k koja je isto uvecana i
						// dobije se i=13
		j = i++ + --k;// vrednost i se zadrzava za sabiranje, ali generalno povecava za 1, a vrednost
						// k se smanji za jedan pa sabbira sa i, j=16
		k += ++i + --j;// vrednost i se uvecava za jedan pa sabira sa j cija se vrednost smanjuje za
						// jedan i sabira, sve zahedno sabiramo sa k, k=33
		j -= i-- + k--;// vrednost i se zadrzava za sabiranje, ali smanjuje posle, vrednost k se
						// zadrzava za sabiranje, ali smanjuje posle,
						// oduzima se od vrednosti j koja iznosi zbog prethodnog primer 15, sto daje
						// rezultat j=-33
		System.out.println(j);

	}

}
