package com.rebel.turd.world.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.rebel.turd.init.TurdBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WallGen implements IWorldGenerator
{
	private final int chance = 10000;
	
	private final Block validBlocks[] = {
			Blocks.AIR,
			Blocks.LOG,
			Blocks.LOG2,
			Blocks.LEAVES,
			Blocks.LEAVES2,
	};
	
	private List<BlockPos> positions;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		
		
		if(random.nextInt(chance) == 1)	// Chance = 1/chance
		{
			int x = chunkX*16+random.nextInt(16);
			int y = 250;
			int z = chunkZ*16+random.nextInt(16);
			BlockPos startPos = new BlockPos(x, y, z);
			positions = computeWall(world, startPos);
			for (BlockPos b: positions)
			{
				world.setBlockState(b, TurdBlocks.BLOCK_TRUMP.getDefaultState());
			}
		}	
	}
	
	/*Returns a list of BlockPos*/
	private List<BlockPos> computeWall(World world, BlockPos pos)
	{
		Random random = new Random();
		List<BlockPos> retList = new ArrayList<>();
		int direction = random.nextInt(2);
		
		for(int i = 0; i < 1000; i++)
		{
			int y = 250;
			if (direction == 0)
			{
				while(blockIsValid(world, new BlockPos(pos.getX() + i, y - 1, pos.getZ())) && y > 63)
				{
					y = y-1;
				}
				for (int j = 0; j < 20; j++)
				{
					retList.add(new BlockPos(pos.getX() + i, y + j - 10, pos.getZ()));
				}
			}
			else
			{
				while(blockIsValid(world, new BlockPos(pos.getX(), y - 1, pos.getZ() + i)) && y > 63)
				{
					y = y-1;
				}
				for (int j = 0; j < 20; j++)
				{
					retList.add(new BlockPos(pos.getX(), y + j - 10, pos.getZ() + i));
				}
			}
		}
		return retList;
	}
	
	private boolean blockIsValid(World world, BlockPos pos)
	{
		for (Block b: validBlocks)
		{
			if (world.getBlockState(pos).getBlock() == b)
			{
				return true;
			}
		}
		return false;
	}
}
