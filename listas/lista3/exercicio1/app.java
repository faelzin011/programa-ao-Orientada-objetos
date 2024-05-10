import java.util.*;

public class app {
    public static int anoAtual = 2024; 
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu ano de nascimento: ");
        int anoDeNascimento = scan.nextInt();

        int idade = converterEmIdade(anoDeNascimento);
        System.out.println("Ate o final de 2024 voce tera" + " " + idade + " " +"anos"); 
    }
    static int converterEmIdade(int anoDeNascimento){
        int idade = anoAtual - anoDeNascimento;
        return idade;
    }   
}