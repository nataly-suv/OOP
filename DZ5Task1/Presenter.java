package DZ5Task1;

import java.io.IOException;


public class Presenter {
    LoggerClass log = new LoggerClass();
    
    public void button() throws IOException {
        
        // запрос с какими числами работаем 
        int firstAsk = new View().firstAsK();

        log.log("Пользователь выбрал тип чисел");
        
        // блок для работы с рациональными числами
        if (firstAsk == 1) {

            new RationalOperation().buttonRational();

            // блок для работы с комплексными числами
        } else if (firstAsk == 2) {

            new ComplexOperation().buttonComplex();

        }
    }

}
