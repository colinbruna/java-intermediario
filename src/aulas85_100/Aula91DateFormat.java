package aulas85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println("Data de hoje: " + hoje);

        System.out.println("Locale da aplicação1: " + Locale.getDefault());

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println("Data de hoje de acordo com Locale da aplicação1: " + hojeFormatado);

        Locale.setDefault(new Locale("en", "US"));

        System.out.println("Locale da aplicação2: " + Locale.getDefault());
        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println("Data de hoje de acordo com Locale da aplicação2: " + hojeFormatado);

        //outros formatos
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println("Somente o horário: " + hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println("Somente a data: " + hojeFormatado); //dd/MMM/yyyy

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println("Data e horário: " + hojeFormatado);

        //passando um estilo
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println("Formato curto da data: " + hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println("Formato médio da data: " + hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println("Formato longo da data: " + hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
        System.out.println("Data médio e horário curto: " + hojeFormatado);

        System.out.println();
        System.out.println("Exemplo de String para Data");

        String data = "2/16/22, 10:25 PM"; //data passada de acordo com locale da aplicação que foi mudado para US
        try {
            Date dataDate = DateFormat.getInstance().parse(data);
            System.out.println("dataDate(String data): " + dataDate);
            System.out.println();

            System.out.println("Transformando o objeto do tipo Date em Calendar");
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataDate);
            System.out.println("getInstance retorna uma instância do GregorianCalendar: " + calendario);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
