import java.util.Scanner;

public class pobiti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        System.out.println(a & b);//Операция и на a, b
        System.out.println(a | b);//Операция или на a, b
        System.out.println(a ^ b);//Операция исключаещего или на a, b
        System.out.println(~a + ~b);//Операция не на a, b
        System.out.println(a << b);//Арифметический сдвиг влево a на b
        System.out.println(b << a);//Арифметический сдвиг влево b на a
        System.out.println(a >> b);//Арифметический сдвиг вправо a на b
        System.out.println(b >> a);//Арифметический сдвиг вправо b на a
        System.out.println(a >>> b);//Логический сдвиг вправо a на b
        System.out.println(b >>> a);//Логический сдвиг вправо b на a
    }
}