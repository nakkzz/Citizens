package com.fullwall.Citizens.Questers.QuestTypes;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.fullwall.Citizens.Questers.Goal;
import com.fullwall.Citizens.Questers.Quest;
import com.fullwall.Citizens.Questers.QuestTypes.QuestManager.QuestType;
import com.fullwall.resources.redecouverte.NPClib.HumanNPC;

public class BuildQuest implements Quest {
	private HumanNPC questGiver;
	private Block blockTypeToPlace;
	private Block[] blocksPlaced;
	private Goal goal;

	public BuildQuest(HumanNPC questGiver, Block[] blocksPlaced,
			Goal goal) {
		this.questGiver = questGiver;
		this.blocksPlaced = blocksPlaced;
		this.goal = goal;
	}

	public Block[] getBlocksPlaced() {
		return blocksPlaced;
	}

	public Block getBlockTypeToPlace() {
		return blockTypeToPlace;
	}

	public void setBlockToPlace(Block blockTypeToPlace) {
		this.blockTypeToPlace = blockTypeToPlace;
	}
	
	@Override
	public HumanNPC getQuestGiver() {
		return questGiver;
	}

	@Override
	public void setQuestGiver(HumanNPC questGiver) {
		this.questGiver = questGiver;
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestType getType() {
		return QuestType.BUILD;
	}

	@Override
	public Goal getGoal() {
		return goal;
	}

	@Override
	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	@Override
	public String getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCompleted() {
		// TODO Auto-generated method stub
		return false;
	}
}