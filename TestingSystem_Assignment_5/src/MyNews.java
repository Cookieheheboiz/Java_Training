import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        News news = new News();
        while (true) {
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average news");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (option) {
                case 1:
                    news = new News();
                    System.out.print("Nhap tieu de: ");
                    news.setTitle(scanner.nextLine());
                    System.out.print("Nhap ngay xuat ban: ");
                    news.setPublishDate(scanner.nextLine());
                    System.out.print("Nhap ten tac gia: ");
                    news.setAuthor(scanner.nextLine());
                    System.out.print("Nhap noi dung: ");
                    news.setContent(scanner.nextLine());
                    System.out.print("Nhap 3 danh gia: ");
                    int[] rates = new int[3];
                    for (int i = 0; i < 3; i++) {
                        rates[i] = scanner.nextInt();
                    }
                    news.setRates(rates);
                    break;

                case 2:
                    if (news == null) {
                        System.out.println("Khong co tin nao");
                    } else {
                        news.Display();
                    }
                    break;

                case 3:
                    if (news == null) {
                        System.out.println("Khong co tin nao");
                    } else {
                        news.Calculate();
                        news.Display();
                    }
                    break;

                case 4:
                    System.out.println("Thoat chuong trinh");
                    return;
            }
        }
    }
}
