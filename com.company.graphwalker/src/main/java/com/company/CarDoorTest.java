package com.company;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(edge_coverage(100))", start = "v_Closed" )
public class CarDoorTest extends ExecutionContext implements CarDoorModel {

    private final CarDoor door = new CarDoor();
    
    // This is just an example
    @Override
    public void e_unlock(){
        System.out.println("e_unlock");
        door.unlockDoor();
    }

    // TODO: complete this file
}
