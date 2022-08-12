package Desafio1;

public class Main {
    public static void main(String[] args) {
        Cliente javier = new Cliente(123,"javier");
        System.out.println(javier.getNombre()+ " "+javier.getNumeroCliente());
        javier.setDeuda(400.00);
        System.out.println(javier.getNombre()+" "+ javier.getDeuda());
        javier.incrementarDeuda(35.00);
        System.out.println(javier.getNombre()+" "+ javier.getDeuda());

        javier.pagarDeuda();
        System.out.println(javier.getNombre()+" "+ javier.getDeuda());


    }
}