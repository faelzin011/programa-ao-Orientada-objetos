package exceptions;

public class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException(){
        super("O preco é negativo! Por favor digite um numero positivo!!");
    }

}
