package com.rebel.turd.block;

import java.util.Random;

import com.rebel.turd.TurdMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockTrump extends Block
{
	public BlockTrump(String unlocalizedName, String registryName, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(-1.0f);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		if (worldIn.isRemote)
			playerIn.sendMessage(new TextComponentString("You have reached the United States of America. You are not welcome here."));
        return false;
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(this);
	}
}
