package org.spellcraft.basicspells.spike;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spellcraft.SpellCraft;

public class SpikeWallSpell extends AbstractSpikeSpell
{
	public SpikeWallSpell(SpellCraft instance,Player playerinstance)
	{
		super(playerinstance, instance, SpikeSpell.SpellType.WALL, 30,
				"Spike Wall","Builds a wall of cacti instantaeneously.",
				new ItemStack(Material.CACTUS, 35),new ItemStack(Material.SAND,9),new ItemStack(Material.SANDSTONE,8));
	}
}
