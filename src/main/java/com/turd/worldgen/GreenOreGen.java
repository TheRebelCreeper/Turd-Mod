package com.turd.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.turd.block.BlockManager;

import cpw.mods.fml.common.IWorldGenerator;

public class GreenOreGen implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		int x = chunkX*16+random.nextInt(16);
		int y = random.nextInt(100);
		int z = chunkZ*16+random.nextInt(16);
		
		for(int i = 0; i < 8; i++)
		{
		(new WorldGenMinable(BlockManager.blockGreen, 8)).generate(world, random, x, y, z);
		}
		
	}

}
