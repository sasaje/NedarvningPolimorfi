/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 09/11/2020
 *
 */

public class Flowers extends Vare {

    int numberOfFlowersInABouquet;

    void water(){
        System.out.println("Vand blomsterne");
    }

    void wither(){
        System.out.println("The flowers are withered");
        kanSælges = false;
        System.out.println("The kanSælges is now changed to " + kanSælges);
    }
}
