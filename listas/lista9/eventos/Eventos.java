public abstract class Eventos {
    private String nome;
    private String local;
    private String data;

public Eventos(String nome, String local, String data){
    this.nome = nome;
    this.local = local;
    this.data = data;
}

public void exibirInformacoes(){
    System.out.println(this.nome + "\n" + this.local + "\n" + this.data);
}

public abstract void comecarEvento();

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

public void setLocal(String local){
    this.local = local;
}

public String getLocal(){
    return this.local;
}

public void setData(String data){
    this.data = data;
}

public String getData(){
    return this.data;
}
}
