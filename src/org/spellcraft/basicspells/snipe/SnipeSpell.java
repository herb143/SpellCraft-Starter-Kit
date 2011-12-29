package org.spellcraft.basicspells.snipe;

import net.minecraft.server.Entity;
import net.minecraft.server.EntityArrow;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.MathHelper;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.craftbukkit.entity.CraftEntity;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spellcraft.SpellCraft;
import org.spellcraft.castable.TargetingSpell;

public class SnipeSpell extends TargetingSpell
{
	public SnipeSpell(SpellCraft instance,Player playerinstance)
	{
		super(playerinstance, instance,
				"Snipe", "Shoots an arrow with improved accuracy (ALPHA).",
				new ItemStack(Material.ARROW,1),new ItemStack(Material.REDSTONE,8));
	}

	@Override
	protected void castSpell(LivingEntity target)
	{
		removeRequiredItems();
		if(target != getPlayer() && target != null)
		{
		snipe(((CraftEntity)target).getHandle());
		}
	}

	protected void snipe(Entity entity) {

		EntityPlayer ePlayer = ((CraftPlayer)getPlayer()).getHandle();
		double d0 = entity.locX - ePlayer.locX;
		double d1 = entity.locZ - ePlayer.locZ;

		Location oldLoc = getPlayer().getLocation().clone();
		Location newLoc = getPlayer().getLocation().clone();
		newLoc.setYaw((float) (Math.atan2(d1, d0) * 180.0D / 3.1415927410125732D) - 90.0F);
		getPlayer().teleport(newLoc);
		
		EntityArrow entityarrow = new EntityArrow(ePlayer.world, ePlayer, 1.0F);
		double d2 = entity.locY + (double) entity.x() - 0.699999988079071D - entityarrow.locY;
		float f1 = MathHelper.a(d0 * d0 + d1 * d1) * 0.2F;

		entityarrow.a(d0, d2 + (double) f1, d1, 1.6F, 12.0F);

		ePlayer.world.addEntity(entityarrow);

		getPlayer().teleport(oldLoc);
	}


}
