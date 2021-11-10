package com.company;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.junit.Assert;

@GraphWalker(value = "random(edge_coverage(100))", start = "v_Closed" )
public class CarDoorTest extends ExecutionContext implements CarDoorModel {

    private final CarDoor door = new CarDoor();
    
    @Override
    public void e_unlock(){
        System.out.println("e_unlock");
        door.unlockDoor();
    }

    @Override
    public void e_lock(){
        System.out.println("e_unlock");
        door.lockDoor();
    }

    @Override
    public void e_close(){
        System.out.println("e_unlock");
        door.closeDoor();
    }

    @Override
    public void e_open(){
        System.out.println("e_unlock");
        door.openDoor();
    }

    @Override
    public void v_Closed(){
        Assert.assertTrue(door.getStatus() == CarDoorStatus.CLOSED);
        System.out.println("v_Closed");
    }

    @Override
    public void v_Opened(){
        Assert.assertTrue(door.getStatus() == CarDoorStatus.OPENED);
        System.out.println("v_Opened");
    }

    @Override
    public void v_Locked(){
        Assert.assertTrue(door.getStatus() == CarDoorStatus.LOCKED);
        System.out.println("v_Locked");
    }
}
