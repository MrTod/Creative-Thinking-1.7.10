package com.ct.creativethinking.proxy;

import com.ct.creativethinking.entity.EntityScath;
import com.ct.creativethinking.handler.Entity;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    public void registerRenderThings(){

       //RenderingRegistry.registerEntityRenderingHandler(EntityScath.class, new RenderScath(new ModelScath(), 0.3F));
    }

}
