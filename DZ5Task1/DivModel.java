package DZ5Task1;

import java.util.ArrayList;

public class DivModel {

    public DivModel() {

    }

    // метод деления 2-х рациональных чисел
    public void divRational(ArrayList<Integer> numRational1, ArrayList<Integer> numRational2) {

        ArrayList<Integer> divRational = new ArrayList<>();

        // числитель итогового числа
        divRational.add(numRational1.get(0) * numRational2.get(1));

        // знаменатель итогового числа
        divRational.add(numRational1.get(1) * numRational2.get(0));

        // сокращение дроби
        ArrayList<Integer> fractionReduction = new Rational().fractionReduction(divRational);

        System.out.println(fractionReduction.get(0) + "/" + fractionReduction.get(1));
    }

    // метод деления 2-х комплексных чисел
    public void divComplex(ArrayList<Integer> numComplex1, ArrayList<Integer> numComplex2) {

        ArrayList<Integer> divComplex = new ArrayList<>();

        // вычисление числителя действительной части
        divComplex.add(numComplex1.get(0) * numComplex2.get(0) + numComplex1.get(1) * numComplex2.get(1));

        // вычисление числителя мнимой части
        divComplex.add(numComplex1.get(0) * numComplex2.get(1) * (-1)
                + numComplex1.get(1) * numComplex2.get(0));

        // вычисление знаменателя для действительной и мнимой частей
        divComplex.add(numComplex2.get(0) * numComplex2.get(0)
                - numComplex2.get(1) * numComplex2.get(1) * (-1));

        // печать комплексного числа при делении
        System.out.println(new Complex().printComplexDiv(divComplex));
    }

}
