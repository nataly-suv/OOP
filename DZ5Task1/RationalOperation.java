package DZ5Task1;

import java.io.IOException;
import java.util.ArrayList;

public class RationalOperation {

    public void buttonRational() throws IOException {

        String tempNum1 = new View().askInputNum("Введите первое число в формате a/b: ");
        new LoggerClass().log("Пользователь ввел первое рациональное число");

        String tempNum2 = new View().askInputNum("Введите второе число в формате a/b: ");
        new LoggerClass().log("Пользователь ввел второе рациональное число");

        ArrayList<Integer> num1 = new Rational().numRational(tempNum1);  // преобразование введенного числа в массив
        ArrayList<Integer> num2 = new Rational().numRational(tempNum2);  // преобразование введенного числа в массив
 
        int operation = new View().askOperation();  // запрос действия (+ - * /)

        // сложение
        if (operation == 1) {
            SumModel sumRat = new SumModel();
            System.out.print("Сумма чисел " + tempNum1 + " и " + tempNum2 + " равна: ");
            sumRat.sumRational(num1, num2);
            new LoggerClass().log("Выполнилось сложение");

            // вычитание
        } else if (operation == 2) {
            SubModel subRat = new SubModel();
            System.out.print("Разница чисел " + tempNum1 + " и " + tempNum2 + " равна: ");
            subRat.subRational(num1, num2);
            new LoggerClass().log("Выполнилось вычитание");

            // умножение
        } else if (operation == 3) {
            MultModel multRat = new MultModel();
            System.out.print("Произведение чисел " + tempNum1 + " и " + tempNum2 + " равно: ");
            multRat.multRational(num1, num2);
            new LoggerClass().log("Выполнилось умножение");

            // деление
        } else if (operation == 4) {
            DivModel divRat = new DivModel();
            System.out.print("Деление чисел " + tempNum1 + " и " + tempNum2 + " равно: ");
            divRat.divRational(num1, num2);
            new LoggerClass().log("Выполнилось деление");
        }
    }

}
