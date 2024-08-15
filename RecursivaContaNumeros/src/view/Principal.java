 package view;

import javax.swing.JOptionPane;

import controller.ContaNumeroController;

public class Principal {

	public static void main(String[] args) {
		int num;
		int quantia=0;
		do {
		num = Integer.parseInt(JOptionPane.showInputDialog("insira numero"));
		}while (num<0||num>99999999);
		ContaNumeroController contNum= new ContaNumeroController();
		int resp = contNum.contaNum(num, quantia);
		System.out.println("A quantidade de digitos é " + resp);
	}
	
}
