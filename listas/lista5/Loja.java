import java.util.ArrayList;

public class Loja {
    private int pessoasTrabalhando;
    private int estoque;
    private String marca;
    private ArrayList<Produto> produtos = new ArrayList<>(); 

    public Loja(int pessoasTrabalhando, int estoque, String marca){
        this.pessoasTrabalhando = pessoasTrabalhando;
        this.estoque = estoque;
        this.marca = marca;
    }

    public void adicionarProduto(Produto produto){


        
    }
    //1
    public void setpessoasTrabalhando(int pessoasTrabalhando){
        this.pessoasTrabalhando = pessoasTrabalhando;
    }

    public int getpessoasTrabalhando(){
        return this.pessoasTrabalhando;
    }

    //2
    public void setestoque(int estoque){
        this.estoque = estoque;
    }

    public int getestoque(){
        return this.estoque;
    }

    //3
    public void setmarca(String marca){
        this.marca = marca;
    }

    public String getmarca(){
        return this.marca;
    }
    public ArrayList<Produto> getProdutos(){
        return this.produtos;
    }

}
