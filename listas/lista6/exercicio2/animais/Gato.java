public class Gato implements Animal{
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

    public Gato(String nome){
        this.nome = nome;
    }
    
    public String imprimirTela(){
    return String.format("Nome do gato: %s", this.nome);
    }
    @Override
    public void comer(){
        System.out.println("Já estava na hora de colocar a ração ^-^");
    }

    @Override
    public void emitirSom(){
        System.out.println("MIIIIIIIAU!");

    }
}
