package DZ4;

// Шаг 1: Создание обобщенного класса

// Принцип 1: Принцип единственной ответственности (SRP)
// Класс Box отвечает за управление коробкой с фруктами. Он имеет одну ответственность - хранение и предоставление доступа к фрукту.

public class Box<T extends Fruit> {
    private T item;


    // Использование геттера и сеттера для доступа к приватным полям.
    // Это обеспечивает инкапсуляцию и соблюдение принципа инкапсуляции.
    
    
    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

// Шаг 2: Создание классов фруктов
class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

// Принцип 3: Наследование и полиморфизм. Классы Apple и Orange наследуются от Fruit.
//Классы Apple и Orange являются подклассами Fruit и могут быть использованы везде, где ожидается объект типа Fruit

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Orange extends Fruit {
    @Override
    public String toString() {
        return "Orange";
    }
}


