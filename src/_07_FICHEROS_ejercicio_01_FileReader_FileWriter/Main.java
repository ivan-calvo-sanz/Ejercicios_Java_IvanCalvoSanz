package _07_FICHEROS_ejercicio_01_FileReader_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdice el numero:");
        int n = sc.nextInt();

        String numeros = "";
        for (int i = 1; i <= n; i++) {
            numeros += i + " ";
        }

        try (FileWriter fw = new FileWriter("numeros.txt"); FileReader fr = new FileReader("numeros.txt")) {
            // FileWriter
            fw.write(numeros);
            fw.flush(); // Asegura que todo se escribe en disco

            // FileReader
            int c;
            System.out.println("Contenido carácter a carácter:");
            while ((c = fr.read()) != -1) {
                System.out.print((char) c); // Convierte int a char
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
