public class Cachorro implements Animal{
    private int andar;
    private String nome;

    public void setandar(int andar){
        this.andar = andar;
    }
    public int getandar(){
        return this.andar;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getnome(){
        return this.nome;
    }

    public Cachorro(String nome){
        this.nome = nome;
    }
    
    public String imprimirTela(){
    return String.format("Nome do cachorro: %s", this.nome);
    }
    
    @Override
    public void comer(){
        System.out.println("COMIDAAAAA!");
    }

    @Override
    public void emitirSom(){
        System.out.println("AU,AU,AU,AU");        
    }
}
