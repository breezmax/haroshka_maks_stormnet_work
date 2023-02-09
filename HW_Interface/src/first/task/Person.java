package first.task;

import first.task.Jacket;

public class Person implements Trousers, Jacket, Shoes {
    String name;
    boolean jacketPutOn = false;
    boolean trousersPutOn = false;
    boolean shoesPutOn = false;

    public Person(String name){
        this.name = name;
    }


    public void putOnPerson(){
        putOnTrousers();
        putOnShoes();
        putOnJacket();
        System.out.printf("%s пойдет на прогулку или по делам!\n\n", name);
    }

    public void takeOffPerson(){
        System.out.printf("%s устал(а) на работе или на прогулке!\n", name);
        takeOffShoes();
        takeOffJacket();
        takeOffTrousers();
    }


    @Override
    public void putOnJacket() {
        System.out.printf("%s надел(а) куртку\n", name);
        jacketPutOn = true;
    }

    @Override
    public void takeOffJacket() {
        System.out.printf("%s снял(а) куртку\n", name);
        jacketPutOn = false;
    }

    @Override
    public void putOnShoes() {
        System.out.printf("%s надел(а) обувь\n", name);
        shoesPutOn = true;
    }

    @Override
    public void takeOffShoes() {
        System.out.printf("%s снял(а) обувь\n", name);
        shoesPutOn = false;
    }

    @Override
    public void putOnTrousers() {
        System.out.printf("%s надел(а) штаны\n", name);
        trousersPutOn = true;
    }

    @Override
    public void takeOffTrousers() {
        System.out.printf("%s снял(а) штаны\n", name);
        trousersPutOn = false;
    }
}
