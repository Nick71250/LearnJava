package lesson3;
import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        //Расчет индекса массы тела по формуле - BMI = mass / (height * height)
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш вес в кг: ");
        double mass = in.nextDouble();

        System.out.print("Введите ваш рост в м: ");
        double height = in.nextDouble();

        double BMI = mass / (height * height);

        if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("Норма");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Предожирение");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("Ожирение I степени");
        } else if (BMI >= 35 && BMI < 40) {
            System.out.println("Ожирение II степени");
        } else if (BMI >= 40 && BMI < 50) {
            System.out.println("Ожирение III степени");
        }  else if (BMI >= 50) {
            System.out.println("Кто ты, чудовище???");
        }
    }
}
