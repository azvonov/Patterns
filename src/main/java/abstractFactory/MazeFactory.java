package abstractFactory;


import abstractFactory.components.*;

public class MazeFactory implements AbstractFactory {

    public AbstractProduct createMaze(){
        return new Maze();
    }
    public AbstractProduct createWall(){
        return new Wall();
    }
    public AbstractProduct createRoom(Integer n){
        return new Room(n);
    };
    public AbstractProduct createDoor(Room room1, Room room2){
        return new Door(room1,room2);
    };

}
