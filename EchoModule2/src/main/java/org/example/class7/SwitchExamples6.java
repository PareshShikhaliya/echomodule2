package org.example.class7;

public class SwitchExamples6
{
    public static void main(String[] args) {
        // Traditional switch statement (prior to Java 12)
        int day = 3;
        String dayName;

        switch (day)
        {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            default:
                dayName = "Weekend";
        }

        System.out.println("Traditional switch:");
        System.out.println("Day " + day + " is " + dayName);

        // Switch expression with yield (Java 14 and later)
        int month = 7;
        String quarter = switch (month)
                {
            case 1, 2, 3: {
                yield "Q1";
            }
            case 4, 5, 6:
                yield "Q2";
            case 7, 8, 9:
                yield "Q3";
            case 10, 11, 12:
                yield "Q4";
            default:
                yield "Invalid";
        };

        System.out.println("quarter switch:" + quarter);

        // Switch expression (Java 14 and later)
        String quarterArrowCase = switch (month) {
            case 1, 2, 3 -> "Q1";
            case 4, 5, 6 -> "Q2";
            case 7, 8, 9 -> "Q3";
            case 10, 11, 12 -> "Q4";
            default -> "Invalid";
        };

        System.out.println("\nSwitch expression with yield:");
        System.out.println("Month " + month + " belongs to " + quarterArrowCase);
    }
}
