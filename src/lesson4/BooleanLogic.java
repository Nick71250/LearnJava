package lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
        //Логическое И. Если обе булевы переменные true => все выражение true
        //Если хотя бы одно из иначений булевой переменной false => все выражение false
        //Обозначается двойным амперсандом - &&
        boolean isBoughtBread = false;
        boolean isBoughtMilk = true;

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Сынок, ты молодец все купил!");
        } else if (isBoughtBread && !isBoughtMilk) {
            System.out.println("Где молоко? Ты купил только хлеб!");
        } else if (!isBoughtBread && isBoughtMilk) {
            System.out.println("Где хлеб? Ты купил только молоко!");
        } else {
            System.out.println("Ты почему ничего не купил?");
        }

        //Логическое ИЛИ. Если хотябы одна из булевых переменных true => все выражение true
        //Если обе булевы переменные false => все выражение false
        //Обозначается двойной прямой чертой = ||
        if (isBoughtBread || isBoughtMilk) {
            System.out.println("Молодец сынок, хоть что-то купил");
        } else {
            System.out.println("Плохо, ничего не купил!");
        }
    }
}
