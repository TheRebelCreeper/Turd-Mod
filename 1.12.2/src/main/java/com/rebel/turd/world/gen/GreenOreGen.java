package com.rebel.turd.world.gen;

import java.util.Random;

import com.rebel.turd.TurdMod;
import com.rebel.turd.init.TurdBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GreenOreGen implements IWorldGenerator
{
	private final WorldGenMinable genGreenOre;
	
	public GreenOreGen()
	{
		genGreenOre = new WorldGenMinable(TurdBlocks.GREEN_ORE.getDefaultState(), 8);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
	    switch (world.provider.getDimensionType()) 
	    {
	    case NETHER:
	        break;
	 
	    case OVERWORLD:
	        genStandard(genGreenOre, world, random, chunkX, chunkZ, 8, 0, 100);
	        break;
	 
	    case THE_END:
	        break;
	 
	    }
	}
	
	private void genStandard(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int spawnTries, int minHeight, int maxHeight) 
	{
		int x = chunkX*16+random.nextInt(16);
		int y = random.nextInt(maxHeight - minHeight) + minHeight;
		int z = chunkZ*16+random.nextInt(16);
	 
	    BlockPos chunkPos = new BlockPos(x, y, z);
	 
	    for (int i = 0; i < spawnTries; i++) 
	    {
	        generator.generate(world, random, chunkPos);
	    }
	}

}
