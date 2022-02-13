package aula59;

//import estático
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; importa todos os métodos

public class StaticImport {

    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        //Todos os métodos da classe Math são estáticos, não é preciso instanciar a classe para usar os métodos
        System.out.println(Math.pow(a, b)); //potencia

        System.out.println(Math.sqrt(c)); //raiz quadrada

        System.out.println(pow(a, b));

        System.out.println(sqrt(c));
    }
}
