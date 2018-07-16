package com.rebel.turd.block;

import java.util.Random;

import com.rebel.turd.TurdMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GreenOre extends Block
{

	public GreenOre(String unlocalizedName, String registryName, Material material)
	{
		super(material);
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(4);
	}
	
	public int quantityDropped(Random random)
	{
		return 1;
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(this);
	}
	
	/*@Override
	public void breakBlock(World world, int x, int y, int z, Block p_149749_5_, int p_149749_6_)
    {
		ItemStack stack = new ItemStack(Item.getItemFromBlock(this));
		EntityItem entityitem = new EntityItem(world, x, y, z, stack);
        
		entityitem.delayBeforeCanPickup = 10;
        world.spawnEntityInWorld(entityitem);
    }
    */
}
