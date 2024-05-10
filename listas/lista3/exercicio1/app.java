import java.util.*;

public class app {
    public static int anoAtual = 2024; 
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int anoDeNascimento = Integer.parseInt(scan.nextLine()); 

        System.out.println("Digite o seu ano de nascimento: ");
        anoDeNascimento = scan.nextInt();

        int calculo = anoAtual - anoDeNascimento;
        System.out.println("Ate o final de 2024 voce tera" + " " + calculo + " " +"anos"); 
    }   
}