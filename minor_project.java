import java.util.Scanner;

class Collection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks[] = new int[10];
        int total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter marks for student:" + i + 1);
            marks[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);

        }
        scanner.close();
    }
}