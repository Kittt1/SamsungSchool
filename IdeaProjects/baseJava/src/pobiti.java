import java.util.Scanner;

public class pobiti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        System.out.println("Операция и на a, b: " + (a & b));//Операция и
        System.out.println("Операция или на a, b: " + (a | b));//Операция или
        System.out.println("Операция исключаещего или на a, b: " + (a ^ b));//Операция исключаещего или
        System.out.println("Операция не на a, b: " + (~a + " " + ~b));//Операция не
        System.out.println("Арифметический сдвиг влево a на b: " + (a << b));//Арифметический сдвиг влево a на b
        System.out.println("Арифметический сдвиг влево b на a: " + (b << a));//Арифметический сдвиг влево b на a
        System.out.println("Арифметический сдвиг вправо a на b: " + (a >> b));//Арифметический сдвиг вправо a на b
        System.out.println("Арифметический сдвиг вправо b на a: " + (b >> a));//Арифметический сдвиг вправо b на a
        System.out.println("Логический сдвиг вправо a на b: " + (a >>> b));//Логический сдвиг вправо a на b
        System.out.println("Логический сдвиг вправо b на a: " + (b >>> a));//Логический сдвиг вправо b на a
    }
}
