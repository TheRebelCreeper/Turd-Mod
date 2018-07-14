package com.rebel.turd.init;

import com.rebel.turd.TurdMod;
import com.rebel.turd.block.BlockTrump;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(TurdMod.MODID)
public class TurdBlocks
{
	public static final Block TRUMP_BLOCK = new BlockTrump("blockTrump", "trump_block", Material.ROCK);
}
