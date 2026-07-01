import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int arrayNumber;
        while(true){
            if(!scanner.hasNextInt()){
                System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next(); // Bỏ qua giá trị không hợp lệ
                continue;
            }
            arrayNumber = scanner.nextInt();
            break;
        }

        if (arrayNumber <= 0) {
            System.out.println("Mảng Không có phần tử.");
            return;
        }
        int[] array = new int[arrayNumber];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < arrayNumber; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                    scanner.next(); // Bỏ qua giá trị không hợp lệ
                    continue;
                }
                array[i] = scanner.nextInt();
                break;
            }
        }
        scanner.close();
        for (int i = 0; i < arrayNumber - 1; i++) {
            for (int j = 0; j < arrayNumber - 1; j++) {
                if (array[j] % 2 != 0  && array[j + 1] % 2 == 0) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for(int num : array) {
            System.out.print(num + " ");
        }
    }
}