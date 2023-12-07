package metodos;

public class metodos_01 {
	
	public static void main(String[] args) {
		msg();
		int r;
		r = soma(10,5);
		System.out.println(r);
		
	}

	public static int soma(int n1, int n2) {
		int res = n1 + n2;
		return res;
		
	}
	
	public static void msg() {
		System.out.println("Teste, Olá, Mundo!");
	}
	
}
