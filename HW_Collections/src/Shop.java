import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Goods> shopList = new ArrayList<Goods>();

    public void addGoodsToList(Goods good){
        for (Goods goodArr:shopList) {
            if(goodArr.getId() == good.getId()){
                System.out.printf("Товар с ID = %s уже существует!\n", good.getId());
                return;
            }
        }
        shopList.add(good);
    }

    public void removeGoodsFromList(int id){
        for (Goods goodArr:shopList) {
            if(goodArr.getId() == id){
                shopList.remove(goodArr);
                return;
            }
        }
        System.out.println("Такого ID нет в списке товаров!");
    }

    public void updateGoodInList(Goods good){
        for (Goods goodArr:shopList) {
            if(goodArr.getId() == good.getId()){
                goodArr.setName(good.getName());
                goodArr.setPrice(good.getPrice());
                return;
            }
        }
        System.out.println("Такого товара нет в списке!");
    }

    public List allGoods(){
        return shopList;
    }
}
