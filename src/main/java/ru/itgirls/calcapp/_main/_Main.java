import ru.itgirls.calcapp.service.ResultWriterService;

import java.util.Scanner;


public class _Main {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int i = 1;
        while (i < 3) {
            System.out.println("введите значение a");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("введите значение b");
            int b = Integer.parseInt(sc.nextLine());
            i++;

            ResultWriterService.printResult(a, b);
        }

    }

}
