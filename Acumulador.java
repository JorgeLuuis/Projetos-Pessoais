package AulaRoberto;

public class Acumulador {
    public static void main(String[] args){
        System.out.println("   ");
        int contador = 1;
        double valor = 0.10;
        double acumulado = 0;
        while (contador<=30){
            System.out.println(contador + "-" + valor);
            contador++;
            acumulado = acumulado + valor;
            valor = valor * 2;
        }
        System.out.println("O valor acumulado é " + acumulado);
    }
}
