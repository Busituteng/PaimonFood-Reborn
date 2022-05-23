
package net.mcreator.paimonfoodreborn.item;

import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.paimonfoodreborn.world.WorldPaimonDimension;
import net.mcreator.paimonfoodreborn.creativetab.TabTab;

public class ItemPaimonDimension extends Item {
	@GameRegistry.ObjectHolder("paimonfoodreborn:paimondimension")
	public static final Item block = null;
	public ItemPaimonDimension() {
		super();
		this.maxStackSize = 1;
		setMaxDamage(64);
		setCreativeTab(TabTab.tab);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		pos = pos.offset(facing);
		ItemStack itemstack = entity.getHeldItem(hand);
		if (!entity.canPlayerEdit(pos, facing, itemstack)) {
			return EnumActionResult.FAIL;
		} else {
			if (world.isAirBlock(pos))
				WorldPaimonDimension.portal.portalSpawn(world, pos);
			itemstack.damageItem(1, entity);
			return EnumActionResult.SUCCESS;
		}
	}
}
