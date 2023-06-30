package com.hillel.wineshop.main;

import com.hillel.wineshop.beer.Beer;
import com.hillel.wineshop.constants.WineShopConstants;
import com.hillel.wineshop.personal.Barmen;
import com.hillel.wineshop.spirits.Gin;
import com.hillel.wineshop.utils.BarmenUtils;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

//        Beer beer = new Beer(4, "corona", true);
//        beer.printBeer();
//        beer.setPenka(false);
//        beer.printBeer();
//        Scanner scanner = new Scanner(System.in);
//        beer.setPenka(BarmenUtils.isBarmenShakeBeer(scanner));
//        beer.printBeer();
//        System.out.println(WineShopConstants.SHOP_NAME);

//        System.out.println(beer.getPenka());
        String[] ingredients = {"juniper"};
        Gin bulldog1 = new Gin(37, null, 12, "dry", ingredients,78);

        Barmen barmen = new Barmen();
        barmen.getDrunkGin(bulldog1);
//
//
//        bulldog1.setType(null);
//
//        System.out.println(bulldog1.getType().toString());

    }
}
