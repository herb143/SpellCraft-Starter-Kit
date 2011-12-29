package org.spellcraft.basicspells.decoy;

import org.bukkit.Material;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spellcraft.SpellCraft;

public class BasicDecoySpell extends AbstractDecoySpell
{
	public BasicDecoySpell(SpellCraft instance,Player playerinstance)
	{
		super(30,5,CreatureType.CHICKEN,10,playerinstance,instance,
				"Basic Decoy","All mobs within 5 blocks will attack this weak decoy.",
				new ItemStack(Material.RAW_CHICKEN,2),new ItemStack(Material.EGG,4));
	}

}