public class Produto {
    private String seloDeQualidade;
    private int preco;
    private int validadeProduto;

    public Produto(String seloDeQualidade, int preco, int validadeProduto){
        this.seloDeQualidade = seloDeQualidade;
        this.preco = preco;
        this.validadeProduto = validadeProduto;
    }
    
    public void imprimirAtributos(){
        System.out.println(this.seloDeQualidade);
        System.out.println(this.preco);
        System.out.println(this.validadeProduto);


    }
    //1
    public void setseloDeQualidade(String seloDeQualidade){
        this.seloDeQualidade = seloDeQualidade;
    }

    public String getseloDeQualidade(){
        return this.seloDeQualidade;
    }

    //2
    public void setpreco(int preco){
        this.preco = preco;
    }

    public int getpreco(){
        return this.preco;
    }
    //3
    public void setvalidadeProduto(int validadeProduto){
        this.validadeProduto = validadeProduto;
    }

    public int getvalidadeProduto(){
        return this.validadeProduto;
    } 

}
