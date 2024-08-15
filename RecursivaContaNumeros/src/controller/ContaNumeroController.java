package controller;

public class ContaNumeroController {

	public ContaNumeroController() {
		super();}
	
	public int contaNum(int num, int quantidade) {
		if(num<10) {
			
			return(quantidade+1);
			
			/*
			 * a condicao de parada e delimitada pelo numero 10 porque 
			 * se for menor que isso, significa que resta apenas um digito e tras
			 * o beneficio em comparacao ao metodo de o numero ser == 0 ja que o 0 
			 * caso digitado tambem pode ser considerado um digito 
			 */
		} else {
		 return contaNum(num/10, quantidade+1);
		 /*
		  * o numero e dividido por 10 para se eliminar uma casa decimal e a quantidade
		  * aumentada para que se chegue na quantidade de digitos
		  */
	}
	}
}
	
