package OOP_PracticalTasks.OOP_PT5_18jan;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AttendanceService {

    private Map<String, Map<LocalDate, Boolean>> logAttendance;

    public AttendanceService() {
        logAttendance = new HashMap<>();
    }

    public void addLogAttendance(String studentName, LocalDate date, boolean attended) {
        if (!logAttendance.containsKey(studentName)) {
            logAttendance.put(studentName, new HashMap<>());
        }

        Map<LocalDate, Boolean> studentLogAttendance = logAttendance.get(studentName);
        studentLogAttendance.put(date, attended);
    }

    public Map<String, Map<LocalDate, Boolean>> getLogAttendance() {
        return logAttendance;
    }
}
