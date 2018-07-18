package com.rebel.turd.world.gen;

import java.util.Random;

import com.rebel.turd.init.TurdBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class TurdGen implements IWorldGenerator 
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if(random.nextInt(10) == 1)
		{
			int x = chunkX*16+random.nextInt(16);
			int y = 250;
			int z = chunkZ*16+random.nextInt(16);
			
			BlockPos pos = new BlockPos(x, y, z);
			
			while(world.getBlockState(pos).getBlock() == Blocks.AIR)
			{
				y = y-1;
				pos = new BlockPos(x, y, z);
			}
			Block seat = world.getBlockState(pos).getBlock();
			if(seat == Blocks.GRASS || seat == Blocks.STONE || seat == Blocks.SAND || seat == Blocks.DIRT)
			{
				world.setBlockState(pos.add(0, 1, 0), TurdBlocks.BLOCK_TURD.getDefaultState());
			}
		}	
	}
}
