package abstractFactory;

import abstractFactory.components.*;

public interface AbstractFactory {

    AbstractProduct createMaze();
    AbstractProduct createWall();
    AbstractProduct createRoom(Integer n);
    AbstractProduct createDoor(Room room1, Room room2);

}
