package by.java_tutorial.week1.looping;

public class Task3 {
    public static void main(String[] args) {
        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            ans += i*i;
        }
        System.out.println(ans);
    }
}
