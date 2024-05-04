import java.util.*;

public class JooDoZelda {
  
    static boolean[][] mapaDoJogo = new boolean [4][4];
    
    static void preencherMapaDoJogo(){
      
      for(int i = 0; i<4; i++){

        for(int j = 0; j< 4; j++){
            mapaDoJogo[i][j] = false;
        }
      }
    }
    static void torre(int linha, int coluna){
      mapaDoJogo[linha][coluna] = true;
    }
    static void imprimirMatriz(){
      for(int i=0; i<4; i++){

        for(int j=0; j< 4; j++){

          if(mapaDoJogo[i][j]){
            System.out.print("|0");
          }

            else{
              System.out.println("|");
            }
        }
        System.out.println("|");
      }
    }
    static void Mian(String[] args){
      imprimirMatriz();

      Scanner input = new Scanner(System.in);
      System.out.println("Digite a linha da torre aser ativada: ");
      int linhaDaTorre = input.nextInt();

      System.out.println("Digite a coluna da torre a ser ativada: ");
      int colunaDaTorre = input.nextInt();
      torre(linhaDaTorre, colunaDaTorre);
      imprimirMatriz();
    }
}