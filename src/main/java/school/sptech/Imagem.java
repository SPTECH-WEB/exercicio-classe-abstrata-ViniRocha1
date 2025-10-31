package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double soma = 0.0;
        for (Figura figura : figuras) {
            soma += figura.calcularArea();
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> retornos = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                retornos.add(figura);
            }
        }
        return retornos;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                quadrados.add(figura);
            }
        }
        return quadrados;
    }
}
