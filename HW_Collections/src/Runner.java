import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Goods milk = new Goods(1,"Молоко", 2.70);
        Goods butter = new Goods(2, "Масло", 3.50);
        Goods bread = new Goods(3, "Хлеб", 1.80);
        Goods viski = new Goods(4, "Виски", 25.99);
        Goods cola = new Goods(5, "Кока-Кола", 6.65);
        Goods sweets = new Goods(6, "Конфеты", 12.20);
        Goods sausages = new Goods(6, "Сосиски", 9.99);
        Goods water = new Goods(7, "Вода", 9.99);
        Goods rolton = new Goods(1, "Ролтон", 2.25);
        Goods fruits = new Goods(8, "Фрукты", 7.70);
        shop.addGoodsToList(sweets);
        shop.addGoodsToList(milk);
        shop.addGoodsToList(bread);
        shop.addGoodsToList(cola);
        shop.addGoodsToList(butter);
        shop.addGoodsToList(viski);

        System.out.println("\nПытаемся добавить товар \'Сосиски\' с уже существующим ID:");
        shop.addGoodsToList(sausages);

        System.out.println("\nСортируем по цене:");
        TreeSet<Goods> treeSet = new TreeSet<Goods>(shop.allGoods());
        System.out.println(treeSet);

        System.out.println("\nУдаляем несколько товаров \'Масло\' и \'Кока-Кола\':");
        shop.removeGoodsFromList(2);
        shop.removeGoodsFromList(5);
        treeSet = new TreeSet<Goods>(shop.allGoods());
        System.out.println(treeSet);

        System.out.println("\nДобавляем несколько товаров в начало очереди и сортируем:");
        Deque<Goods> deq = new ArrayDeque<>(shop.allGoods());
        deq.addFirst(water);
        deq.addFirst(fruits);
        System.out.println(deq);

        System.out.println("\nРедактируем товар: \'Молоко\' -> \'Ролтон\':");
        shop.updateGoodInList(rolton);
        System.out.println(deq);

    }
}
