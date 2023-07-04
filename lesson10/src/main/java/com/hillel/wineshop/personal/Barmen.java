package com.hillel.wineshop.personal;

import com.hillel.wineshop.abstractions.AlcoholBottle;
import com.hillel.wineshop.spirits.Gin;

public class Barmen {

    public void getDrunkGin(Gin gin) {
        System.out.println(gin.getType() + "было налито");
    }

    public void fill(AlcoholBottle alcoholBottle) {
        alcoholBottle.isFilled();
    }
}
