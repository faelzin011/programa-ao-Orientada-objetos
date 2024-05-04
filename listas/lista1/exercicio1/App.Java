import java.util.*;

public class Main {
  
    static int [] vetor = new int [10];
    static Scanner scan = new Scanner (System.in);
    
    static void preencherVetor(int [] vetor){
      
      for(int i = 0; i<vetor.length; i++){
        vetor[i] = scan.nextInt();
      }
    }
    static boolean buscaNumeroNoVetor(int numero, int [] vetor){
      for(int i = 0; i<vetor.length; i++){
        if(numero == vetor[i]){
          return true;
        }
    } 
    return false;
    }
    public static void main(String[] args) {
      preencherVetor(vetor);
      int novoNumero = scan.nextInt();
      boolean retorno = buscaNumeroNoVetor(novoNumero, vetor);
      if(retorno == true){
        System.out.println("ACHEI");
      }
      else{
        System.out.println("NAO ACHEI");
      }   
  }
}