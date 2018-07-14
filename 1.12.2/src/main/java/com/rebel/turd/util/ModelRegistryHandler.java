package com.rebel.turd.util;

import com.rebel.turd.init.TurdItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler 
{
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{
		registerModel(TurdItems.GREEN_INGOT);
		registerModel(TurdItems.TURD_ITEM);
		registerModel(TurdItems.GREEN_SWORD);
		registerModel(TurdItems.GREEN_PICKAXE);
		registerModel(TurdItems.GREEN_SHOVEL);
		registerModel(TurdItems.GREEN_AXE);
		registerModel(TurdItems.GREEN_HOE);
	}
	
	private static void registerModel(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
