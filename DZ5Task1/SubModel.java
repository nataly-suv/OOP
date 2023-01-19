package DZ5Task1;

import java.util.ArrayList;

public class SubModel {

    public SubModel() {

    }

    // метод вычитания 2-х рациональных чисел
    public void subRational(ArrayList<Integer> numRational1, ArrayList<Integer> numRational2) {
        ArrayList<Integer> subRational = new ArrayList<>();

        // числитель итогового числа
        subRational.add(numRational1.get(0) * numRational2.get(1) - numRational1.get(1) * numRational2.get(0));

        // знаменатель итогового числа
        subRational.add(numRational1.get(1) * numRational2.get(1));

        // сокращение дроби
        ArrayList<Integer> fractionReduction = new Rational().fractionReduction(subRational);

        System.out.println(fractionReduction.get(0) + "/" + fractionReduction.get(1));
    }

    // метод вычитания 2-х комплексных чисел
    public void subComplex(ArrayList<Integer> numComplex1, ArrayList<Integer> numComplex2) {

        ArrayList<Integer> subComplex = new ArrayList<>();

        // вычисление действительной части
        subComplex.add(numComplex1.get(0) - numComplex2.get(0));

        // вычисление мнимой части
        subComplex.add(numComplex1.get(1) - numComplex2.get(1));

        System.out.println(new Complex().printComplex(subComplex));
    }
}
