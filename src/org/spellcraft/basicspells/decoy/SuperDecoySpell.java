package org.spellcraft.basicspells.decoy;

import org.bukkit.Material;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spellcraft.SpellCraft;

public class SuperDecoySpell extends AbstractDecoySpell
{
	public SuperDecoySpell(SpellCraft instance,Player playerinstance)
	{
		super(30,15,CreatureType.COW,30,playerinstance,instance,
				"Super Decoy","All mobs within 15 blocks will attack this very strong decoy.",
				new ItemStack(Material.LEATHER,4),new ItemStack(Material.RAW_BEEF,2),new ItemStack(Material.BONE,3));
	}

}