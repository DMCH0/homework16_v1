package mentor.lesson6;



    /*
Ми маємо хатинку в Карпатах і 5 домашніх тварин: гуски та вівці.
Кількість гусок та овець з цих 5ти тварин невідомо.
Вивести усі комбінації гусок та овець із 5ти тварин, за умовою, що мінімальна
кількість гусок та овець у кожному наборі дорівнює одному. Треба вирішити задачу за допомогою циклів.
Наприклад:
“У хатинці маємо 1 гуску та 4 вівці”
“У хатинці маємо 2 гуски та 3 вівці”
  a) закінчення в словах не змінюється в залежності від
   кількості гусок та вівців
*/
    public class Lesson6 {
        public static void main(String[] args) {
            int sheep = 4;

            for(int i = 1; i < 5; i++){
            System.out.println("Дома " + i + " утка " + sheep-- + " овца");
        }
    }
}





