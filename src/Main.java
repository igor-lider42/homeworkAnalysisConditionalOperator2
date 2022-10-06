public class Main {
    public static void main(String[] args) {
        //Разбор домашнего заданиия 2
        System.out.println("Разбор домашнего заданиия 2");
        // Задача 1
        System.out.println("Задача 1");
        int yearsOld = 2;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        }
        else {
            System.out.println("Ваш возраст совершеннолетия ещё не наступил," +
                    " и нужно немного подождать.!");
        }

        //Задача 2
        System.out.println("Задача 2");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребёнок ходит в школу ");
        }
        else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек ходит в университет.");
        }
        else if (yearsOld>=24) {
            System.out.println("Человек ходит на работу.");
        }
        //Задача 3
        System.out.println("Задача 3");
        int capacity = 102;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount; // стоячие места

        int seatsUsed = 60;
        int otherUsed = 42;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть ещё " + (seatsCount - seatsUsed) + " сидячих мест.");
        }
        else {
            System.out.println("Сидячих мест нет!");
        }
        if (otherUsed<otherCount){
            System.out.println("Есть ещё " + (otherCount - otherUsed) + " стоячих мест.");
        }
        else {
            System.out.println("Стоячих мест нет!");
        }



    }
}