import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chiều rộng : ");
        width = scanner.nextFloat();

        System.out.println("Nhập vào chiều dài : ");
        height = scanner.nextFloat();

        float area = width * height;

        System.out.println("Diện tích Hình chữ nhật = " + area);
    }
}
