import java.time.LocalDate;

public class Holiday {
    String time;
    String name;
    boolean isHoliday;

    Holiday() {

    }

    Holiday(String time, String name, boolean isHoliday) {
        this.time = time;
        this.name = name;
        this.isHoliday = isHoliday;
    }
}
