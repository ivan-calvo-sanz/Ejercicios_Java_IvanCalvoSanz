package _08_FICHEROS_ejercicio_02_BufferedReader_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Path path = Paths.get("index.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toString(), true))) { // ",true" es del FileWriter hace que se pueda sobreescribir en el txt respetando lo ya existente
            bw.write("<html>");
            bw.newLine();

            bw.write("\t<head>");
            bw.newLine();
            bw.write("\t\t<title>Ejercicio</title>");
            bw.newLine();
            bw.write("\t</head>");
            bw.newLine();

            bw.write("\t<body>");
            bw.newLine();
            bw.write("\t\t<h1>Hola Mundo 3</h1>");
            bw.newLine();
            bw.write("\t</body>");
            bw.newLine();

            bw.write("</html>");
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
