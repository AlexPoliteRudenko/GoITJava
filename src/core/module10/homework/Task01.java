package core.module10.homework;

public class Task01 {
    public static void main(String[] args) {
        try {
            throw new Exception("some error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
