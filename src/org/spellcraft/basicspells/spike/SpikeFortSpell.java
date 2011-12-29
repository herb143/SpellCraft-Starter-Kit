package org.spellcraft.basicspells.spike;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spellcraft.SpellCraft;

public class SpikeFortSpell extends AbstractSpikeSpell
{
	public SpikeFortSpell(SpellCraft instance,Player playerinstance)
	{
		super(playerinstance, instance, SpikeSpell.SpellType.FORT, 30,
				"Spike Fort","Builds a fortification of cacti instantaeneously.",
				new ItemStack(Material.CACTUS, 64),new ItemStack(Material.SAND,25),new ItemStack(Material.SANDSTONE,20));
	}
}
