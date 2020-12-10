package by.praded.dragon.service;

import by.praded.dragon.model.Dragon;

/**
 * @author Kiryl Praded
 * 28.10.2020
 */
public class DragonService {
    private static DragonService dragonService;

    private DragonService(){

    }

    public static DragonService getDragonService() {
        if (dragonService == null){
            dragonService = new DragonService();
        }
        return dragonService;
    }

    public static int countHeads(Dragon dragon) {
        int age = dragon.getAge();
        int amountOfHeads = 3;
        for (int i = 0; i < age; i++) {
            if (i < 200) {
                amountOfHeads += 3;
            } else if (i < 300) {
                amountOfHeads += 2;
            } else {
                amountOfHeads +=1;
            }
        }
        return amountOfHeads;
    }
}
