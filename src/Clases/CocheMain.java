package Clases;

public class CocheMain {
    public static void main(String[] args) {
        CocheElectrico cocheElectrico = new CocheElectrico("rojo","Tesla","Model 3", 2000, 4.5,"Tesla");
        cocheElectrico.acelerar(200);
        System.out.println(cocheElectrico.toString());
    }


}
