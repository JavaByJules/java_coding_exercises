package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        dateTime = LocalDateTime.from(date.atTime(0, 0));
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime.plusSeconds(1000000000);
    }
}
