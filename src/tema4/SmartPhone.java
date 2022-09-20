package tema4;

public class SmartPhone extends SmartDivice {
    String tarjetaSim;
    String capacidadBateria;
    String capacidadAlmacenamiento;
    int numeroCamaras;


    public SmartPhone() {
    }

    public SmartPhone(String color, String fabricante,float Pantalla ,String modelo,
                      String sistemaOperativo, String Marca, String tarjetaSim,
                      String capacidadBateria, String capacidadAlmacenamiento, int numeroCamaras) {
        super(color, fabricante, Pantalla, modelo, sistemaOperativo, Marca);
        this.tarjetaSim = tarjetaSim;
        this.capacidadBateria = capacidadBateria;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.numeroCamaras = numeroCamaras;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tarjetaSim='" + tarjetaSim + '\'' +
                ", capacidadBateria='" + capacidadBateria + '\'' +
                ", capacidadAlmacenamiento='" + capacidadAlmacenamiento + '\'' +
                ", numeroCamaras=" + numeroCamaras +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", Pantalla=" + Pantalla +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", Marca='" + Marca + '\'' +
                '}';
    }
}
