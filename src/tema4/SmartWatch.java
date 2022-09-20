package tema4;

public class SmartWatch extends SmartDivice{
    boolean modoDeportivo;
    boolean modoReloj;
    boolean modoNotificaciones;
    boolean modoMusica;

    public SmartWatch() {
    }

    public SmartWatch(String color, String fabricante, float Pantalla,
                      String modelo, String sistemaOperativo, String Marca,
                      boolean modoDeportivo, boolean modoReloj,
                      boolean modoNotificaciones, boolean modoMusica) {
        super(color, fabricante, Pantalla, modelo, sistemaOperativo, Marca);
        this.modoDeportivo = modoDeportivo;
        this.modoReloj = modoReloj;
        this.modoNotificaciones = modoNotificaciones;
        this.modoMusica = modoMusica;
    }


    @Override
    public String toString() {
        return "SmartWatch{" +
                "modoDeportivo=" + modoDeportivo +
                ", modoReloj=" + modoReloj +
                ", modoNotificaciones=" + modoNotificaciones +
                ", modoMusica=" + modoMusica +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", Pantalla=" + Pantalla +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", Marca='" + Marca + '\'' +
                '}';
    }
}
