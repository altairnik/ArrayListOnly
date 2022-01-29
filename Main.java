package homeWork.simpleArrayList;

import homeWork.simpleStore.Products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Products product = new Products ("Witcher", "Very interesting fantasy", 15, 100, Products.Type.BOOK);
        Products product1 = new Products("Apple", "Sweet and yellow", 15, 50, Products.Type.FOOD);
        Products product2 = new Products("Banana", "Favorite monkey's food, long and yellow", 13, 60, Products.Type.FOOD);
        Products product3 = new Products("lemon", "Oval sour yellow fruit", 15, 37, Products.Type.FOOD);
        Products product4 = new Products("milk", "Always fresh", 23, 44, Products.Type.FOOD);
        Products product5 = new Products("Coco", "It isn't a chicken)", 1000, 3, Products.Type.SMUGGLING);
        Products product6 = new Products("tobacco", "Smoking kills", 333, 78, Products.Type.SMUGGLING);
        Products product7 = new Products("Philosophy of Java", "Musthave book)", 67, 40, Products.Type.BOOK);
        Products product8 = new Products("Philosophy of C++", "Musthave book)", 56, 60, Products.Type.BOOK);
        ArrayList<Products> productsArrayList = new ArrayList<>();
        productsArrayList.add(product);
        productsArrayList.add(product1);
        productsArrayList.add(product2);
        productsArrayList.add(product3);
        productsArrayList.add(product4);
        productsArrayList.add(product5);
        productsArrayList.add(product6);
        productsArrayList.add(product7);
        productsArrayList.add(product8);
        System.out.println("List of products " + productsArrayList);
        ArrayList<Products> lowPriceAndQuantity = new ArrayList<>();
        for(Products prod:productsArrayList){
            if (prod.getPrice() < 100 && prod.getQuantity() < 50){
                lowPriceAndQuantity.add(prod);
            }
        }
        Collections.sort(productsArrayList, new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println("Low price and quantity " + lowPriceAndQuantity);
        System.out.println(productsArrayList);
    }
}
