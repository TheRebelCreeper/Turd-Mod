package com.turd.block;

import java.util.Random;

import net.minecraft.block.BlockDragonEgg;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.turd.item.ItemManager;
import com.turd.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockTurd extends BlockDragonEgg
{
    
	public BlockTurd()
    {
        this.setBlockName("BlockTurd");
        this.setHardness(1);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName(StringLibrary.MODID+":blockTurd");
		this.setHarvestLevel("SPADE", 0);
    }
	
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random p_149734_5_)
    {
		//System.out.println("PARTICLE");
		world.spawnParticle("largesmoke", x+0.5, y+1, z+0.5, 0.0D, 0.1D, 0.0D);
    }
	
	
	public int quantityDropped(Random p_149745_1_)
	{
		return 4;
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return ItemManager.turdItem;
	}
	
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		return false;
    }
    
    public void onBlockClicked(World p_149699_1_, int p_149699_2_, int p_149699_3_, int p_149699_4_, EntityPlayer p_149699_5_)
    {
        
    }
  
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return Item.getItemFromBlock(this);
    }
    
}
