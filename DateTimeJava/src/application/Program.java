package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		//Data e Hora em Java
		
				LocalDate d01 = LocalDate.now();
				LocalDateTime d02 = LocalDateTime.now();
				Instant d03 = Instant.now();
				
				//é possível pedir um horario predefinido de varias formas, no ultimo exemplo, eu passo o GMT-3 e ele faz o calculo com base no horario de londres
				LocalDate d04 = LocalDate.parse("2022-07-20");
				LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
				Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
				Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
				
				DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");// possivel também fazer dessa forma
				LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);//se não for passado que a primeira parte é dia a segunda é mÊs e a terceira é ano
				//o programa ire retornar um erro, para corrigir esse erro basta instanciar a classe DateTimeFormatter encontrada n
				//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
				//Instancia na linha 66, passei como argumento o objeto na linha 68
				
				LocalDate d09 = LocalDate.of(2022, 7, 20);// entre outras possíbilidades
				
				System.out.println(d01);
				System.out.println(d02);
				System.out.println(d03);//o Instant chama a hora usando o padrão gmt com o horario de londres
				System.out.println("------------");
				System.out.println(d04);
				System.out.println(d05);
				System.out.println(d06);
				System.out.println(d07);
				System.out.println(d08);
				System.out.println(d09);
				
				//Possibilidades para aplicar a formatação
				System.out.println("d04 = " + d04.format(fmt1));
				System.out.println("d04 = " + fmt1.format(d04));
				
				System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				//Dessa forma é necessario criar o obejto mas como não existe objeto, não é possível o reaproveitamento
				
				DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
				
				
				LocalDate d10 = LocalDate.parse("2022-07-20");
				LocalDate pastWeek = d10.minusDays(7);
				LocalDate NextWeek = d10.plusDays(7);
				LocalDate NextYear = d10.plusYears(2);
				//Existem ainda outras possibilidades como por exemplo meses
				System.out.println("d10 in the Next Week " + NextWeek);
				System.out.println("d10 in the Past Week " + pastWeek);
				System.out.println("d10 in the Next Year " + NextYear);
				//Usando instant fica:
				Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
				System.out.println("d06 in the past Week " + pastWeekInstant);
				
				Duration t1 = Duration.between(NextWeek.atStartOfDay(), d10.atTime(0,0));
				//Tive que colocar o AtTime, para tranformar ele LocalDateTime
				//Em local dateTime não é necessário
				//é Possível utilizar o atTime ou o atStartofDay
				System.out.println("Diferença de " + t1.toDays() + " dias");
				
				System.out.println("------------");
				
				SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
				Date y1 = sdf1.parse("25/02/2022");
				Date y2 = sdf2.parse("25/02/2022 15:42:07");
				
				System.out.println(sdf2.format(y1));
				System.out.println(y1);
				
				System.out.println(sdf2.format(y2));
				System.out.println(y2);
	}

}
