
package net.mcreator.paimonfoodreborn.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.paimonfoodreborn.creativetab.TabTab;
import net.mcreator.paimonfoodreborn.ElementsPaimonFoodReborn;

@ElementsPaimonFoodReborn.ModElement.Tag
public class BlockPaimonblocksuper extends ElementsPaimonFoodReborn.ModElement {
	@GameRegistry.ObjectHolder("paimonfoodreborn:paimonblocksuper")
	public static final Block block = null;
	public BlockPaimonblocksuper(ElementsPaimonFoodReborn instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("paimonblocksuper"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("paimonfoodreborn:paimonblocksuper", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("paimonblocksuper");
			setSoundType(SoundType.GROUND);
			setHardness(1.5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabTab.tab);
		}
	}
}
