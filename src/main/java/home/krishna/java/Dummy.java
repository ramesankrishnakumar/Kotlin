package home.krishna.java;
public class Dummy {

    public String vacationMessage(boolean isOnVacation) {
        return isOnVacation ? "I'm on vacation" : "I'm working" ;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public void printArrayOfElements(int[] nums) {
        for (int i : nums) {
            System.out.println("i: " + i);
        }
    }

    public void printArrayOfElements(Integer[] nums, String a) {
        for (int i : nums) {
            System.out.println("i: " + i);
        }
    }
}
