package aulas85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss a z");

        Calendar data = new GregorianCalendar(2022, 01, 16, 20, 41, 00);

        System.out.println(sdf.format(data.getTime()));

        System.out.println("----");

        Date hoje = new Date();

        System.out.println(sdf.format(hoje));

        System.out.println("----");

        String d = sdf.format(hoje);
        System.out.println(hoje);

        System.out.println("----");

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";

        try {
            Date minhaDataEmDate = sdf1.parse(minhaData);

            System.out.println(minhaDataEmDate);

            System.out.println(sdf.format(minhaDataEmDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
