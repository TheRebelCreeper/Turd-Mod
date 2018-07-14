package com.turd.item;

import com.turd.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import com.turd.lib.StringLibrary;

public class GreenAxe extends ItemAxe{

	protected GreenAxe(ToolMaterial mat) {
		super(mat);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("GreenAxe");
		this.setTextureName(StringLibrary.MODID+":greenAxe");
	}
}
