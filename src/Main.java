import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime odt = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);

        String dataFormatter = odt.format(formatter);

        System.out.println(dataFormatter);
    }
}