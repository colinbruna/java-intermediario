package aulas85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {

    public static void main(String[] args) {

        System.out.println("Locale atual " + Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

        System.out.println("Hello pt_BR: " + rb.getString("hello"));
        System.out.println("World pt_BR: " + rb.getString("world"));

        Locale.setDefault(new Locale("en_BR", "en_BR"));
        rb = ResourceBundle.getBundle("meu-texto");

        System.out.println("Olá en_BR: " + rb.getString("hello"));
        System.out.println("Mundo en_BR: " + rb.getString("world"));
    }
}