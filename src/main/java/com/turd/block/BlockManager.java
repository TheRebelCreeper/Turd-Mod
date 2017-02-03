package com.turd.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockManager
{
	 public static void mainRegistry()
	 {
		 initializeBlock();
		 registerBlock();
	 }

	 public static Block blockGreen;
	 public static Block blockTurd;
	 public static Block blockTrump;
	 
	public static void initializeBlock() 
	{
		blockGreen = new GreenOre(Material.rock);
		blockTurd = new BlockTurd();
		blockTrump = new BlockTrump(Material.ground);
	}

	public static void registerBlock()
	{
		GameRegistry.registerBlock(blockGreen, blockGreen.getLocalizedName());
		GameRegistry.registerBlock(blockTurd, blockTurd.getLocalizedName());
		GameRegistry.registerBlock(blockTrump, blockTrump.getLocalizedName());
	}
}
