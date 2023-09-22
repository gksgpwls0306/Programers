import java.time.*;
import java.time.format.*;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016,a,b);
        DayOfWeek day = date.getDayOfWeek();
        // day = dayOfWeek.getDisplayName
        answer = day.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
        return answer;
    }
}