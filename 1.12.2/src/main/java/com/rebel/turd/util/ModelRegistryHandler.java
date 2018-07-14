package com.rebel.turd.util;

import com.rebel.turd.init.TurdBlocks;
import com.rebel.turd.init.TurdItems;

import net.minecraft.block.Block;
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
		/*Register items*/
		for (int i = 0; i < RegistryHandler.items.length; i++)
		{
			registerModel(RegistryHandler.items[i]);
		}
		
		/*Register blocks*/
		for (int i = 0; i < RegistryHandler.blocks.length; i++)
		{
			registerModel(RegistryHandler.blocks[i]);
		}
	}
	
	private static void registerModel(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	private static void registerModel(Block block)
	{
		registerModel(Item.getItemFromBlock(block));
	}
}
