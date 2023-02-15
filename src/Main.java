public class Main {
        public static void main(String[] args) {
            var dog = 8.0 ;
            var cat = 3.6 ;
            var paper = 763789 ;
            System.out.println("Hello! Please find Homework #2 by Sergei Antonov as follows");
            System.out.println(" ");

            System.out.println("Задачи 1 - 3");
            System.out.println("Инициализируем переменные:");
            System.out.println("dog=" + dog + " cat=" + cat + " paper=" + paper);

            System.out.println("Увеличиваем:");
            dog = dog +4 ;
            cat = cat +4 ;
            paper = paper + 4 ;
            System.out.println("dog=" + dog + " cat=" + cat + " paper=" + paper);

            System.out.println("Уменьшаем:");
            dog = dog - 3.5 ;
            cat = cat - 1.6 ;
            paper = paper -7639 ;
            System.out.println("dog=" + dog +
                    " cat=" + cat +
                    " paper=" + paper);
            System.out.println(" ");

            System.out.println("Задача 4");
            var friend = 19;
            System.out.println(" friend = " + friend);
            friend = friend + 2;
            System.out.println("... + 2 = " + friend);
            friend = friend / 7 ;
            System.out.println("... / 7 = " + friend);
            System.out.println(" ");

            System.out.println("Задача 5");
            var frog = 3.5;
            System.out.println("  frog = " + frog);
            frog *= 10.0;
            System.out.println(" ... x10 = " + frog);
            frog = frog / 3.5 ;
            System.out.println(" ... /3.5 = " + frog);
            frog = frog + 4 ;
            System.out.println(" ... +4 = " + frog);
            System.out.println(" ");

            System.out.println("Задача 6");
            var boxerWeight1 = 78.2 ;
            var boxerWeight2 = 82.7 ;
            var totalWeight = boxerWeight1 + boxerWeight2 ;

            System.out.println("Вес первого боксера " + boxerWeight1 + " кг, вес второго боксера " + boxerWeight2 +
                    " кг, общий вес " + totalWeight + " кг");
            var difference = boxerWeight2 - boxerWeight1 ;
            System.out.println("Разница в весе боксёров " + difference + " кг");
            System.out.println(" ");

            System.out.println("Задача 7");
            var difference1 = boxerWeight2 - boxerWeight1 ;
            System.out.println("Разница в весе спортсменов, вычисленная вычитанием " + difference1 + " кг");
            var difference2 = boxerWeight2 % boxerWeight1 ;
            System.out.println("Разница в весе спортсменов, полученная с помощью операции остатка от деления " + difference2 + " кг") ;
            System.out.println(" ");

            System.out.println("Задача 8");

            var numberOfEmployees = 640 / 8 ;
            System.out.println("Всего в компании " + numberOfEmployees + " работников");
            numberOfEmployees = numberOfEmployees + 94 ;
            var totalWorkTime = numberOfEmployees * 8 ;
            System.out.println("Если в компании работает " + numberOfEmployees +
                    " человек, то всего " + totalWorkTime + " часов может быть поделено между сотрудниками") ;




    }
}