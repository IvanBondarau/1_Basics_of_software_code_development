package by.java_tutorial.week1.looping;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i < (1 << 16); i++) {
            System.out.println((char)(i) + " " + i);
        }
    }
}
