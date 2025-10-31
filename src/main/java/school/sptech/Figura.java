package school.sptech;

public abstract class Figura {
    public Figura() {
    }



    private String cor;
    private Integer espessura;

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }



    public abstract Double calcularArea();


}
