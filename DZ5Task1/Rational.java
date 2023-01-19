package DZ5Task1;

import java.util.ArrayList;

public class Rational {

    ArrayList<Integer> numRational = new ArrayList<>();
    ArrayList<Integer> fractionReduction = new ArrayList<>();

    public Rational() {

    }

    // метод выделения числителя и знаменателя в рациональном числе (число
    // полулчено от пользователя)
    public ArrayList<Integer> numRational(String inputNum) {
        String[] temp;
        temp = inputNum.split("/");
        numRational.add(Integer.parseInt(temp[0]));
        numRational.add(Integer.parseInt(temp[1]));
        return numRational;
    }

    // метод сокращения дроби, через нахождение общего делителя 
    
    public ArrayList<Integer> fractionReduction (ArrayList<Integer> numRational) { 
        int nod = 1; 
        int first =  numRational.get(0);
        int second =  numRational.get(1);
        if (first<second){ 
            int temp =first; 
            first=second; 
            second=temp; 
        }  
        while(nod!=0) { 
            nod=first%second;  
            first=second;   
            second=nod; 
        }     

        fractionReduction.add(numRational.get(0)/first); 
        fractionReduction.add(numRational.get(1)/first); 
        return fractionReduction; 
         
    }




}
