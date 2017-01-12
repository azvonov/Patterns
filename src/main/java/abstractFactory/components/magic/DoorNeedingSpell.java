package abstractFactory.components.magic;

import abstractFactory.components.Door;
import abstractFactory.components.Room;

public class DoorNeedingSpell extends Door {

    public DoorNeedingSpell(Room room1, Room room2) {
        super(room1, room2);
    }
}
