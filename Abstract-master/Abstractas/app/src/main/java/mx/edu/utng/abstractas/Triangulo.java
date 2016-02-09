package mx.edu.utng.abstractas;

/**
 * danielmendoza
 */
public class Triangulo extends Figura {
private float base;
    private float altura;
    @Override
    public float calcularArea() {
        return (base * altura)/2;
    }
}
