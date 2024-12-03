import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

public class DayEnumPractice {
    public static void main(String[] args) {
//        DayEnumPractice.switchPractice();
//        DayEnumPractice.enumMapPractice();
        DayEnumPractice.enumSetPractice();
    }


    public static void switchPractice() {
        Day day = Day.SUNDAY;
        System.out.println(day);
        switch (day) {
            case MONDAY:
                System.out.println("월");
                break;
            case SUNDAY:
                System.out.println("일");
                break;
        }
    }

    public static void enumMapPractice() {
        EnumMap<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.SUNDAY, "일요일은 일하는 날");
        map.put(Day.MONDAY, "월요일은 월래 일하는 날");
        System.out.println(map.get(Day.MONDAY));
    }

    public static void enumSetPractice() {
        EnumSet<Day> enumSet1 = EnumSet.allOf(Day.class);
        Iterator<Day> iterator1 = enumSet1.iterator();
        EnumSet<Day> enumSet2 = EnumSet.range(Day.WENDSDAY, Day.FRIDAY);
        Iterator<Day> iterator2 = enumSet2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }

}
