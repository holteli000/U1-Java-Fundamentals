public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */

    public static void main(String[] args) {
        int totalSeconds = 87987;
        int totalHours = totalSeconds / 3600;
        int totalMinutes = totalSeconds / 60;


        System.out.println("the amount of seconds into hours is: " + totalHours + "hours");
        System.out.println(" the amount of seconds into minutes is: " + totalMinutes + "minutes");
        System.out.println(" the amount of total seconds is: " + totalSeconds + "seconds");
    }
}
