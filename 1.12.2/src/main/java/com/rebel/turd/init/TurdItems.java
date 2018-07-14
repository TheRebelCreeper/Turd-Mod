package com.rebel.turd.init;

import com.rebel.turd.TurdMod;
import com.rebel.turd.item.ItemGreenIngot;
import com.rebel.turd.item.ItemTurd;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(TurdMod.MODID)
public class TurdItems
{
	public static final Item GREEN_INGOT = new ItemGreenIngot("greenIngot", "green_ingot");
	public static final Item TURD_ITEM = new ItemTurd("itemTurd", "item_turd", 6, 0.1f, false);
}
