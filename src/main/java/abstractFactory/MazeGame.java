package abstractFactory;

import abstractFactory.components.*;

public class MazeGame {



    public static void main(String[] args) {

        AbstractFactory mazeFactory = new MazeFactory();
        createMaze(mazeFactory);

        AbstractFactory magicMazeFactory = new MagicMazeFactorty();
        createMaze(magicMazeFactory);
    }
    
    public static AbstractProduct createMaze(AbstractFactory factory){

        AbstractProduct maze = factory.createMaze();
        AbstractProduct room1 = factory.createRoom(1);
        AbstractProduct room2 = factory.createRoom(2);
        AbstractProduct door = factory.createDoor((Room) room1,(Room) room2);
        
        ((Maze) maze).addRoom((Room) room1);
        ((Maze) maze).addRoom((Room) room2);

        ((Room)room1).setSide(Side.NORTH,factory.createWall());
//        room1.setSide(Side.EAST,door);
//        room1.setSide(Side.SOUTH,factory.createWall());
//        room1.setSide(Side.WEST,factory.createWall());
//
//        room2.setSide(Side.NORTH,factory.createWall());
//        room2.setSide(Side.EAST,factory.createWall());
//        room2.setSide(Side.SOUTH,factory.createWall());
//        room2.setSide(Side.WEST,door);

        return maze;
    }
}
