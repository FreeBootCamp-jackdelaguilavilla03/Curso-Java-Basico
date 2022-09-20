package tema4;

public class mainSM {
    public static void main(String[] args) {
        SmartPhone celular = new SmartPhone( "amarillo", "Samsung", 6.5f,
                "S20", "Android", "Samsung", "Nano",
                "5000mAh", "128GB", 3);
        SmartWatch reloj =  new SmartWatch("rojo", "Samsung", 1.5f,
                "S20", "Android", "Samsung", true,
                true, true, true);

        System.out.println(celular.toString());
        System.out.println("-------------------------------------------------");
        System.out.println(reloj.toString());
    }


}
