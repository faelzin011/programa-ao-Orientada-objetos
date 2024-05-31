public class App{

    public static void main(String[] args){
        Gato gato = new Gato("Roberte");
        Cachorro cachorro = new Cachorro("Revoada");

        System.out.println(gato.imprimirTela());
        System.out.println(cachorro.imprimirTela());
        gato.emitirSom();
        gato.comer();
        cachorro.emitirSom();
        cachorro.comer();
    }
}