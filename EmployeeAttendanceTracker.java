package com.company.attendance;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeAttendanceTracker {
    private Map<String, List<LocalDate>> attendance = new HashMap<>();

   
    public void markAttendance(String employeeId) {
        attendance.computeIfAbsent(employeeId, k -> new ArrayList<>()).add(LocalDate.now());
    }

   
    public Optional<List<LocalDate>> getAttendance(String employeeId) {
        return Optional.ofNullable(attendance.get(employeeId));
    }

    public void displayAttendance() {
        attendance.forEach((id, dates) -> 
            System.out.println("Employee ID: " + id + " | Dates: " + dates)
        );
    }

    public static void main(String[] args) {
        EmployeeAttendanceTracker tracker = new EmployeeAttendanceTracker();
        tracker.markAttendance("1");
        tracker.markAttendance("2");
        tracker.markAttendance("3");

        tracker.displayAttendance();

        tracker.getAttendance("1").ifPresentOrElse(
            dates -> System.out.println("1 Attendance: " + dates),
            () -> System.out.println("No record for 1")
        );
    }
}
