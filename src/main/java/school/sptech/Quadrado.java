package school.sptech;

public class Quadrado extends Figura {

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    private Double lado;

    public Quadrado() {}

    @Override
    public Double calcularArea(){
        return lado*lado;
    }

    @Override
    public String toString(){
        return "A área do quadrado é: " + calcularArea();
    }



}
