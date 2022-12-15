package DZ1Task2;

public class SearchKey {

    Person p;
    Locker l;

    public SearchKey (Person p, Locker l){
        this.p = p; 
        this.l = l;            
    }

    public Person poisk (){
        
        if (p.getKey() == "No" && l.getStatus() == "Close"){
            System.out.println("Шеф, все пропало. Нужен ключ");
            System.out.println("Ключ лежит под ковриком.");
            System.out.println("Ключ найден");
            p.setKey("Yes");           
        }
        return p;    
    }




    


}
