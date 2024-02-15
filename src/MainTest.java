import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.Assert.*;
public class MainTest {

    @Test
    public void mainTest() {
        OffsetDateTime odt = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);

        String dataFormatter = odt.format(formatter);

        assertEquals("01 marzo 2023", dataFormatter);
    }
}