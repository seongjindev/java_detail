package aboutdatatime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ExDateTime {
    public static void main(String[] args) throws InterruptedException {
        //과거 Date
        Date date = new Date(); //Date인데 시간까지 다룬다 - 클래스이름이 명확하지 않다
        long time = date.getTime();
        System.out.println(date);
        System.out.println(time);

        Thread.sleep(1000*2);
        Date after2Seconds = new Date();
        System.out.println(after2Seconds);
        after2Seconds.setTime(time);
        System.out.println(after2Seconds); //mutable 하다

//        Calendar today = new GregorianCalendar(2021, 7, 26); //month는 0부터 시작한다 //타입안정성이 없다
        Calendar today = new GregorianCalendar(2021, Calendar.JULY, 26); //month는 0부터 시작한다 //타입안정성이 없다
        System.out.println("today = " + today.getTime());
        System.out.println("----------");

        //기계용 시간
        Instant instant = Instant.now();
        System.out.println(instant); //기준시 UTC = GMT
        System.out.println(instant.atZone(ZoneId.of("UTC")));
        
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);
        System.out.println("zonedDateTime = " + zonedDateTime);

        //인류용 시간
        LocalDateTime now = LocalDateTime.now(); //system zone //서버가 다르면 그 서버의 로컬시간
        System.out.println("now = " + now);
        LocalDateTime today1 = LocalDateTime.of(2021,7,26,0,0,0);
        System.out.println("today1 = " + today1);
        
        //기계용 기간을 비교 -> duration
        Instant now1 = Instant.now();
        Instant plus = now1.plus(20, ChronoUnit.SECONDS);
        Duration between = Duration.between(now1, plus);
        System.out.println("between.getSeconds() = " + between.getSeconds());

        //인류용 시간을 비교 -> period
        LocalDate today2 = LocalDate.now();
        System.out.println("today2 = " + today2);
        LocalDate tomorrow = LocalDate.of(2021,7,27);
        
        Period period = Period.between(today2, tomorrow);
        System.out.println("period.getDays() = " + period.getDays());

        Period until = today2.until(tomorrow); //이때까지
        System.out.println("until.get(ChronoUnit.DAYS) = " + until.get(ChronoUnit.DAYS));
        System.out.println("until.getDays() = " + until.getDays());

        //포메팅
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE); //미리 정의되어있는것을 사용하자
        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(now2.format(yyyyMMdd));

        LocalDate parse = LocalDate.parse("2021/07/26",yyyyMMdd);
        System.out.println(parse);

        //예전 API와 호환
        Date date2 = new Date();
        Instant instant2 = date.toInstant(); //현재것으로 호환

        Date newDate = Date.from(instant); //과거것으로 호환

        //기타
        LocalDateTime now3 = LocalDateTime.now();
        LocalDateTime plus1 = now3.plus(10, ChronoUnit.DAYS); //ChronoUnit 외우자, 새로운 인스턴스를 만들자
        System.out.println("plus = " + plus1);


    }
}
