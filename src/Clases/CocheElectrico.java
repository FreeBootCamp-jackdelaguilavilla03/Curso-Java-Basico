package Clases;

public class CocheElectrico extends Coche{

    String motorElectrico;

    public CocheElectrico(){

    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, double peso, double largo,String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad){
        double canAdjust = cantidad * 0.8f;
        super.acelerar((int) canAdjust);

    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
