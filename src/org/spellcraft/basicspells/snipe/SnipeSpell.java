package org.spellcraft.basicspells.snipe;

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
				"Snipe", "Shoots an arrow at the target with high long-range accuracy.",
				new ItemStack(Material.ARROW,1),new ItemStack(Material.REDSTONE,8));
	}

	@Override
	protected void castSpell(LivingEntity target)
	{
		removeRequiredItems();
		
		// HAVING TROUBLE WITH THIS CODE
		// See http://forums.bukkit.org/threads/precise-arrow-aiming-help-with-vectors.52280/

	}


}
