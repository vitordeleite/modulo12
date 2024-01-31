package modulo12;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Modulo12 {
public static void main(String[] args) {
	String loop ="S";
	List <Pessoa> homem = new ArrayList<>();
	List <Pessoa> mulher = new ArrayList<>();
	while(loop.equals("S")) {
	Scanner texto = new Scanner(System.in);
	System.out.println("escreva o nome da pessoa:");
	String nome;
	nome=texto.nextLine();
	System.out.println("agora coloque F ou M para o sexo:");
	String sexo;
	sexo=texto.nextLine();
	if (sexo.equals("M")) {
		homem.add(new Pessoa(nome,sexo));
	}else if(sexo.equals("F")) {
		mulher.add(new Pessoa(nome,sexo));
	}
	System.out.println("você deseja adicionar alguem na lista?(S/N)");
	loop=texto.nextLine();
	}
	
	System.out.println("lista de homens");
	System.out.println("-----------------------");
	for (Pessoa pe : homem) {
		System.out.println(pe.getNome());
	}
	System.out.println("-----------------------");
	System.out.println("lista de mulheres");
	System.out.println("-----------------------");
	for (Pessoa po : mulher) {
		System.out.println(po.getNome());
	}
}
}
