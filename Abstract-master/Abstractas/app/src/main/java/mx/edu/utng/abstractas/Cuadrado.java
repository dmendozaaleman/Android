package mx.edu.utng.abstractas;

/**
 * danielmendoza
 */
public class Cuadrado extends Figura{
    private float lado;
    @Override
    public float calcularArea() {
        return (lado * lado);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado=lado;
    }
}
