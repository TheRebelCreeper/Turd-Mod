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
			TurdItems.ITEM_TURD,
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
			TurdBlocks.BLOCK_TRUMP,
			TurdBlocks.BLOCK_TURD,
			TurdBlocks.GREEN_ORE
		};
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event)
	{		
		event.getRegistry().registerAll(items);
		for (int i = 0; i < blocks.length; i++)
		{
			Item item = new ItemBlock(blocks[i]).setRegistryName(blocks[i].getRegistryName());
			event.getRegistry().register(item);
		}
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event)
	{
		event.getRegistry().registerAll(blocks);
	}
}
