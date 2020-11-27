package xifrat;

import javax.crypto.SecretKey;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //1.5
        System.out.println("Text a xifrar:");
        String text = scanner.nextLine();
        byte[] txt = text.getBytes("UTF8");
        SecretKey secretKey = Xifrar.keygenKeyGeneration(256);
        byte[] txtx = Xifrar.encryptData(txt, secretKey);
        System.out.println(txtx);
        byte[] txtd = Xifrar.decryptData(txtx, secretKey);
        String textx = new String(txtd, StandardCharsets.UTF_8);
        System.out.println(textx);

        //1.6
        System.out.print("Introdueix text: ");
        String textC = scanner.nextLine();
        System.out.print("Introdueix contrasenya: ");
        String password = scanner.nextLine();
        SecretKey secretKeyPassword = Xifrar.passwordKeyGeneration(password,256);
        byte[] xifrarC = Xifrar.encryptData(textC.getBytes(), secretKeyPassword);
        System.out.println(xifrarC);
        byte[] desxifrarC = Xifrar.decryptData(xifrarC, secretKeyPassword);
        System.out.println(new String(desxifrarC));

        //1.7
        System.out.println("getEncoded: "+ secretKey.getEncoded());
        System.out.println("getAlgorithm: "+ secretKey.getAlgorithm());
        System.out.println("getFormat: "+ secretKey.getFormat());

        //1.8
        SecretKey kg = Xifrar.keygenKeyGeneration(256);
        System.out.println("Frase per xifrar: ");
        String s = scanner.nextLine();
        System.out.println("Contrasenya: ");
        String contrasenyat = scanner.nextLine();
        SecretKey ct = Xifrar.passwordKeyGeneration(contrasenyat, 256);
        byte[] textM = s.getBytes("UTF8");
        byte[] textX = Xifrar.encryptData(textM, ct);
        System.out.println("Xifrat: " + textX);
        byte[] textD = Xifrar.decryptData(textX, kg);
        String textP = new String(textD, StandardCharsets.UTF_8);
        System.out.println("Desxifrat: " + textP);
    }


}
