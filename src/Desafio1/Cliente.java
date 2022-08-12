package Desafio1;

public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    public Cliente (Integer numero, String nombre){
        this.numeroCliente = numero;
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }


    public String getNombre() {
        return nombre;
    }


    public void incrementarDeuda(Double valor){
        this.deuda = this.deuda + valor;
    }
    public void pagarDeuda(){
        this.deuda = 0.0;
    }
}
