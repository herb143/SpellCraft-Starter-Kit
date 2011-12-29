package org.spellcraft.basicspells.decoy;

import org.bukkit.Material;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spellcraft.SpellCraft;

public class EnhancedDecoySpell extends AbstractDecoySpell
{
	public EnhancedDecoySpell(SpellCraft instance,Player playerinstance)
	{
		super(30,10,CreatureType.SHEEP,20,playerinstance,instance,
				"Enhanced Decoy","All mobs within 10 blocks will attack this enhanced decoy.",
				new ItemStack(Material.WOOL,5),new ItemStack(Material.BONE,1));
	}

}