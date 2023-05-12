package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class RenderHandler implements ClientModInitializer
{
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_IRON_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_OAK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SPRUCE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BIRCH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JUNGLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ACACIA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DARK_OAK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MANGROVE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHERRY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CRIMSON_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WARPED_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_ASPEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_BAOBAB_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_BULBIS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_CHERRY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_CIKA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_CYPRESS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_EBONY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_EMBUR_DOOR, RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_ETHER_DOOR, RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_FIR_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_FLORUS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_HOLLY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_IMPARIUS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_IRONWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_JACARANDA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_LAMENT_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_MAHOGANY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_MAPLE_DOOR, RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_PALM_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_PINE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_REDWOOD_DOOR, RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_SKYRIS_DOOR, RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR, RenderType.translucent());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_SYTHIAN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_WILLOW_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BYG_ZELKOVA_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JACARANDA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_REDBUD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CYPRESS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BROWN_MUSHROOM_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RED_MUSHROOM_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_AERONOS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GLACIAN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_STROPHAR_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_STEEL_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_AETHER_SKYROOT_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TWISTED_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BE_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BE_DRY_BAMBOO_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERMINITE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_THALLASIUM_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DRAGON_TREE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_END_LOTUS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_HELIX_TREE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JELLYSHROOM_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_LACUGROVE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_LUCERNIA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MOSSY_GLOWSHROOM_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_PYTHADENDRON_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TENANEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_UMBRELLA_TREE_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ANCHOR_TREE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BONE_CIN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BONE_REED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MUSHROOM_FIR_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_NETHER_MUSHROOM_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_NETHER_REED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_NETHER_SAKURA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUBEUS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_STALAGNATE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WART_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BN_WILLOW_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_BLACKSTONE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_CHARRED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_OBSIDIAN_REINFORCED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_STONE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOCKUS_WHITE_OAK_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BW_CYPRESS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DRAGONS_BLOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ELDER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JUNIPER_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_YEW_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_FLESH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_FULL_FLESH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_FLESHKIN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ANCIENT_OAK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLIGHTED_BALSA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SWAMP_CYPRESS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WILLOW_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CEILTRUNK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_LUZAWOOD_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHARM_AZALEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHARM_EBONY_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SCORCHED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_UMBRAL_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_APRICORN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_AZULE_AZALEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BRIGHT_AZALEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_FISS_AZALEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ROZE_AZALEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TECAL_AZALEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TITANIUM_AZALEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WALNUT_AZALEA_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ANDESITE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BRASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_COPPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ZINC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_LOCKED_ANDESITE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_LOCKED_BRASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_LOCKED_COPPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_LOCKED_ZINC_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECHO_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_AZALEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_COCONUT_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ECO_WALNUT_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GE_CYPRESS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GE_MUDDY_OAK_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DARK_IRON_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_AKASHIC_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_IRON_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_OAK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SPRUCE_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BIRCH_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_JUNGLE_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_ACACIA_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DARK_OAK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MANGROVE_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BAMBOO_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CRIMSON_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_WARPED_GLASS_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_BLOODSHROOM_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GREENHEART_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SKYROOT_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_PROMENADE_CHERRY_OAK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_PROMENADE_DARK_AMARANTH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_PROMENADE_PALM_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_BAOBAB_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_BLACKWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_BRIMWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_CHERRY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_CYPRESS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_DEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_EUCALYPTUS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_JOSHUA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_LARCH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_MAPLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_MAUVE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_PALM_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_PINE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_REDWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUE_WILLOW_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GINGERBREAD_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_GOLD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_NETHERITE_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_RUBBER_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERRESTRIA_CYPRESS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERRESTRIA_HEMLOCK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERRESTRIA_JAPANESE_MAPLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERRESTRIA_RAINBOW_EUCALYPTUS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERRESTRIA_REDWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERRESTRIA_RUBBER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERRESTRIA_SAKURA_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERRESTRIA_WILLOW_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TERRESTRIA_YUCCA_PALM_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TRAVERSE_FIR_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_STRIPPED_BAMBOO_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CANOPY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_DARKWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MINEWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SORTINGWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TIMEWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TRANSWOOD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TWILIGHT_OAK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_TOWERWOOD_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_SOUL_COPPER_DOOR, RenderType.cutout());
		
		// Set up rendering for all the Chipped doors.
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_HEAVY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_DUAL_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_PRESSED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_SHACK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_SLIDING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_SCREEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_GATED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_TILED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_TILE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_SECRET_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_BOARDED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_BARRED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_FORTIFIED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_SUPPORTED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_OAK_OVERGROWN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_HEAVY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_DUAL_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_PRESSED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_SHACK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_SLIDING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_SCREEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_GATED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_TILED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_TILE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_SECRET_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_BARRED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_FORTIFIED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_SUPPORTED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_SPRUCE_OVERGROWN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_HEAVY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_DUAL_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_PRESSED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_SHACK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_SLIDING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_SCREEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_GATED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_TILED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_TILE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_SECRET_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_BOARDED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_BARRED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_FORTIFIED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_SUPPORTED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_BIRCH_OVERGROWN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_HEAVY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_DUAL_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_PRESSED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_SHACK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_SLIDING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_SCREEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_GATED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_TILED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_TILE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_SECRET_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_BOARDED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_BARRED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_FORTIFIED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_SUPPORTED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_JUNGLE_OVERGROWN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_HEAVY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_DUAL_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_PRESSED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_SHACK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_SLIDING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_SCREEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_GATED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_TILED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_TILE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_SECRET_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_BOARDED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_FORTIFIED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_SUPPORTED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_ACACIA_OVERGROWN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_HEAVY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_DUAL_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_PRESSED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_SHACK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_SLIDING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_SCREEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_GATED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_TILED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_TILE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_SECRET_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_BOARDED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_BARRED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_FORTIFIED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_SUPPORTED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_DARK_OAK_OVERGROWN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_HEAVY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_DUAL_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_PRESSED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_SHACK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_SLIDING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_SCREEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_GATED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_TILED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_TILE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_SECRET_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_BOARDED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_BARRED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_FORTIFIED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_SUPPORTED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_MANGROVE_OVERGROWN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_HEAVY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_DUAL_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_PRESSED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_SHACK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_SLIDING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_SCREEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_GATED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_TILED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_TILE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_SECRET_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_BOARDED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_BARRED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_FORTIFIED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_CRIMSON_OVERGROWN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_HEAVY_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_DUAL_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_PRESSED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_SHACK_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_SLIDING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_SCREEN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_GATED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_TILED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_TILE_WINDOWED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_SECRET_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_BOARDED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_BARRED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_PANELED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_FORTIFIED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_CHIPPED_WARPED_SUPPORTED_DOOR, RenderType.cutout());
		
		// Set up rendering for all the Macaw doors.
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_STORE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SLIDING_GLASS_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JAIL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_HOSPITAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_REINFORCED_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_WARNING_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_METAL_WINDOWED_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_BARN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_BARN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_BARN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_BARN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_BARN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_BARN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_BARN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_BARN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_BARN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_BARN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_BARN_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_BARN_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_BARN_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_BARN_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_BARN_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_BARN_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_BARN_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_BARN_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_BARN_GLASS_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_STABLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_STABLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_STABLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_STABLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_STABLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_STABLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_STABLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_STABLE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_STABLE_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_STABLE_HEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_STABLE_HEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_STABLE_HEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_STABLE_HEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_STABLE_HEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_STABLE_HEAD_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_GLASS_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_BARK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_BARK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_BARK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_STEM_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_BARK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_BARK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_BARK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_BARK_GLASS_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_STEM_GLASS_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_MODERN_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_MODERN_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_CLASSIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_CLASSIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_CLASSIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_CLASSIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_CLASSIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_CLASSIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_CLASSIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_CLASSIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_CLASSIC_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_COTTAGE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_COTTAGE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_COTTAGE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_COTTAGE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_COTTAGE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_COTTAGE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_COTTAGE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_COTTAGE_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_COTTAGE_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_PAPER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_PAPER_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_BEACH_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_BEACH_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_TROPICAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_TROPICAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_TROPICAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_TROPICAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_TROPICAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_TROPICAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_TROPICAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_TROPICAL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_TROPICAL_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_FOUR_PANEL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_FOUR_PANEL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_FOUR_PANEL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_FOUR_PANEL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_FOUR_PANEL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_FOUR_PANEL_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_SWAMP_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_SWAMP_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_SWAMP_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_SWAMP_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_SWAMP_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_SWAMP_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_SWAMP_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_SWAMP_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_SWAMP_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_BAMBOO_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_BAMBOO_DOOR, RenderType.cutout());
		
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_NETHER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_NETHER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_NETHER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_NETHER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_NETHER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_NETHER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_NETHER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_NETHER_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_WARPED_NETHER_DOOR, RenderType.cutout());

		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_ACACIA_MYSTIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BAMBOO_MYSTIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_BIRCH_MYSTIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_CRIMSON_MYSTIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_DARK_OAK_MYSTIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_JUNGLE_MYSTIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_MANGROVE_MYSTIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_OAK_MYSTIC_DOOR, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.TALL_MACAW_SPRUCE_MYSTIC_DOOR, RenderType.cutout());
	}
}
