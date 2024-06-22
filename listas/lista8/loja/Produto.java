import exceptions.NomeInvalidoException;
import exceptions.PrecoInvalidoException;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome) throws NomeInvalidoException, PrecoInvalidoException{
        setNome(nome);
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) throws NomeInvalidoException{
        if (nome.length() <3) {
            throw new NomeInvalidoException();
        }
    }
    public String getNome(){
        return this.nome;

    }
    public void setPreco(double preco) throws PrecoInvalidoException{
        if (preco < 0) {
            throw new PrecoInvalidoException();
            
        }
    }

    public double getPreco(){
        return this.preco;
    }
}
