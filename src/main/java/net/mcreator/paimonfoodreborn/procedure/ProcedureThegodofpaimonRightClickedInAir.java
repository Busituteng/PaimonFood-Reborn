package net.mcreator.paimonfoodreborn.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.paimonfoodreborn.ElementsPaimonFoodReborn;

@ElementsPaimonFoodReborn.ModElement.Tag
public class ProcedureThegodofpaimonRightClickedInAir extends ElementsPaimonFoodReborn.ModElement {
	public ProcedureThegodofpaimonRightClickedInAir(ElementsPaimonFoodReborn instance) {
		super(instance, 28);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ThegodofpaimonRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SATURATION, (int) 1200, (int) 2));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 1200, (int) 1));
	}
}
