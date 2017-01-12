package abstractFactory;

import abstractFactory.components.AbstractProduct;
import abstractFactory.components.Door;
import abstractFactory.components.Room;
import abstractFactory.components.magic.DoorNeedingSpell;
import abstractFactory.components.magic.MagicRoom;
import abstractFactory.components.magic.Spell;

public class MagicMazeFactorty extends MazeFactory  {

    @Override
    public AbstractProduct createRoom(Integer n) {
        return new MagicRoom(n,new Spell());
    }

    @Override
    public Door createDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1,room2);
    }
}
