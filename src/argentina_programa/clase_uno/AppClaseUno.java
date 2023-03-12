package argentina_programa.clase_uno;

public class AppClaseUno {

    public static void main(String[] args) {
        TipoDatos tipoDato = new TipoDatos();

        int resultado = tipoDato.sumatoria(new int[]{1, 2, 8});
        System.out.println(resultado);
    }
}
