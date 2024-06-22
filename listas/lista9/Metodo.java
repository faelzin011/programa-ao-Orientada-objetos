public class Metodo {
    public static void main(String[] args){
        Show show = new Show("Stand up da viela", "Rua primeiro de Maio", "20/02/2022", null);
        StandUp standUp = new StandUp("Stand up da Cone", "Rua primeiro de abril", "30/01/2022", "Rosnaldo");
        standUp.comecarEvento("o que a pá falou para a outra? Opa");
        standUp.comecarEvento();
        standUp.exibirInformacoes();
    }
}
