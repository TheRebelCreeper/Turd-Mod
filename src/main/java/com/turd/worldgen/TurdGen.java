package com.turd.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import com.turd.block.BlockManager;

import cpw.mods.fml.common.IWorldGenerator;

public class TurdGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		
		if(random.nextInt(10) == 5)
		{
			int x = chunkX*16+random.nextInt(16);
			int y = 250;
			int z = chunkZ*16+random.nextInt(16);
			
			
			while(world.getBlock(x, y-1, z) == Blocks.air)
			{
				y = y-1;
			}
			Block seat = world.getBlock(x, y-1, z);
			if(seat == Blocks.grass || seat == Blocks.stone || seat == Blocks.sand || seat == Blocks.dirt)
			{
				world.setBlock(x, y, z, BlockManager.blockTurd);
			}
			//world.setBlock(chunkX*16+random.nextInt(16), 250, chunkZ*16+random.nextInt(16), BlockManager.blockTurd);
		}
		
	}

}
