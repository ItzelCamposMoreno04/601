package pkg5.v4trifiv;

import funciones.funcionMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V4TRIFIV {

    public static void main(String[] args) throws IOException {
    BufferedReader bufEntrada = new BufferedReader(new InputStreamReader (System.in));
         int numero;
         //creo objeto
         funcionMultiplo mult = new funcionMultiplo();
         //Entrada de datos
         System.out.println("Dame el numero");
         numero = Integer.parseInt(bufEntrada.readLine());
         //salida de datos
         System.out.println(mult.retornaMultiplo(numero));
         
    }
    
}
