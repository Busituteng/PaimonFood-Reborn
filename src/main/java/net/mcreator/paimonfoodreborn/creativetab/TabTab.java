
package net.mcreator.paimonfoodreborn.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.paimonfoodreborn.item.ItemPaimon;
import net.mcreator.paimonfoodreborn.ElementsPaimonFoodReborn;

@ElementsPaimonFoodReborn.ModElement.Tag
public class TabTab extends ElementsPaimonFoodReborn.ModElement {
	public TabTab(ElementsPaimonFoodReborn instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemPaimon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
