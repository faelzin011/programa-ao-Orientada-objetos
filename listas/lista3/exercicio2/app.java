import java.util.*;

public class app {

    private static Scanner SCAN = new Scanner(System.in);
    private static int[] filmes = new int[3];
    
    public static void main(String[] args){
        int notas = Integer.parseInt(SCAN.nextLine()); 

        System.out.println("Digite a sua avalicao sobre o filme: ");
        notas = SCAN.nextInt();
    }
}