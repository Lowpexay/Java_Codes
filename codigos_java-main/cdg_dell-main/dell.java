package metodos;

import java.util.Scanner;

public class ex_final {
	
	static Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arrayProdutos = new String[]{"Notebook","Computadores",
				"Tablets","Servidores"};
		int []vendasMeta= new int[] {100,150,200,250};
		
		int [][]arrayVendas=vendas(arrayProdutos);
		int []arrayVendasTotal=vendasTotal(arrayVendas);
		int []arrayVendasTrimestre=vendasTrimestre(arrayVendas);
		String []arrayVerificarMeta=verificarMeta(vendasMeta,arrayVendasTotal);
		
		for(int i=0;i<4;i++) {
			System.out.println("O produto "+(arrayProdutos[i])+" "
		+(arrayVerificarMeta[i])+", realizando "+(arrayVendasTotal[i])+" de vendas.");
		}
	}//MAIN
	
	//A)
	public static int [][]vendas (String []arrayProdutos){
		int [][]arrayVendas = new int[4][3];
		for(int i=0;i<4;i++) {
			System.out.println("Digite a quantidade de vendas de "+arrayProdutos[i]+":");
			for(int j=0;j<3;j++) {
				System.out.print((j+1)+"º trimestre: ");
				arrayVendas[i][j]=entrada.nextInt();
			}
		}
		
		return arrayVendas;
	}
	
	//B)
	public static int[]vendasTotal(int [][]arrayVendas){
		int []arrayVendasTotal=new int [4];
			for(int i=0;i<4;i++) {
				for(int j=0;j<3;j++) {
					arrayVendasTotal[i]+=arrayVendas[i][j];
				}
			}
		
		return arrayVendasTotal;
	}
	
	//C)
	public static int[]vendasTrimestre(int [][]arrayVendas){
		int []arrayVendasTrimestre=new int [3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<4;j++) {
					arrayVendasTrimestre[i]+=arrayVendas[j][i];
				}
			}
		
		return arrayVendasTrimestre;
	}
	
	//D)
	public static String[]verificarMeta(int []vendasMeta,int []arrayVendasTotal){
		String []arrayVerificarMeta=new String [4];
		
		for(int i=0;i<4;i++) {
			if(arrayVendasTotal[i]<vendasMeta[i]) {
				arrayVerificarMeta[i]="não atingiu a meta";
			}else {
				arrayVerificarMeta[i]="atingiu a meta";
			}
		}
		
		return arrayVerificarMeta;
	}
}
