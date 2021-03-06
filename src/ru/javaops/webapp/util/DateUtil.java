package ru.javaops.webapp.util;

import java.time.LocalDate;
import java.time.Month;

public class DateUtil {
    public static final LocalDate NOW = LocalDate.of(3000, 1, 1);

    private DateUtil() {}

    public static LocalDate of(int year, Month month) {
        return LocalDate.of(year, month, 1);
    }

    public static String toString(LocalDate date) {
        return date.equals(NOW)? "Сейчас" : date.getMonth().getValue() + "/" + date.getYear();
    }
}
