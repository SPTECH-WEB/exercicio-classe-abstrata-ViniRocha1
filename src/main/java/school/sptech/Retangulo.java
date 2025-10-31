package school.sptech;

public class Retangulo extends Figura {

    private Double base;

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    private Double altura;

    public Retangulo(){}

    @Override
    public Double calcularArea(){
        return base*altura;
    }

    @Override
    public String toString(){
        return "A área do retangulo é: " + calcularArea();
    }



}
