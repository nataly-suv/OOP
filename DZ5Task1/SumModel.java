package DZ5Task1;

import java.util.ArrayList;

public class SumModel {

    public SumModel() {

    }

    // метод сложения 2-х рациональных чисел
    public void sumRational(ArrayList<Integer> numRational1, ArrayList<Integer> numRational2) {
        ArrayList<Integer> sumRational = new ArrayList<>();

        // числитель итогового числа
        sumRational.add(numRational1.get(0) * numRational2.get(1) + numRational1.get(1) * numRational2.get(0));

        // знаменатель итогового числа
        sumRational.add(numRational1.get(1) * numRational2.get(1));

        // сокращение дроби
        ArrayList<Integer> fractionReduction = new Rational().fractionReduction(sumRational);

        System.out.println(fractionReduction.get(0) + "/" + fractionReduction.get(1));
    }

    // метод сложения 2-х комплексных чисел 
    public void sumComplex(ArrayList<Integer> numComplex1, ArrayList<Integer> numComplex2){

        ArrayList<Integer> sumComplex = new ArrayList<>();

        // вычисление действительной части 
        sumComplex.add(numComplex1.get(0)+numComplex2.get(0));

        // вычисление мнимой части 
        sumComplex.add(numComplex1.get(1)+numComplex2.get(1));

        System.out.println(new Complex().printComplex(sumComplex));
    }



}
