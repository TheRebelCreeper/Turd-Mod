package com.rebel.turd.util;

import com.rebel.turd.init.TurdBlocks;
import com.rebel.turd.init.TurdItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	public final static Item[] items = {
			TurdItems.GREEN_INGOT,
			TurdItems.TURD_ITEM,
			TurdItems.GREEN_AXE,
			TurdItems.GREEN_HOE,
			TurdItems.GREEN_PICKAXE,
			TurdItems.GREEN_SHOVEL,
			TurdItems.GREEN_SWORD,
			TurdItems.ITEM_DONUT,
			TurdItems.ITEM_DOUGH,
			TurdItems.ITEM_GLAZE,
			TurdItems.TURD_AXE,
			TurdItems.TURD_HOE,
			TurdItems.TURD_PICKAXE,
			TurdItems.TURD_SHOVEL,
			TurdItems.TURD_SWORD
		};
	
	public final static Block[] blocks = {
			TurdBlocks.TRUMP_BLOCK
		};
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event)
	{	
		final Item[] itemBlocks = 
		{
		    new ItemBlock(TurdBlocks.TRUMP_BLOCK).setRegistryName(TurdBlocks.TRUMP_BLOCK.getRegistryName())		
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event)
	{
		event.getRegistry().registerAll(blocks);
	}
}
