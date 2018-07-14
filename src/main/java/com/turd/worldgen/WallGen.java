package com.turd.worldgen;

import java.util.Random;

import javax.swing.JOptionPane;

import com.turd.block.BlockManager;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class WallGen implements IWorldGenerator
{
	private final int chance = 750; // Chance of spawning is 1/chance
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if(random.nextInt(chance) == 1)
		{
			int x = chunkX*16+random.nextInt(16);
			int y = 250;
			int z = chunkZ*16+random.nextInt(16);
			
			int direction = random.nextInt(2);
			
			if (!wallNearby(world, x, 60, z))
			{
				for(int i = 0; i < 1600; i++)
				{
					y = 250;
					if (direction == 0)
					{
						while(blockIsValid(world, x + i, y - 1, z) && y > 63)
						{
							y = y-1;
						}
						for (int j = 0; j < 20; j++)
						{
							world.setBlock(x + i, y + j - 10, z, BlockManager.blockTrump);
						}
					}
					else
					{
						while(blockIsValid(world, x, y - 1, z + i) && y > 63)
						{
							y = y-1;
						}
						for (int j = 0; j < 20; j++)
						{
							world.setBlock(x, y + j - 10, z + i, BlockManager.blockTrump);
						}
					}
				}
			}
		}	
	}
	
	private boolean blockIsValid(World world, int x, int y, int z)
	{
		if (world.getBlock(x, y, z) == Blocks.air || world.getBlock(x, y, z) == Blocks.log || world.getBlock(x, y, z) == Blocks.leaves)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private boolean wallNearby(World world, int x, int y, int z)
	{
		for (int i = 0; i < 500; i++)
		{
			for (int k = 0; j < 500; k++)
			{
				for (int j = 0; k < 100; j++)
				{
					if (world.getBlock(x + i, y + j, z + k) == BlockManager.blockTrump || 
						world.getBlock(x - i, y + j, z - k) == BlockManager.blockTrump || 
						world.getBlock(x + i, y + j, z - k) == BlockManager.blockTrump || 
						world.getBlock(x - i, y + j, z + k) == BlockManager.blockTrump)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}
