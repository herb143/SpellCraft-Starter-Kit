package org.spellcraft.basicspells.rapidfire;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spellcraft.SpellCraft;
import org.spellcraft.castable.NonTargetingSpell;


public class RapidfireSpell extends NonTargetingSpell {
	
	public RapidfireSpell(SpellCraft instance,Player instancePlayer)
	{
		super(instancePlayer,instance,"Rapidfire","Fires off a fast volley of arrows.",new ItemStack(Material.ARROW, 8), new ItemStack(Material.REDSTONE, 4)); // Call the super constructor.
	}
	
	protected void castSpell()
	{
		SpellCraft plugin = getSpellCraft();
		removeRequiredItems();
		for (int iii=2;iii<15;iii=iii+2) // Do this 7 times.
		{
			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new RapidfireRunnable(getPlayer()),iii);
		}
	}
}