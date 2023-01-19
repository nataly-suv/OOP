package DZ5Task1;

import java.util.ArrayList;

public class MultModel {

    public MultModel() {

    }

    // метод умножения 2-х рациональных чисел
    public void multRational(ArrayList<Integer> numRational1, ArrayList<Integer> numRational2) {
        ArrayList<Integer> multRational = new ArrayList<>();

        // числитель итогового числа
        multRational.add(numRational1.get(0) * numRational2.get(0));

        // знаменатель итогового числа
        multRational.add(numRational1.get(1) * numRational2.get(1));

        // сокращение дроби
        ArrayList<Integer> fractionReduction = new Rational().fractionReduction(multRational);

        System.out.println(fractionReduction.get(0) + "/" + fractionReduction.get(1));
    }

    // метод умножения 2-х комплексных чисел
    public void multComplex(ArrayList<Integer> numComplex1, ArrayList<Integer> numComplex2) {

        ArrayList<Integer> multComplex = new ArrayList<>();

        // вычисление действительной части
        multComplex.add(numComplex1.get(0) * numComplex2.get(0)
                + numComplex1.get(1) * numComplex2.get(1) * (-1));

        // вычисление мнимой части
        multComplex.add(numComplex1.get(0) * numComplex2.get(1)
                + numComplex1.get(1) * numComplex2.get(0));

        // печать комплексного числа
        System.out.println(new Complex().printComplex(multComplex));
    }
}
