package DZ5Task1;

import java.io.IOException;
import java.util.ArrayList;

public class ComplexOperation {

    public void buttonComplex() throws IOException {

        String tempNum1 = new View().askInputNum("Введите первое число в формате 1+2i: ");
        new LoggerClass().log("Пользователь ввел первое комплексное число");

        String tempNum2 = new View().askInputNum("Введите второе число в формате 1+2i: ");
        new LoggerClass().log("Пользователь ввел второе комплексное число");

        ArrayList<Integer> num1 = new Complex().numComplex(tempNum1); // преобразование введенного числа в массив
        ArrayList<Integer> num2 = new Complex().numComplex(tempNum2); // преобразование введенного числа в массив

        int operation = new View().askOperation(); // запрос действия (+ - * /)

        // сложение
        if (operation == 1) {
            SumModel sumComplex = new SumModel();
            System.out.print("Сумма чисел " + tempNum1 + " и " + tempNum2 + " равна: ");
            sumComplex.sumComplex(num1, num2);
            new LoggerClass().log("Выполнилось сложение");

            // вычитание
        } else if (operation == 2) {
            SubModel subComplex = new SubModel();
            System.out.print("Вычитание чисел " + tempNum1 + " и " + tempNum2 + " равно: ");
            subComplex.subComplex(num1, num2);
            new LoggerClass().log("Выполнилось вычитание");

            // умножение
        } else if (operation == 3) {
            MultModel multComplex = new MultModel();
            System.out.print("Произведение чисел " + tempNum1 + " и " + tempNum2 + " равно: ");
            multComplex.multComplex(num1, num2);
            new LoggerClass().log("Выполнилось умножение");

            // деление
        } else if (operation == 4) {
            DivModel divComplex = new DivModel();
            System.out.print("Деление чисел " + tempNum1 + " и " + tempNum2 + " равно: ");
            divComplex.divComplex(num1, num2);
            new LoggerClass().log("Выполнилось деление");

        }

    }
}
