package aulas85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();

        System.out.println("Fuso horário que está sendo usado: " + tz); // América/São Paulo

//      Para saber os fusos horários que existem no java
//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso: fusos) {
//			System.out.println(fuso);
//		}

        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");

        System.out.println("Novo fuso horário que está sendo usado: " + tzNY.getDisplayName());
        System.out.println("Display do nome: " + tzNY.getID());

        //Converter e salvar datas
        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        System.out.print("Data e horário formatados no BR: ");
        System.out.println(sdf.format(agora.getTime()));

        //continua no horario de São Paulo
        Calendar agoraNY = Calendar.getInstance(tzNY);
        System.out.println("TimeZone NY " + agoraNY.getTimeZone());
        System.out.println("Aparece no formato BR " + sdf.format(agoraNY.getTime()));

        //passando para horário de New York
        agoraNY.add(Calendar.HOUR_OF_DAY, tzNY.getOffset((System.currentTimeMillis())) / 1000 / 60/ 60);
        System.out.print("Data e horário formatados no NY: ");
        System.out.println(sdf.format(agoraNY.getTime()));
    }
}
