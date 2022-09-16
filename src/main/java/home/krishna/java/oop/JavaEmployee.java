package home.krishna.java.oop;

public class JavaEmployee {
    private final String firstName;
    private final Boolean isFullTime;

    public JavaEmployee(String firstName) {
        this.firstName = firstName;
        isFullTime = true;
    }

    public JavaEmployee(String firstName, Boolean isFullTime) {
        this.firstName = firstName;
        this.isFullTime = isFullTime;
    }
}
