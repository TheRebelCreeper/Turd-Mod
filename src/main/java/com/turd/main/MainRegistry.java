package com.turd.main;

import com.turd.block.BlockManager;
import com.turd.entity.EntityManager;
import com.turd.item.ItemManager;
import com.turd.lib.StringLibrary;
import com.turd.recipe.RecipeManager;
import com.turd.worldgen.GreenOreGen;
import com.turd.worldgen.TurdGen;
import com.turd.worldgen.WallGen;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = StringLibrary.MODID, name = StringLibrary.name, version = StringLibrary.version)

public class MainRegistry 
{

	@SidedProxy(clientSide = "com.turd.main.ClientProxy", serverSide = "com.turd.main.ServerProxy")
	
	public static ClientProxy proxy;
	
    /**
    * Loads before
    * @param PreEvent
    */
    @EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	ItemManager.mainRegistry();
    	BlockManager.mainRegistry();
    	RecipeManager.mainRegistry();
    	EntityManager.mainRegistry();
    	
    	GameRegistry.registerWorldGenerator(new TurdGen(), 100);
    	GameRegistry.registerWorldGenerator(new GreenOreGen(), 50);
    	GameRegistry.registerWorldGenerator(new WallGen(), 100);
    	
    	proxy.registerRenderThings();
    }
    
    /**
    * Loads during
    * @param Event
    */
    @EventHandler
    public static void Load(FMLInitializationEvent Event) 
    {    
 
    }
    
    /**
    * Loads after
    * @param PostEvent
    */
    @EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent) 
    {
 
    }
	
}
