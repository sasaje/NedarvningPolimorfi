import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.stykpris = 2;
        a.holdbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        a.coolDown();
        a.storage = Storage.ROOMTEMPERATURE;

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();
        p.storage = Storage.FREEZER;

        Corn c = new Corn();
        c.stykpris = 10;
        c.holdbarhed = new Date(1608768000);
        c.cannedType = CannedType.VEGETABLES;
        c.storage = Storage.ROOMTEMPERATURE;

        Tulips tulips = new Tulips();
        tulips.stykpris = 25;
        tulips.numberOfFlowersInABouquet = 20;
        tulips.wither();
        tulips.storage = Storage.ROOMTEMPERATURE;

        Roses roses = new Roses();
        roses.stykpris = 50;
        roses.numberOfFlowersInABouquet = 7;
        roses.water();
        roses.storage = Storage.ROOMTEMPERATURE;

        Beans blackBeans = new Beans();
        blackBeans.stykpris = 12;
        blackBeans.holdbarhed = new Date(1608768000);
        blackBeans.cannedType = CannedType.VEGETABLES;
        blackBeans.storage = Storage.ROOMTEMPERATURE;

        Beans kidneyBeans = new Beans();
        kidneyBeans.holdbarhed = new Date(1608768000);
        kidneyBeans.cannedType = CannedType.VEGETABLES;
        kidneyBeans.storage = Storage.ROOMTEMPERATURE;

        Beans greenBeans = new Beans();
        greenBeans.holdbarhed = new Date(1608768000);
        greenBeans.storage = Storage.FREEZER;
    }
}
