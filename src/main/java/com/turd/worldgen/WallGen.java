package com.turd.worldgen;

import java.util.Random;

import com.turd.block.BlockManager;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class WallGen implements IWorldGenerator
{

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if(random.nextInt(1000) == 1)
		{
			int x = chunkX*16+random.nextInt(16);
			int y = 250;
			int z = chunkZ*16+random.nextInt(16);
			
			for(int i = 0; i < 1600; i++)
			{
				y = 250;
				while(blockIsValid(world, x + i, y - 1, z) && y > 63)
				{
					y = y-1;
				}
				for (int j = 0; j < 20; j++)
				{
					world.setBlock(x + i, y + j - 10, z, BlockManager.blockTrump);
				}
			}
			//world.setBlock(chunkX*16+random.nextInt(16), 250, chunkZ*16+random.nextInt(16), BlockManager.blockTurd);
		}	
	}
	
	private boolean blockIsValid(World world, int x, int y, int z)
	{
		if (world.getBlock(x, y, z) == Blocks.air || world.getBlock(x, y, z) == Blocks.log || world.getBlock(x, y, z) == Blocks.leaves)
		{
			return true;
		}
		else
			return false;
	}
}
