package OOP_PracticalTasks.OOP_PT5_18jan;

import java.time.LocalDate;
import java.util.Map;

public class AttendanceView {

    private AttendanceService attendanceService;

    public AttendanceView(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    public void showAttendance() {
        Map<String, Map<LocalDate, Boolean>> logAttendance = attendanceService.getLogAttendance();

        for (String student : logAttendance.keySet()) {
            System.out.println(student + ":");
            Map<LocalDate, Boolean> studentLogAttendance = logAttendance.get(student);
            for (LocalDate date : studentLogAttendance.keySet()) {
                System.out.println("\t" + date + ": " + (studentLogAttendance.get(date) ? "+" : "-"));
            }
            System.out.println();
        }
    }
}
