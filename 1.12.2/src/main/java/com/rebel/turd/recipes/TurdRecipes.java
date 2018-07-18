package com.rebel.turd.recipes;

import com.rebel.turd.init.TurdBlocks;
import com.rebel.turd.init.TurdItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TurdRecipes 
{
	public static void initSmelting()
	{
		GameRegistry.addSmelting(TurdBlocks.GREEN_ORE, new ItemStack(TurdItems.GREEN_INGOT), 1.0f);
	}
}
