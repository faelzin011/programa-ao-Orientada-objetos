package exceptions;

public class NomeInvalidoException extends Exception{
    public NomeInvalidoException(){
        super("O nome do produto tem que ter mais de tres caracteres!!");
    }

}
