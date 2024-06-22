import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
    do{
        try{
            Produto produto = new Produto(scan.nextLine());
            System.out.println(produto.getNome());
            break;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }while(true);
   

    }
}
