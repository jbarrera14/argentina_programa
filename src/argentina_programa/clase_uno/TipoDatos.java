package argentina_programa.clase_uno;

public class TipoDatos {

    private int number = 2;
    char caracter = 'z';

    char arrayChar[] = new char[5];

    int arrayint[] = {4,5,3} ; //
    int arrayIntDos[] = new int[5];

    int arrayTres[] = new int[]{1, 2, 3};
    int cantidaPalabras= 25;
    int arrayIntTres[] = new int[cantidaPalabras];

    private String cadena = "hola";

    public int[] getArrayint() {
        return arrayint;
    }

    public void setArrayint(int[] arrayint) {
        this.arrayint = arrayint;
    }

    public int[] getArrayIntDos() {
        return arrayIntDos;
    }

    public void setArrayIntDos(int[] arrayIntDos) {
        this.arrayIntDos = arrayIntDos;
    }

    public int[] getArrayTres() {
        return arrayTres;
    }

    public void setArrayTres(int[] arrayTres) {
        this.arrayTres = arrayTres;
    }

    public int getCantidaPalabras() {
        return cantidaPalabras;
    }

    public void setCantidaPalabras(int cantidaPalabras) {
        this.cantidaPalabras = cantidaPalabras;
    }

    public int[] getArrayIntTres() {
        return arrayIntTres;
    }

    public void setArrayIntTres(int[] arrayIntTres) {
        this.arrayIntTres = arrayIntTres;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public char[] getArrayChar() {
        return arrayChar;
    }

    public void setArrayChar(char[] arrayChar) {
        this.arrayChar = arrayChar;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getCaracter() {
        return caracter;
    }


    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int sumatoria (int vector[] ) {

        int resultado = 0;

        for ( int i = 0; i < vector.length; i++ ) {
            resultado = resultado + vector[i];
        }

        return resultado;
    }
}
