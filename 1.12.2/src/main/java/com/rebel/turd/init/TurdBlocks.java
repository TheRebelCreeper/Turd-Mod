package com.rebel.turd.init;

import com.rebel.turd.TurdMod;
import com.rebel.turd.block.BlockTrump;
import com.rebel.turd.block.BlockTurd;
import com.rebel.turd.block.GreenOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(TurdMod.MODID)
public class TurdBlocks
{
	public static final Block BLOCK_TRUMP = new BlockTrump("blockTrump", "block_trump", Material.ROCK);
	public static final Block BLOCK_TURD = new BlockTurd("blockTurd", "block_turd");
	public static final Block GREEN_ORE = new GreenOre("greenOre", "green_ore", Material.ROCK);
}
