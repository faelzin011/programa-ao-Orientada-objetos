import java.util.List;

public class Show extends Eventos {
    private List<String> artistas;

    public Show(String nome, String local, String data, List<String> artistas) {
        super(nome, local, data);
        this.artistas = artistas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(this.getNome());
        System.out.println(this.getLocal());
        System.out.println(this.getData());

        for(int i =0; i < artistas.size(); i++){
            System.out.println(artistas.get(i));
        }
    }

    @Override
    public void comecarEvento() {
        System.out.println("O show vai começar!!");
    }

    public void comecarEvento(boolean comAplausos) {
        if (comAplausos) {
            System.out.println("O show foi inciciado com aplausos");
        }else{
            System.out.println("O show foi iniciado em silêncio...");
        }
        
    }
}
