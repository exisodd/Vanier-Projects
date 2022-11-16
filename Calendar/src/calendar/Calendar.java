/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendar;

/**
 *
 * @author Ethan
 */
public class Calendar {

    int year, month, day;

    public Calendar() {
        year = 2020;
        month = 1;
        day = 1;
    }

    public Calendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Calendar(Calendar calendar) {
        year = calendar.year;
        month = calendar.month;
        day = calendar.day;
    }

    public void increaseDay() {
        if (day+1 > getDaysInMonth()) {
            day = 1;
            increaseMonth();
        } else {
            day++;
        }
    }

    public void increaseMonth() {
        month = (month+1 > 12) ? 1: month+1;
    }

    public void increaseYear() {
        year++;
    }

    public boolean isLeapYear() {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public int getDaysInMonth() {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> (isLeapYear()) ? 29: 28;
            default -> -1;
        };
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public boolean equals(Calendar calendar) {
        return calendar.year == year &&
               calendar.month == month &&
               calendar.day == day;
    }

}
