import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeUtils {
    public static String formatNow(String pattern) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.now().format(fmt);
    }

    public static LocalDate parseDate(String dateStr, String pattern) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateStr, fmt);
    }

    public static long daysBetween(String start, String end, String pattern) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
        LocalDate s = LocalDate.parse(start, fmt);
        LocalDate e = LocalDate.parse(end, fmt);
        return ChronoUnit.DAYS.between(s, e);
    }

    public static String toIST(LocalDateTime dt) {
        ZonedDateTime zdt = dt.atZone(ZoneId.systemDefault());
        ZonedDateTime ist = zdt.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        return ist.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    public static void main(String[] args) {
        System.out.println("Now (yyyy-MM-dd HH:mm): " + formatNow("yyyy-MM-dd HH:mm"));
        System.out.println("Parse 2025-10-21: " + parseDate("2025-10-21", "yyyy-MM-dd"));
        System.out.println("Days between 2025-01-01 and 2025-10-21: " + daysBetween("2025-01-01", "2025-10-21", "yyyy-MM-dd"));
        System.out.println("Now in IST: " + toIST(LocalDateTime.now()));
    }
}
