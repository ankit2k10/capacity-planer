package com.fquick.capacity.manager.engine;

import com.fquick.capacity.manager.engine.impl.ResourceAllocationEngine;

/**
 * Created by ankush.a on 15/03/17.
 */
public class EngineExecutor {

    public void execute(String engineClassName,Long planId){
        if(engineClassName.equalsIgnoreCase("ResourceAllocationEngine")){
            new ResourceAllocationEngine().distribute(planId);
        }
    }
}
