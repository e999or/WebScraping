package com.TestAlBa.WebScraping;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Clock {
    public static LocalDate DAYLATER = null;

    public static String date(){
        String date = new SimpleDateFormat("yyyy MM dd").format(new Date());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "yyyy MM dd" );
        LocalDate localDate = formatter.parse ( date , LocalDate :: from );

         DAYLATER = localDate.minusDays ( 1 );

        return String.valueOf(DAYLATER);
    }


}
