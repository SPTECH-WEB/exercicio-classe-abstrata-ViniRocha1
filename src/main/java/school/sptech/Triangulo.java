package school.sptech;

public class Triangulo extends Figura {

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
    private Double base;

    public Triangulo(){}

    @Override
    public Double calcularArea(){
        return (base*altura)/2;
    }
    @Override
    public String toString(){
        return "A área do triangulo é: " + calcularArea();
    }


}
