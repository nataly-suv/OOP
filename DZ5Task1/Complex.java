package DZ5Task1;

import java.util.ArrayList;

public class Complex {

    ArrayList<Integer> numComplex = new ArrayList<>();

    public Complex() {

    }

    // метод выделения действительной и мнимой части в комплексном числе (число
    // полулчено от пользователя)
    public ArrayList<Integer> numComplex(String inputNum) {

        String inputNumTemp = inputNum.substring(0, inputNum.length() - 1); // удалила i

        int index = -1;

        if (inputNumTemp.contains("+")) {
            index = inputNumTemp.indexOf("+");
        } else if (inputNumTemp.contains("-")) {
            index = inputNumTemp.lastIndexOf("-");
        }

        String inputNumTempFirst = inputNumTemp.substring(0, index); // выделила действительнуй часть числа
        String inputNumTempSecond = inputNumTemp.substring(index); // выделила мниную часть числа

        // формирование массива чисел из действительной и мнимой части
        numComplex.add(Integer.parseInt(inputNumTempFirst));
        numComplex.add(Integer.parseInt(inputNumTempSecond));

        return numComplex;
    }

    // метод вывода на печать комплексног числа
    public String printComplex(ArrayList<Integer> numComplex) {

        String stringComplex = "";

        // если мнимая часть положительная
        if (numComplex.get(1) > 0) {
            stringComplex = stringComplex + numComplex.get(0) + "+" + numComplex.get(1) + "i";

            // если мнимая часть отрицательная
        } else if (numComplex.get(1) < 0) {
            stringComplex = stringComplex + numComplex.get(0) + numComplex.get(1) + "i";
        }
        return stringComplex;
    }

    // метод вывода на печать комплексног числа при делении
    public String printComplexDiv(ArrayList<Integer> numComplex) {

        String stringComplex = "";

        // если мнимая часть положительная
        if (numComplex.get(1) > 0) {
            stringComplex = stringComplex
                    + numComplex.get(0) + "/" + numComplex.get(2) + "+"
                    + numComplex.get(1) + "/" + numComplex.get(2) + "i";

            // если мнимая часть отрицательная
        } else if (numComplex.get(1) < 0) {
            stringComplex = stringComplex
                    + numComplex.get(0) + "/" + numComplex.get(2)
                    + numComplex.get(1) + "/" + numComplex.get(2) + "i";
        }
        return stringComplex;
    }

}
