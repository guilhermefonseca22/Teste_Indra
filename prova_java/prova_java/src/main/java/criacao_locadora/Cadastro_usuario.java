package criacao_locadora;
import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro_usuario {
	
	/*Login do usuario */

	public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("BEM VINDO A LOCADORA ****LOCALFILMS****");
        System.out.println("\n" + "ESTE � O NOSSO CADASTRO DE USU�RIOS");
        System.out.println("DIGITE SEU LOGIN: ");
        String login = l.nextLine();
        System.out.println("DIGITE SUA SENHA DE ACESSO:");
        String senha = l.nextLine();
        System.out.println("\n" +"USUARIO: "+login + " E SENHA:******" + "  LOGADO COM SUCESSO!!");
        
        /*Inclus�o de informa��es */
        
        System.out.println("\n" +"DIGITE O NOME DO DIRETOR:");
   	    String nome_diretor = l.nextLine();
   	    System.out.println("DIGITE O NASCIMENTO DO DIRETOR:");
  	    String nascimento_diretor = l.nextLine();
  	    System.out.println("DIGITE O NOME DO FILME:");
	    String nome_filme = l.nextLine();
	    System.out.println("DIGITE O ANO DO FILME:");
	    String ano_filme = l.nextLine();
	    System.out.println("\n" +"INFORMA��ES GRAVADAS COM SUCESSO!!");
        
	    
	    /*Gravando as informa��es no array */
  
        Dados usuario;
        usuario = new Dados();
        usuario.setLogin(login);
        ArrayList<Dados> usuarios = new ArrayList<Dados>();
        usuarios.add(usuario);
        
        	
        
     }
	
	
}
