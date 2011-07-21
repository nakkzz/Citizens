package com.citizens.npctypes.blacksmiths;

import org.bukkit.entity.Player;

import com.citizens.Permission;
import com.citizens.economy.EconomyHandler.Operation;
import com.citizens.npctypes.interfaces.Clickable;
import com.citizens.npctypes.interfaces.Toggleable;
import com.citizens.resources.npclib.HumanNPC;
import com.citizens.utils.MessageUtils;

public class BlacksmithNPC extends Toggleable implements Clickable {

	/**
	 * Blacksmith NPC object
	 * 
	 * @param npc
	 */
	public BlacksmithNPC(HumanNPC npc) {
		super(npc);
	}

	@Override
	public String getType() {
		return "blacksmith";
	}

	@Override
	public void onLeftClick(Player player, HumanNPC npc) {
	}

	@Override
	public void onRightClick(Player player, HumanNPC npc) {
		if (Permission.canUse(player, npc, getType())) {
			Operation op = null;
			if (BlacksmithManager.validateTool(player.getItemInHand())) {
				op = Operation.BLACKSMITH_TOOLREPAIR;
			} else if (BlacksmithManager.validateArmor(player.getItemInHand())) {
				op = Operation.BLACKSMITH_ARMORREPAIR;
			}
			if (op != null) {
				BlacksmithManager.buyRepair(player, npc, op);
			}
		} else {
			player.sendMessage(MessageUtils.noPermissionsMessage);
		}
	}
}