package com.rebel.turd.util;

import com.rebel.turd.init.TurdItems;
import com.rebel.turd.item.ItemGreenIngot;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void registerItems(Register<Item> event)
	{
		final Item[] items = 
		{
			TurdItems.GREEN_INGOT,
			TurdItems.TURD_ITEM
		};
		event.getRegistry().registerAll(items);
	}
}
