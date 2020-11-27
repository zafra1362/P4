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
        /*System.out.println("Text a xifrar:");
        String text = scanner.nextLine();
        byte[] txt = text.getBytes("UTF8");
        SecretKey secretKey = Xifrar.keygenKeyGeneration(256);
        byte[] txtx = Xifrar.encryptData(txt, secretKey);
        System.out.println(txtx);
        byte[] txtd = Xifrar.decryptData(txtx, secretKey);
        String textx = new String(txtd, StandardCharsets.UTF_8);
        System.out.println(textx);*/

        //1.6
        /*System.out.print("Introdueix text: ");
        String textC = scanner.nextLine();
        System.out.print("Introdueix contrasenya: ");
        String password = scanner.nextLine();
        SecretKey secretKeyPassword = Xifrar.passwordKeyGeneration(password,256);
        byte[] xifrarC = Xifrar.encryptData(textC.getBytes(), secretKeyPassword);
        System.out.println(xifrarC);
        byte[] desxifrarC = Xifrar.decryptData(xifrarC, secretKeyPassword);
        System.out.println(new String(desxifrarC));*/

        //1.7

    }


}
