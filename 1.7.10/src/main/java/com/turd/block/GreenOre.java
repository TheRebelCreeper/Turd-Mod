package com.turd.block;

import java.util.Random;

import com.turd.item.ItemManager;
import com.turd.lib.StringLibrary;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GreenOre extends Block
{

	protected GreenOre(Material p_i45394_1_)
	{
		super(p_i45394_1_);
		this.setBlockName("GreenOre");
		this.setHardness(4);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName(StringLibrary.MODID+":greenOre");
	}
	
	public int quantityDropped(Random p_149745_1_)
	{
		return 1;
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
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
