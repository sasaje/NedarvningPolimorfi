/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 09/11/2020
 *
 */

public class Canned extends Vare {
    CannedType cannedType = CannedType.VEGETABLES;

    void storeAtRoomTemperature() {
        System.out.println("Opbevar ved stuetemperatur");
    }
}
