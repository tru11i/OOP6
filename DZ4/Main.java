package DZ4;

public class Main {
    // Шаг 3: Наполнение коробки фруктами
    // Принцип 2: Принцип открытости/закрытости
    // класс Box и его использование в методе getFruitBox позволяет расширять функциональность, не изменяя существующий код.

    public static Box<Fruit> getFruitBox() {
        Box<Fruit> box = new Box<>();
        box.put(new Apple());
        box.put(new Orange());
        return box;
    }

    // Шаг 4: Вывод содержимого коробки
    // Метод printBox принимает коробку с фруктами любого типа, который наследуется от Fruit.

    public static void printBox(Box<? extends Fruit> box) {
        System.out.println(box.get().toString());
    }

    // Переменная fruitBox имеет тип Box<Fruit>, что позволяет хранить любые фрукты.
    public static void main(String[] args) {
        Box<Fruit> fruitBox = getFruitBox();
        printBox(fruitBox);
    }
}

    //Принцип 5: Класс Main использующий Box зависит от абстракции Fruit через класс Box. 
    //Это позволяет изолировать конкретные реализации фруктов и обеспечивает гибкость в изменении конкретных типов фруктов.

     //Принцип 4: Принцип интерфейсов.
     //В текущем коде интерфейсов нет, но если бы требовалась дополнительная функциональность
     //можно было бы внести интерфейсы, чтобы уменьшить количество методов в классах.