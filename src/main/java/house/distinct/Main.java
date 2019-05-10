package house.distinct;

import house.House;

public class Main {
    public static void main(String[] args) {
        final House myHouse = new House("Bag End");

        myHouse.postMessage("Party tomorrow!");
        myHouse.postMessage("Where is the ring?");
        myHouse.postMessage("The wizard is coming!");

        // I can call the public method
        int numberMessagesWaiting = myHouse.getNumberMessagesWaiting();
        System.out.println(String.format("Number of messages: %d", numberMessagesWaiting));

        // I cannot call the private method
//        myHouse.readMessages();
    }
}
