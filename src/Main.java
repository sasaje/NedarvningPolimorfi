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

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();

        Corn c = new Corn();
        c.stykpris = 10;
        c.holdbarhed = new Date(1608768000);
        c.cannedType = CannedType.VEGETABLES;
        c.storeAtRoomTemperature();

        Tulips tulips = new Tulips();
        tulips.stykpris = 25;
        tulips.numberOfFlowersInABouquet = 20;
        tulips.wither();

        Roses roses = new Roses();
        roses.stykpris = 50;
        roses.numberOfFlowersInABouquet = 7;
        roses.water();

        Beans blackBeans = new Beans();
        blackBeans.stykpris = 12;
        blackBeans.holdbarhed = new Date(1608768000);
        blackBeans.freeze();

        Beans kidneyBeans = new Beans();
        kidneyBeans.holdbarhed = new Date(1608768000);
        kidneyBeans.storeAtRoomTemperature();

        Beans verticot = new Beans();
        verticot.holdbarhed = new Date(1608768000);
        verticot.freeze();    }

}
