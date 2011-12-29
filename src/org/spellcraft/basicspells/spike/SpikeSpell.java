package org.spellcraft.basicspells.spike;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spellcraft.SpellCraft;

public class SpikeSpell extends AbstractSpikeSpell
{
	public SpikeSpell(SpellCraft instance,Player playerinstance)
	{
		super(playerinstance, instance, SpikeSpell.SpellType.BASIC, 30,
				"Spike","Builds a cactus instantaeneously.",
				new ItemStack(Material.CACTUS, 4),new ItemStack(Material.SAND,1));
	}
}
