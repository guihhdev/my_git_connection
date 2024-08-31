package test;
import java.util.Scanner;
public class test {
	
	    // Declarando as variáveis como atributos da classe
	    private String loginCadastro;
	    private String senhaCadastro;

	    public static void main(String[] args) {
	        test sistema = new test();
	        sistema.Cadastro();
	        sistema.Login();
	    }

	    public void Cadastro() {
	        Scanner s = new Scanner(System.in);
	        // cadastro
	        System.out.println("Cadastro: ");
	        System.out.println("Digite seu login: ");
	        loginCadastro = s.nextLine();
	        System.out.println("Digite sua senha: ");
	        senhaCadastro = s.nextLine();
	        System.out.println("Cadastro feito com sucesso!");
	    }

	    public void Login() {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Login");
	        System.out.println("Digite seu login: ");
	        String login = s.nextLine();
	        System.out.println("Digite sua senha: ");
	        String senha = s.nextLine();

	        if (login.equals(loginCadastro) && senha.equals(senhaCadastro)) {
	            System.out.println("Login realizado com sucesso!");
	        } else {
	            System.out.println("Erro!");
	            System.out.println("1-Esqueci minha senha");
	            System.out.println("2- Sair");
	            int resposta = s.nextInt();
	            s.nextLine(); // Consome a nova linha pendente após a leitura de int

	            switch(resposta){
	                case 1:
	                    Cadastro();
	                    System.out.println("1- Fazer login");
	                    int respostaLogin = s.nextInt();
	                    s.nextLine(); // Consome a nova linha pendente após a leitura de int

	                    if (respostaLogin == 1) {
	                        Login();
	                    } else {
	                        System.out.println("Programa finalizado e senha alterada");
	                    }
	                    break;
	                case 2:
	                    System.out.println("Programa finalizado");
	                    break;
	                default:
	                    System.out.println("Resposta inválida");      
	            }
	        }
	    }
	}



