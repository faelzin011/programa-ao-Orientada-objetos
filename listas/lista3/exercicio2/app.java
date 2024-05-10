import java.util.*;

public class app {

    private static Scanner SCAN = new Scanner(System.in);
    private static int[] notasDoFilmes = new int[3];
    
    public static void main(String[] args){
        receberNotas();
        imprimirMedia();
    }

    static void receberNotas(){
        for(int i=0; i<notasDoFilmes.length; i++){
            notasDoFilmes[i] = Integer.parseInt(SCAN.nextLine());
        }
    }
    static void imprimirMedia(){
        int somatorio = 0;

        for(int i=0; i<notasDoFilmes.length; i++){
            somatorio = somatorio + notasDoFilmes[i];
        }
        int media = somatorio/notasDoFilmes.length;
        System.out.println(media);
    }
}