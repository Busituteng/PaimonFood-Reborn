
package net.mcreator.paimonfoodreborn.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.paimonfoodreborn.procedure.ProcedurePaimonsheadHelmetTickEvent;
import net.mcreator.paimonfoodreborn.creativetab.TabTab;
import net.mcreator.paimonfoodreborn.ElementsPaimonFoodReborn;

@ElementsPaimonFoodReborn.ModElement.Tag
public class ItemPaimonshead extends ElementsPaimonFoodReborn.ModElement {
	@GameRegistry.ObjectHolder("paimonfoodreborn:paimonsheadhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("paimonfoodreborn:paimonsheadbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("paimonfoodreborn:paimonsheadlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("paimonfoodreborn:paimonsheadboots")
	public static final Item boots = null;
	public ItemPaimonshead(ElementsPaimonFoodReborn instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PAIMONSHEAD", "paimonfoodreborn:paimon_", 40, new int[]{0, 0, 0, 2}, 15,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedurePaimonsheadHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("paimonsheadhelmet").setRegistryName("paimonsheadhelmet").setCreativeTab(TabTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("paimonfoodreborn:paimonsheadhelmet", "inventory"));
	}
}
