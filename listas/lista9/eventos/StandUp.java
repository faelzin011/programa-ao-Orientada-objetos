public final class StandUp extends Eventos {
    private String comediante;

    public StandUp(String nome, String local, String data, String comediante) {
        super(nome, local, data);
        this.comediante = comediante;
    }

    public void setComediante(String comediante){
        this.comediante = comediante;
    }
    
    public String getComediante(){
        return comediante;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Comediante Sr. Cristiano Rosnaldo");
    }

    @Override
    public void comecarEvento() {
        System.out.println("Boa noite a todos e todas presentes aqui!!");
    }

    public void comecarEvento(String piada) {
        System.out.println(
                """
                        O que a pá falou para a outra?
                        ...
                        Opa
                        """);
    }

}
