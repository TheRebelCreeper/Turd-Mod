package com.rebel.turd;

import org.apache.logging.log4j.Logger;

import com.rebel.turd.proxy.IProxy;
import com.rebel.turd.recipes.TurdRecipes;
import com.rebel.turd.world.gen.GreenOreGen;
import com.rebel.turd.world.gen.TurdGen;
import com.rebel.turd.world.gen.WallGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = TurdMod.MODID, name = TurdMod.NAME, version = TurdMod.VERSION, 
	acceptedMinecraftVersions = TurdMod.MC_VERSION)
public class TurdMod 
{
	public static final String MODID = "turd";
	public static final String NAME = "Random Mod IDK";
	public static final String VERSION = "1.3 Beta";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final String CLIENT = "com.rebel.turd.proxy.ClientProxy";
	public static final String SERVER = "com.rebel.turd.proxy.ServerProxy";
	
	@SidedProxy(clientSide = TurdMod.CLIENT, serverSide = TurdMod.SERVER)
	public static IProxy proxy;
	
	public static Logger logger;
	 
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }
 
    @EventHandler
    public void init(FMLInitializationEvent event) 
    {
        proxy.init(event);
        TurdRecipes.initSmelting();
        GameRegistry.registerWorldGenerator(new GreenOreGen(), 0);
        GameRegistry.registerWorldGenerator(new TurdGen(), 0);
        GameRegistry.registerWorldGenerator(new WallGen(), 0);
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
    	proxy.postInit(event);
    }
}
