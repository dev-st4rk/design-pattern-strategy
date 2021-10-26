package strategy;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) 
	 {
		 
	        Scanner scanner = new Scanner(System.in);
	        Disciplina d = new Disciplina();
	        
	        
			System.out.println("ESCOLHA UM CÁLCULO PARA SER FEITO\n1 - Media Aritmética \n2 - Media Geometrica");
			
			
	        int escolha_usuario = scanner.nextInt();
	        scanner.nextLine();

	        switch(escolha_usuario)
	        {
	        
	        
	            case 1:
	                media_aritmetica A = new media_aritmetica();
	                d.aluno();
	                A.CalculaMedia(d);
	                A.MudaSituacao(d);
	                d.print_data(); 
	                break;
	                
	                
	            case 2:
	                media_geometrica G = new media_geometrica();
	                d.aluno();
	                G.CalculaMedia(d);
	                G.MudaSituacao(d);
	                d.print_data();
	                break;
	                
	                
	            default:
	                System.out.println("ERRO: OPÇÃO INVÁLIDA");
	        }
	    }

	}