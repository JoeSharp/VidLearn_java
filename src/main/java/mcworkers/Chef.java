package mcworkers;

class Chef extends TeamMember {
    void cookFood(String foodName) {
        System.out.println(String.format("Cooking %s", foodName));
    }
}
