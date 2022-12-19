package DZ1Task2;

public class Person {
    private String name;
    private String key;

    public Person(String name, String key) {
        this.name = name;
        this.key = key;

    }

    @Override
    public String toString() {
        return "Person [name = " + name + ", key = " + key + "]";
    }

   // Метод поиска ключа 
    public static Person poisk (Person p, Locker l){
        
        if (p.getKey() == "No" && l.getStatus() == "Close"){
            System.out.println("Шеф, все пропало. Нужен ключ");
            System.out.println("Ключ лежит под ковриком.");
            System.out.println("Ключ найден");
            p.setKey("Yes");           
        }
        return p;    
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

}
