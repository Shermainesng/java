package Challenges;

public class SecondsAndMinutes {
  //constant - final as can't be changed
  private static final String INVALID_VALUE_MESSAGE = "Invalid value";

  public static void main(String[] args) {
    System.out.println(getDurationString(100, 45));
    System.out.println(getDurationString(3945L));
  }

  public static String getDurationString(long minutes, long seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
      return INVALID_VALUE_MESSAGE;
    }
    long totalHours = minutes / 60;
    long remainingMinutes = minutes % 60;
    //formatting
    String hoursString = totalHours + "h";
    if (totalHours < 10) {
      hoursString = "0" + hoursString;
    }
    String minutesString = remainingMinutes + "m";
    if (remainingMinutes < 10) {
      minutesString = "0" + minutesString;
    }
    String secondsString = seconds + "s";
    if (seconds < 10) {
      secondsString = "0" + secondsString;
    }
    return hoursString + " " + minutesString + " " + secondsString;
  }

  private static String getDurationString(long seconds) {
    if (seconds < 0) {
      return INVALID_VALUE_MESSAGE;
    }
    long minutesConverter = seconds / 60;
    long remainingSeconds = seconds % 60;
    return getDurationString(minutesConverter, remainingSeconds);
  }
}

//javac SecondsAndMinutes.java
//java Challenges.SecondsAndMinutes
