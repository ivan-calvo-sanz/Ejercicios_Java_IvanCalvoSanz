package _09_FICHEROS_ejercicio_01_DataInputStream_DataOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);

        //D:\\00_ICALVO_ESCRITORIO\\ICSProgramacion\\0_Java\\0_Biblioteca_Java_IvanCalvoSanz\\00_PRUEBAS\\example.dat
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\00_ICALVO_ESCRITORIO\\ICSProgramacion\\0_Java\\0_Biblioteca_Java_IvanCalvoSanz\\00_PRUEBAS\\example.dat", true)); DataInputStream dis = new DataInputStream(new FileInputStream("D:\\00_ICALVO_ESCRITORIO\\ICSProgramacion\\0_Java\\0_Biblioteca_Java_IvanCalvoSanz\\00_PRUEBAS\\example.dat"))) {

            System.out.println("Introduce el nombre de la persona:");
            String nombre = sn.next();

            System.out.println("Introduce la edad de la persona:");
            int edad = sn.nextInt();

            System.out.println("Introduce la altura de la persona:");
            float altura = sn.nextFloat();

            System.out.println("Introduce el peso de la persona:");
            float peso = sn.nextFloat();

            dos.writeUTF(String.format("%-20.20s", nombre));
            dos.writeInt(edad);
            dos.writeFloat(altura);
            dos.writeFloat(peso);
            dos.flush();

            int numPersonas = 0;
            float mediaEdad;
            int sumaEdades = 0;
            String personaMasAlta = "";
            float mayorAltura = 0;
            float sumaPesos = 0;
            while (dis.available() > 0) {
                nombre = dis.readUTF();
                edad = dis.readInt();
                sumaEdades += edad;
                altura = dis.readFloat();
                if (altura > mayorAltura) {
                    mayorAltura = altura;
                    personaMasAlta = nombre;
                }
                peso = dis.readFloat();
                sumaPesos += peso;
                numPersonas++;
            }
            mediaEdad = (float) sumaEdades / numPersonas;

            System.out.println("Numero de personas: " + numPersonas);
            System.out.println("Media de edad: " + mediaEdad);
            System.out.println("Nombre de la persona mas alta: " + personaMasAlta);
            System.out.println("Suma de los pesos: " + sumaPesos);

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

    }
}
