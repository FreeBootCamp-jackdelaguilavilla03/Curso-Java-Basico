package Conceptos;

public class retornoFunciones {
    public static void main(String[] args) {
        //el public permite tener acceso al metodo de cualquier parte del programa
        Funciones.holamundo();
        //el metodo protected te permite acceder a los metodos siempre y cuando sea del mismo package
        Funciones.adiosmundo();

        //Sobre carga de funciones es funcional dependiendo el tipo de variable que se ingresa por parametro
        int sumatotal = Funciones.suma(1, 2);
        float sumatotal2 = Funciones.suma(1.5f, 2.5f);
        System.out.println("1 + 2  = " + sumatotal);
        System.out.println("1.5 + 2.5 = " + sumatotal2);
    }
}

