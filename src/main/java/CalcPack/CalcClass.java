package CalcPack;
public class CalcClass {
	static void Somma(int n1, int n2) {
		int ris=n1+n2;
		System.out.println("Somma: "+ris);
	}
	static void Differenza(int n1, int n2) {
		int ris=n1-n2;
		System.out.println("Differenza: "+ris);
	}
	static void Prodotto(int n1, int n2) {
		int ris=n1*n2;
		System.out.println("Prodotto: "+ris);
	}
	static void Quoziente(int n1, int n2) {
		int ris=n1/n2;
		if(n2>0)
		{
			System.out.println("Quoziente: "+ris);
		}
		else{
			throw new IllegalArgumentException("Errore");
		}
	}
	static void Media(int n1, int n2){
		int NCount[]={n1,n2};
		int ris=n1+n2/NCount.length;
		System.out.println("Media: "+ris);
	}
	static void Potenza(int n1, int n2) {
		int ris=(int)Math.pow(n1, n2);
		System.out.println("Potenza: "+ris);
	}

}
