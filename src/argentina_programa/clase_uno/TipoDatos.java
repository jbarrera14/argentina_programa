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
