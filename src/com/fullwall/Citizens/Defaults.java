package com.fullwall.Citizens;

import java.util.ArrayList;
import java.util.HashMap;

public class Defaults {
	public static HashMap<String, String> settingsDefaults = writeDefaultSettings();
	public static HashMap<String, String> lookupsDefaults = writeLookupsSettings();
	public static HashMap<String, String> economyDefaults = writeEconomySettings();
	public static HashMap<String, String> settingsRenames = writeSettingsRenames();
	public static HashMap<String, String> economyRenames = writeEconomyRenames();
	public static ArrayList<String> settingsDeletes = writeSettingsDeletes();
	public static ArrayList<String> economyDeletes = writeEconomyDeletes();

	private static HashMap<String, String> writeDefaultSettings() {
		HashMap<String, String> nodes = new HashMap<String, String>();
		// General Settings
		nodes.put("general.limits.npcs-per-player", "10");
		nodes.put("general.defaults.enable-following", "true");
		nodes.put("general.defaults.talk-when-close", "false");
		nodes.put("general.colors.use-npc-colours", "true");
		nodes.put("general.colors.npc-colour", "�f");
		nodes.put("general.chat.format", "[%name%]: ");
		nodes.put("general.chat.slashes-to-spaces", "true");
		nodes.put(
				"general.chat.default-text",
				"Hello.;How are you today?;Having a nice day?;Good weather today.;Stop hitting me!;I'm bored.;");
		nodes.put("general.wizards.wizard-max-locations", "10");
		nodes.put("general.healers.pay-for-heal", "true");
		nodes.put("general.healers.regen-health", "true");
		nodes.put("general.wizards.regen-mana", "true");
		nodes.put("general.wizards.max-mana", "100");
		// Item Settings
		nodes.put("items.item-list-on", "true");
		nodes.put("items.basic.talk-items", "340,");
		nodes.put("items.basic.select-items", "*");
		nodes.put("items.evil.tame-item", "354");
		nodes.put("items.healers.take-health-item", "276");
		nodes.put("items.healers.give-health-item", "35");
		nodes.put("items.wizards.interact-item", "288");
		// Tick Settings
		nodes.put("ticks.general.delay", "1");
		nodes.put("ticks.saving.use-task", "true");
		nodes.put("ticks.saving.save-often", "true");
		nodes.put("ticks.saving.delay", "72000");
		nodes.put("ticks.pathing.max-stationary", "25");
		nodes.put("ticks.pathing.max-pathing", "-1");
		nodes.put("ticks.healers.health-regen-increment", "12000");
		nodes.put("ticks.wizards.mana-regen-rate", "6000");
		// Range Settings
		nodes.put("range.basic.look", "4");
		nodes.put("range.bandits.steal-radius", "5");
		nodes.put("range.guards.default-bouncer-protection-radius", "5");
		nodes.put("range.guards.pathfinding", "16");
		return nodes;
	}

	private static HashMap<String, String> writeEconomySettings() {
		HashMap<String, String> nodes = new HashMap<String, String>();
		nodes.put("economy.use-economy", "true");
		nodes.put("economy.use-econplugin", "false");

		nodes.put("prices.basic.creation.item", "10");
		nodes.put("prices.basic.creation.item-currency-id", "37");
		nodes.put("prices.basic.creation.econplugin", "100");

		nodes.put("prices.bandit.creation.item", "10");
		nodes.put("prices.bandit.creation.item-currency-id", "37");
		nodes.put("prices.bandit.creation.econplugin", "100");

		nodes.put("prices.blacksmith.creation.item", "10");
		nodes.put("prices.blacksmith.creation.item-currency-id", "37");
		nodes.put("prices.blacksmith.creation.econplugin", "100");

		nodes.put("prices.blacksmith.armorrepair.item", "10");
		nodes.put("prices.blacksmith.armorrepair.item-currency-id", "37");
		nodes.put("prices.blacksmith.armorrepair.econplugin", "100");

		nodes.put("prices.blacksmith.toolrepair.item", "10");
		nodes.put("prices.blacksmith.toolrepair.item-currency-id", "37");
		nodes.put("prices.blacksmith.toolrepair.econplugin", "100");

		nodes.put("prices.guard.creation.item", "10");
		nodes.put("prices.guard.creation.item-currency-id", "37");
		nodes.put("prices.guard.creation.econplugin", "100");

		nodes.put("prices.healer.creation.item", "10");
		nodes.put("prices.healer.creation.item-currency-id", "37");
		nodes.put("prices.healer.creation.econplugin", "100");

		nodes.put("prices.healer.levelup.item", "10");
		nodes.put("prices.healer.levelup.item-currency-id", "37");
		nodes.put("prices.healer.levelup.econplugin", "100");

		nodes.put("prices.healer.heal.item", "10");
		nodes.put("prices.healer.heal.item-currency-id", "37");
		nodes.put("prices.healer.heal.econplugin", "100");

		nodes.put("prices.quester.creation.item", "10");
		nodes.put("prices.quester.creation.item-currency-id", "37");
		nodes.put("prices.quester.creation.econplugin", "100");

		nodes.put("prices.trader.creation.item", "20");
		nodes.put("prices.trader.creation.item-currency-id", "37");
		nodes.put("prices.trader.creation.econplugin", "250");

		nodes.put("prices.wizard.creation.item", "20");
		nodes.put("prices.wizard.creation.item-currency-id", "37");
		nodes.put("prices.wizard.creation.econplugin", "150");

		nodes.put("prices.wizard.teleport.item", "20");
		nodes.put("prices.wizard.teleport.item-currency-id", "37");
		nodes.put("prices.wizard.teleport.econplugin", "150");

		nodes.put("prices.wizard.changetime.item", "20");
		nodes.put("prices.wizard.changetime.item-currency-id", "37");
		nodes.put("prices.wizard.changetime.econplugin", "150");

		nodes.put("prices.wizard.spawnmob.item", "20");
		nodes.put("prices.wizard.spawnmob.item-currency-id", "37");
		nodes.put("prices.wizard.spawnmob.econplugin", "150");

		nodes.put("prices.wizard.togglestorm.item", "20");
		nodes.put("prices.wizard.togglestorm.item-currency-id", "37");
		nodes.put("prices.wizard.togglestorm.econplugin", "150");
		return nodes;
	}

	// Leave this the same.
	private static HashMap<String, String> writeLookupsSettings() {
		HashMap<String, String> nodes = new HashMap<String, String>();
		nodes.put("air", "0");
		nodes.put("stone", "1");
		nodes.put("grass", "2");
		nodes.put("dirt", "3");
		nodes.put("cobblestone", "4");
		nodes.put("cobble", "4");
		nodes.put("wood", "5");
		nodes.put("plank", "5");
		nodes.put("sapling", "6");
		nodes.put("bedrock", "7");
		nodes.put("adminium", "7");
		nodes.put("water", "8");
		nodes.put("stationarywater", "9");
		nodes.put("swater", "9");
		nodes.put("lava", "10");
		nodes.put("stationarylava", "11");
		nodes.put("slava", "11");
		nodes.put("sand", "12");
		nodes.put("gravel", "13");
		nodes.put("goldore", "14");
		nodes.put("gore", "14");
		nodes.put("ironore", "15");
		nodes.put("iore", "15");
		nodes.put("coalore", "16");
		nodes.put("core", "16");
		nodes.put("log", "17");
		nodes.put("trunk", "17");
		nodes.put("leaves", "18");
		nodes.put("sponge", "19");
		nodes.put("glass", "20");
		nodes.put("lapislazuliore", "21");
		nodes.put("lapisore", "21");
		nodes.put("lore", "21");
		nodes.put("lapislazuliblock", "22");
		nodes.put("lapisblock", "22");
		nodes.put("lblock", "22");
		nodes.put("dispenser", "23");
		nodes.put("sandstone", "24");
		nodes.put("sstone", "24");
		nodes.put("noteblock", "25");
		nodes.put("musicblock", "25");
		nodes.put("nblock", "25");
		nodes.put("mblock", "25");
		nodes.put("bedblock", "26");
		nodes.put("poweredrail", "27");
		nodes.put("poweredtrack", "27");
		nodes.put("boosterrail", "27");
		nodes.put("boostertrack", "27");
		nodes.put("detectorrail", "28");
		nodes.put("detectortrack", "28");
		nodes.put("web", "30");
		nodes.put("spiderweb", "30");
		nodes.put("cobweb", "30");
		nodes.put("tallgrass", "31");
		nodes.put("longgrass", "31");
		nodes.put("weeds", "31");
		nodes.put("shrubs", "32");
		nodes.put("deadshrubs", "32");
		nodes.put("deadbush", "32");
		nodes.put("whitecloth", "35");
		nodes.put("cloth", "35");
		nodes.put("whitewool", "35");
		nodes.put("wool", "35");
		nodes.put("yellowflower", "37");
		nodes.put("yflower", "37");
		nodes.put("flower", "37");
		nodes.put("redrose", "38");
		nodes.put("rrose", "38");
		nodes.put("redflower", "38");
		nodes.put("rflower", "38");
		nodes.put("brownmushroom", "39");
		nodes.put("brownmush", "39");
		nodes.put("bmushroom", "39");
		nodes.put("bmush", "39");
		nodes.put("redmushroom", "40");
		nodes.put("redmush", "40");
		nodes.put("rmushroom", "40");
		nodes.put("rmush", "40");
		nodes.put("goldblock", "41");
		nodes.put("gblock", "41");
		nodes.put("ironblock", "42");
		nodes.put("iblock", "42");
		nodes.put("doublestep", "43");
		nodes.put("dstep", "43");
		nodes.put("doubleslab", "43");
		nodes.put("dslab", "43");
		nodes.put("step", "44");
		nodes.put("slab", "44");
		nodes.put("brickblock", "45");
		nodes.put("bblock", "45");
		nodes.put("tnt", "46");
		nodes.put("bookshelf", "47");
		nodes.put("bookblock", "47");
		nodes.put("mossycobblestone", "48");
		nodes.put("mossycobble", "48");
		nodes.put("mosscobble", "48");
		nodes.put("mcobble", "48");
		nodes.put("obsidian", "49");
		nodes.put("obsi", "49");
		nodes.put("obby", "49");
		nodes.put("torch", "50");
		nodes.put("fire", "51");
		nodes.put("mobspawner", "52");
		nodes.put("monsterspawner", "52");
		nodes.put("spawner", "52");
		nodes.put("woodenstairs", "53");
		nodes.put("woodstairs", "53");
		nodes.put("wstairs", "53");
		nodes.put("chest", "54");
		nodes.put("redstonewire", "55");
		nodes.put("redwire", "55");
		nodes.put("rswire", "55");
		nodes.put("diamondore", "56");
		nodes.put("dore", "56");
		nodes.put("diamondblock", "57");
		nodes.put("dblock", "57");
		nodes.put("workbench", "58");
		nodes.put("wbench", "58");
		nodes.put("workb", "58");
		nodes.put("crops", "59");
		nodes.put("crop", "59");
		nodes.put("soil", "60");
		nodes.put("furnace", "61");
		nodes.put("burningfurnace", "62");
		nodes.put("bfurnace", "62");
		nodes.put("signpost", "63");
		nodes.put("woodendoorhalf", "64");
		nodes.put("wooddoorhalf", "64");
		nodes.put("wdoorhalf", "64");
		nodes.put("ladder", "65");
		nodes.put("minecarttrack", "66");
		nodes.put("minecartrail", "66");
		nodes.put("track", "66");
		nodes.put("rail", "66");
		nodes.put("cobblestonestairs", "67");
		nodes.put("stonestairs", "67");
		nodes.put("cobblestairs", "67");
		nodes.put("sstairs", "67");
		nodes.put("cstairs", "67");
		nodes.put("wallsign", "68");
		nodes.put("lever", "69");
		nodes.put("stonepressureplate", "70");
		nodes.put("stoneplate", "70");
		nodes.put("splate", "70");
		nodes.put("irondoorhalf", "71");
		nodes.put("idoorhalf", "71");
		nodes.put("woodenpressureplate", "72");
		nodes.put("woodenplate", "72");
		nodes.put("woodplate", "72");
		nodes.put("wplate", "72");
		nodes.put("redstoneore", "73");
		nodes.put("rsore", "73");
		nodes.put("glowingredstoneore", "74");
		nodes.put("gredstoneore", "74");
		nodes.put("glowingrsore", "74");
		nodes.put("grsore", "74");
		nodes.put("redstonetorchoff", "75");
		nodes.put("redtorchoff", "75");
		nodes.put("rstorchoff", "75");
		nodes.put("redstonetorchon", "76");
		nodes.put("redstonetorch", "76");
		nodes.put("redtorchon", "76");
		nodes.put("redtorch", "76");
		nodes.put("rstorchon", "76");
		nodes.put("rstorch", "76");
		nodes.put("stonebutton", "77");
		nodes.put("sbutton", "77");
		nodes.put("button", "77");
		nodes.put("snowcovering", "78");
		nodes.put("snowcover", "78");
		nodes.put("ice", "79");
		nodes.put("snowblock", "80");
		nodes.put("sblock", "80");
		nodes.put("cactus", "81");
		nodes.put("clayblock", "82");
		nodes.put("cblock", "82");
		nodes.put("reedblock", "83");
		nodes.put("rblock", "83");
		nodes.put("jukebox", "84");
		nodes.put("jbox", "84");
		nodes.put("fence", "85");
		nodes.put("pumpkin", "86");
		nodes.put("netherack", "87");
		nodes.put("netherstone", "87");
		nodes.put("hellstone", "87");
		nodes.put("nstone", "87");
		nodes.put("hstone", "87");
		nodes.put("soulsand", "88");
		nodes.put("slowsand", "88");
		nodes.put("slowmud", "88");
		nodes.put("ssand", "88");
		nodes.put("smud", "88");
		nodes.put("mud", "88");
		nodes.put("glowstone", "89");
		nodes.put("lightstone", "89");
		nodes.put("lstone", "89");
		nodes.put("portal", "90");
		nodes.put("jackolantern", "91");
		nodes.put("pumpkinlantern", "91");
		nodes.put("glowingpumpkin", "91");
		nodes.put("lightpumpkin", "91");
		nodes.put("cakeblock", "92");
		nodes.put("diodeoff", "93");
		nodes.put("repeateroff", "93");
		nodes.put("diodeon", "94");
		nodes.put("repeateron", "94");
		nodes.put("supplycrate", "95");
		nodes.put("lockedchest", "95");
		nodes.put("trapdoor", "96");
		nodes.put("hatch", "96");
		nodes.put("#Item ID", "");
		nodes.put("ironshovel", "256");
		nodes.put("ironspade", "256");
		nodes.put("ishovel", "256");
		nodes.put("ispade", "256");
		nodes.put("ironpickaxe", "257");
		nodes.put("ironpick", "257");
		nodes.put("ipickaxe", "257");
		nodes.put("ipick", "257");
		nodes.put("ironaxe", "258");
		nodes.put("iaxe", "258");
		nodes.put("flintandsteel", "259");
		nodes.put("lighter", "259");
		nodes.put("apple", "260");
		nodes.put("bow", "261");
		nodes.put("arrow", "262");
		nodes.put("coal", "263");
		nodes.put("diamond", "264");
		nodes.put("ironingot", "265");
		nodes.put("ironbar", "265");
		nodes.put("iingot", "265");
		nodes.put("ibar", "265");
		nodes.put("goldingot", "266");
		nodes.put("goldbar", "266");
		nodes.put("gingot", "266");
		nodes.put("gbar", "266");
		nodes.put("ironsword", "267");
		nodes.put("isword", "267");
		nodes.put("woodensword", "268");
		nodes.put("woodsword", "268");
		nodes.put("wsword", "268");
		nodes.put("woodenshovel", "269");
		nodes.put("woodenspade", "269");
		nodes.put("woodshovel", "269");
		nodes.put("woodspade", "269");
		nodes.put("wshovel", "269");
		nodes.put("wspade", "269");
		nodes.put("woodenpickaxe", "270");
		nodes.put("woodenpick", "270");
		nodes.put("woodpickaxe", "270");
		nodes.put("woodpick", "270");
		nodes.put("wpickaxe", "270");
		nodes.put("wpick", "270");
		nodes.put("woodenaxe", "271");
		nodes.put("woodaxe", "271");
		nodes.put("waxe", "271");
		nodes.put("stonesword", "272");
		nodes.put("ssword", "272");
		nodes.put("stoneshovel", "273");
		nodes.put("stonespade", "273");
		nodes.put("sshovel", "273");
		nodes.put("sspade", "273");
		nodes.put("stonepickaxe", "274");
		nodes.put("stonepick", "274");
		nodes.put("spickaxe", "274");
		nodes.put("spick", "274");
		nodes.put("stoneaxe", "275");
		nodes.put("saxe", "275");
		nodes.put("diamondsword", "276");
		nodes.put("dsword", "276");
		nodes.put("diamondshovel", "277");
		nodes.put("diamondspade", "277");
		nodes.put("dshovel", "277");
		nodes.put("dspade", "277");
		nodes.put("diamondpickaxe", "278");
		nodes.put("diamondpick", "278");
		nodes.put("dpickaxe", "278");
		nodes.put("dpick", "278");
		nodes.put("diamondaxe", "279");
		nodes.put("daxe", "279");
		nodes.put("stick", "280");
		nodes.put("bowl", "281");
		nodes.put("mushroomsoup", "282");
		nodes.put("mrsoup", "282");
		nodes.put("soup", "282");
		nodes.put("goldsword", "283");
		nodes.put("gsword", "283");
		nodes.put("goldshovel", "284");
		nodes.put("goldspade", "284");
		nodes.put("gshovel", "284");
		nodes.put("gspade", "284");
		nodes.put("goldpickaxe", "285");
		nodes.put("goldpick", "285");
		nodes.put("gpickaxe", "285");
		nodes.put("gpick", "285");
		nodes.put("goldaxe", "286");
		nodes.put("gaxe", "286");
		nodes.put("string", "287");
		nodes.put("rope", "287");
		nodes.put("feather", "288");
		nodes.put("gunpowder", "289");
		nodes.put("woodenhoe", "290");
		nodes.put("woodhoe", "290");
		nodes.put("whoe", "290");
		nodes.put("stonehoe", "291");
		nodes.put("shoe", "291");
		nodes.put("ironhoe", "292");
		nodes.put("ihoe", "292");
		nodes.put("diamondhoe", "293");
		nodes.put("dhoe", "293");
		nodes.put("goldhoe", "294");
		nodes.put("ghoe", "294");
		nodes.put("seeds", "295");
		nodes.put("seed", "295");
		nodes.put("wheat", "296");
		nodes.put("bread", "297");
		nodes.put("leatherhelmet", "298");
		nodes.put("leatherhelm", "298");
		nodes.put("leatherhat", "298");
		nodes.put("lhelmet", "298");
		nodes.put("lhelm", "298");
		nodes.put("lhat", "298");
		nodes.put("leatherchestplate", "299");
		nodes.put("leatherplatebody", "299");
		nodes.put("leathershirt", "299");
		nodes.put("lchestplate", "299");
		nodes.put("lplatebody", "299");
		nodes.put("lshirt", "299");
		nodes.put("leatherleggings", "300");
		nodes.put("leatherpants", "300");
		nodes.put("lleggings", "300");
		nodes.put("lpants", "300");
		nodes.put("leatherboots", "301");
		nodes.put("leathershoes", "301");
		nodes.put("lboots", "301");
		nodes.put("lshoes", "301");
		nodes.put("chainmailhelmet", "302");
		nodes.put("chainmailhelm", "302");
		nodes.put("chainmailhat", "302");
		nodes.put("cmhelmet", "302");
		nodes.put("cmhelm", "302");
		nodes.put("cmhat", "302");
		nodes.put("chainmailchestplate", "303");
		nodes.put("chainmailplatebody", "303");
		nodes.put("chainmailshirt", "303");
		nodes.put("cmchestplate", "303");
		nodes.put("cmplatebody", "303");
		nodes.put("cmshirt", "303");
		nodes.put("chainmailleggings", "304");
		nodes.put("chainmailpants", "304");
		nodes.put("cmleggings", "304");
		nodes.put("cmpants", "304");
		nodes.put("chainmailboots", "305");
		nodes.put("chainmailshoes", "305");
		nodes.put("cmboots", "305");
		nodes.put("cmshoes", "305");
		nodes.put("ironhelmet", "306");
		nodes.put("ironhelm", "306");
		nodes.put("ironhat", "306");
		nodes.put("ihelmet", "306");
		nodes.put("ihelm", "306");
		nodes.put("ihat", "306");
		nodes.put("ironchestplate", "307");
		nodes.put("ironplatebody", "307");
		nodes.put("ironshirt", "307");
		nodes.put("ichestplate", "307");
		nodes.put("iplatebody", "307");
		nodes.put("ishirt", "307");
		nodes.put("ironleggings", "308");
		nodes.put("ironpants", "308");
		nodes.put("ileggings", "308");
		nodes.put("ipants", "308");
		nodes.put("ironboots", "309");
		nodes.put("ironshoes", "309");
		nodes.put("iboots", "309");
		nodes.put("ishoes", "309");
		nodes.put("diamondhelmet", "310");
		nodes.put("diamondhelm", "310");
		nodes.put("diamondhat", "310");
		nodes.put("dhelmet", "310");
		nodes.put("dhelm", "310");
		nodes.put("dhat", "310");
		nodes.put("diamondchestplate", "311");
		nodes.put("diamondplatebody", "311");
		nodes.put("diamondshirt", "311");
		nodes.put("dchestplate", "311");
		nodes.put("dplatebody", "311");
		nodes.put("dshirt", "311");
		nodes.put("diamondleggings", "312");
		nodes.put("diamondpants", "312");
		nodes.put("dleggings", "312");
		nodes.put("dpants", "312");
		nodes.put("diamondboots", "313");
		nodes.put("diamondshoes", "313");
		nodes.put("dboots", "313");
		nodes.put("dshoes", "313");
		nodes.put("goldhelmet", "314");
		nodes.put("goldhelm", "314");
		nodes.put("goldhat", "314");
		nodes.put("ghelmet", "314");
		nodes.put("ghelm", "314");
		nodes.put("ghat", "314");
		nodes.put("goldchestplate", "315");
		nodes.put("goldplatebody", "315");
		nodes.put("goldshirt", "315");
		nodes.put("gchestplate", "315");
		nodes.put("gplatebody", "315");
		nodes.put("gshirt", "315");
		nodes.put("goldleggings", "316");
		nodes.put("goldpants", "316");
		nodes.put("gleggings", "316");
		nodes.put("gpants", "316");
		nodes.put("goldboots", "317");
		nodes.put("goldshoes", "317");
		nodes.put("gboots", "317");
		nodes.put("gshoes", "317");
		nodes.put("flint", "318");
		nodes.put("pork", "319");
		nodes.put("rawpork", "319");
		nodes.put("grilledpork", "320");
		nodes.put("cookedpork", "320");
		nodes.put("bacon", "320");
		nodes.put("painting", "321");
		nodes.put("picture", "321");
		nodes.put("goldenapple", "322");
		nodes.put("goldapple", "322");
		nodes.put("gapple", "322");
		nodes.put("sign", "323");
		nodes.put("woodendoor", "324");
		nodes.put("wooddoor", "324");
		nodes.put("wdoor", "324");
		nodes.put("bucket", "325");
		nodes.put("waterbucket", "326");
		nodes.put("wbucket", "326");
		nodes.put("lavabucket", "327");
		nodes.put("lbucket", "327");
		nodes.put("minecart", "328");
		nodes.put("cart", "328");
		nodes.put("saddle", "329");
		nodes.put("irondoor", "330");
		nodes.put("idoor", "330");
		nodes.put("redstone", "331");
		nodes.put("snowball", "332");
		nodes.put("boat", "333");
		nodes.put("leather", "334");
		nodes.put("milkbucket", "335");
		nodes.put("mbucket", "335");
		nodes.put("claybrick", "336");
		nodes.put("brick", "336");
		nodes.put("clayball", "337");
		nodes.put("clay", "337");
		nodes.put("reeds", "338");
		nodes.put("reed", "338");
		nodes.put("paper", "339");
		nodes.put("papyrus", "339");
		nodes.put("book", "340");
		nodes.put("slimeball", "341");
		nodes.put("sball", "341");
		nodes.put("storageminecart", "342");
		nodes.put("chestminecart", "342");
		nodes.put("storagecart", "342");
		nodes.put("chestcart", "342");
		nodes.put("sminecart", "342");
		nodes.put("cminecart", "342");
		nodes.put("scart", "342");
		nodes.put("ccart", "342");
		nodes.put("poweredminecart", "343");
		nodes.put("furnaceminecart", "343");
		nodes.put("poweredcart", "343");
		nodes.put("furnacecart", "343");
		nodes.put("pminecart", "343");
		nodes.put("fminecart", "343");
		nodes.put("pcart", "343");
		nodes.put("fcart", "343");
		nodes.put("egg", "344");
		nodes.put("compass", "345");
		nodes.put("fishingrod", "346");
		nodes.put("rod", "346");
		nodes.put("watch", "347");
		nodes.put("clock", "347");
		nodes.put("lightstonedust", "348");
		nodes.put("glowstonedust", "348");
		nodes.put("lsdust", "348");
		nodes.put("gsdust", "348");
		nodes.put("rawfish", "349");
		nodes.put("cookedfish", "350");
		nodes.put("inksack", "351");
		nodes.put("blackdye", "351");
		nodes.put("bdye", "351");
		nodes.put("bone", "352");
		nodes.put("sugar", "353");
		nodes.put("cake", "354");
		nodes.put("bed", "355");
		nodes.put("redstonerepeater", "356");
		nodes.put("diode", "356");
		nodes.put("cookie", "357");
		nodes.put("map", "358");
		nodes.put("goldrecord", "2256");
		nodes.put("golddisk", "2256");
		nodes.put("grecord", "2256");
		nodes.put("gdisk", "2256");
		nodes.put("greenrecord", "2257");
		nodes.put("greendisk", "2257");
		nodes.put("grrecord", "2257");
		nodes.put("grdisk", "2257");
		return nodes;
	}

	private static HashMap<String, String> writeSettingsRenames() {
		HashMap<String, String> nodes = new HashMap<String, String>();
		return nodes;
	}

	private static HashMap<String, String> writeEconomyRenames() {
		HashMap<String, String> nodes = new HashMap<String, String>();
		return nodes;
	}

	private static ArrayList<String> writeSettingsDeletes() {
		ArrayList<String> nodes = new ArrayList<String>();
		return nodes;
	}

	private static ArrayList<String> writeEconomyDeletes() {
		ArrayList<String> nodes = new ArrayList<String>();
		return nodes;
	}
}