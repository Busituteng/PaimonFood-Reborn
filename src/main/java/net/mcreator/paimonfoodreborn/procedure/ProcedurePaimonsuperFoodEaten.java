package net.mcreator.paimonfoodreborn.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.paimonfoodreborn.ElementsPaimonFoodReborn;

@ElementsPaimonFoodReborn.ModElement.Tag
public class ProcedurePaimonsuperFoodEaten extends ElementsPaimonFoodReborn.ModElement {
	public ProcedurePaimonsuperFoodEaten(ElementsPaimonFoodReborn instance) {
		super(instance, 26);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PaimonsuperFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SATURATION, (int) 300, (int) 1));
	}
}
