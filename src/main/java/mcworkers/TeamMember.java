package mcworkers;

import java.util.stream.Stream;

class TeamMember {
    void washUp(Dish...dishes) {
        Stream.of(dishes).forEach(Dish::clean);
    }

    void mopFloor(Floor floor) {
        floor.clean();
    }
}
