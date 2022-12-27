/**
 * @author Javier Quintana Llitrá
 * @version 1.0
 */

package figuras;

public class Circunferencia {
    private double radio;
    private String color;

    public Circunferencia(double radio)
    {
        this.radio = radio;
    }
    public double getRad() {
        return radio;
    }

    public void setRad(double rad) {
        this.radio = rad;
    }

    /**
     * Método para imprimir diámetro, color y área.
     */
    public void imprimir()
    {
        color = "rojo";
        System.out.println("Di�metro: " + 2*radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);

    }

    /**
     * Método que compara dos radios para saber si son iguales
     * @param considerarDecimales boolean para saber si compara o no decimales
     * @param otro objeto tipo circunferencia
     * @return True si son iguales, False si no lo son.
     */
    public boolean esIgual (boolean considerarDecimales, Circunferencia otro)
    {
        double radio1 = this.radio;
        double radio2 = otro.getRad();
        if (considerarDecimales)
        {
            return radio1 == radio2;
        }
        else
        {
            return Math.abs(radio1 - radio2) < 1;
        }
    }
}

