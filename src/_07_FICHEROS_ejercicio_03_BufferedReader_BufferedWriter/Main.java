package _07_FICHEROS_ejercicio_03_BufferedReader_BufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Path path = Paths.get("password.txt");
        try {
            if (!Files.exists(path)) {
                generaFicheroPassword(path);
            } else if (!validaFicheroLineas(path, 20)) {
                generaFicheroPassword(path);
            }

            Random random = new Random();
            int filaAleatoria = random.nextInt(1, 21);
            String pass = obtenerLinea(path, filaAleatoria);
            System.out.println("El password de la linea: " + filaAleatoria + " es: " + pass);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void generaFicheroPassword(Path path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toString()))) {
            for (int i = 0; i < 20; i++) {
                bw.write(generaPassword(8));
                bw.newLine();
            }
        }
    }

    public static boolean validaFicheroLineas(Path path, int numLineas) throws IOException {
        boolean devuelve = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {
            String linea;
            int contadorLineas = 0;
            while ((linea = br.readLine()) != null) {
                contadorLineas++;
            }
            if (contadorLineas == numLineas) {
                devuelve = true;
            }
        }
        return devuelve;
    }

    public static String generaPassword(int longitud) {
        String password = " ";
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int tipo = random.nextInt(1, 4);
            switch (tipo) {
                case 1 -> {
                    password += (char) random.nextInt('a', 'z');
                }
                case 2 -> {
                    password += (char) random.nextInt('A', 'Z');
                }
                case 3 -> {
                    password += random.nextInt(0, 10);
                }
            }
        }
        return password;
    }

    public static String obtenerLinea(Path path, int numLinea) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {
            String linea = "";
            for (int i = 0; i < numLinea && linea != null; i++) {
                linea = br.readLine();
            }
            return linea;
        }
    }

}
