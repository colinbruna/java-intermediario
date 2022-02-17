package aulas85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

    public static void main(String[] args) {

        //Trabalhando apenas com a data
        // data dd MM yyyy
        LocalDate agora = LocalDate.now();
        System.out.println("Data atual: " + agora);

        System.out.println(LocalDate.of(2019, 2, 1));
        System.out.println(LocalDate.parse("2020-02-01"));

        System.out.println("Adicionando 30 dias " + agora.plusDays(30));

        System.out.print("Menos 1 mês: ");
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));

        System.out.println("Qual dia da semana é hoje: " + agora.getDayOfWeek());
        System.out.println("Qual dia do mês é hoje: " + agora.getDayOfMonth());
        System.out.println("Qual dia do ano é hoje: " + agora.getDayOfYear());

        System.out.print("É ano bissexto: ");
        System.out.println(LocalDate.parse("2020-02-01").isLeapYear());

        //Trabalhando apenas com horário
        // hora formato ISO
        LocalTime hAgora = LocalTime.now();
        System.out.println("Hora atual: " + hAgora);

        System.out.println(LocalTime.of(20, 18));
        System.out.println(LocalTime.parse("20:18"));

        System.out.println(hAgora.plusMinutes(50));
        System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));

        System.out.println("Pegando apenas a hora atual: " + hAgora.getHour());
        System.out.println("Pegando apenas os minutos atuais: " + hAgora.getMinute());

        // Trabalhando com data completa = data + hora
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println("Data e horário atuais: " + agoraCompleto);

        System.out.println(LocalDateTime.of(2019, 2, 16, 20, 25, 10));
        System.out.println(LocalDateTime.parse("2019-02-16T20:25:10"));
        System.out.println("Acrescentando 20 anos na data de hoje: " + agoraCompleto.plusYears(20));

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println("Fuso horário: " + fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds(); //Set é uma lista de objetos que não se repetem
//      Todas as strings dos fusos que podem ser usados no java
//		for (String f : fusos) {
//			System.out.println(f);
//		}

        ZoneId ny = ZoneId.of("America/New_York");
        System.out.println("Fuso horário: " + ny);
        //ZoneDateTime é uma data e horário que tem fuso horário
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), ny);
        System.out.println("Data e hora de ny: " + zdt);
        System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-02:00[America/New_York]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println("Mais 2 horas - " + offsetdt);

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), ny);
        System.out.println(ldtDate);
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), ny));
    }
}