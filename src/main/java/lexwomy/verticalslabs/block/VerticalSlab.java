package lexwomy.verticalslabs.block;

import lexwomy.verticalslabs.VerticalSlabs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.block.AbstractBlock.Settings;

import static net.minecraft.block.Blocks.*;

public class VerticalSlab {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(VerticalSlabs.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final RegistryKey<ItemGroup> VERTICAL_SLAB_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(VerticalSlabs.MOD_ID, "item_group"));
    public static final ItemGroup VERTICAL_SLAB_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(VerticalSlab.VERTICAL_STONE_SLAB))
            .displayName(Text.translatable("itemGroup.vertical_slabs"))
            .build();
    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, VERTICAL_SLAB_GROUP_KEY, VERTICAL_SLAB_GROUP);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(VERTICAL_OAK_SLAB);
            itemGroup.add(VERTICAL_SPRUCE_SLAB);
            itemGroup.add(VERTICAL_BIRCH_SLAB);
            itemGroup.add(VERTICAL_JUNGLE_SLAB);
            itemGroup.add(VERTICAL_ACACIA_SLAB);
            itemGroup.add(VERTICAL_DARK_OAK_SLAB);
            itemGroup.add(VERTICAL_MANGROVE_SLAB);
            itemGroup.add(VERTICAL_CHERRY_SLAB);
            itemGroup.add(VERTICAL_BAMBOO_SLAB);
            itemGroup.add(VERTICAL_BAMBOO_MOSAIC_SLAB);
            itemGroup.add(VERTICAL_CRIMSON_SLAB);
            itemGroup.add(VERTICAL_WARPED_SLAB);
            itemGroup.add(VERTICAL_STONE_SLAB);
            itemGroup.add(VERTICAL_COBBLESTONE_SLAB);
            itemGroup.add(VERTICAL_MOSSY_COBBLESTONE_SLAB);
            itemGroup.add(VERTICAL_SMOOTH_STONE_SLAB);
            itemGroup.add(VERTICAL_STONE_BRICK_SLAB);
            itemGroup.add(VERTICAL_MOSSY_STONE_BRICK_SLAB);
            itemGroup.add(VERTICAL_GRANITE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_GRANITE_SLAB);
            itemGroup.add(VERTICAL_DIORITE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_DIORITE_SLAB);
            itemGroup.add(VERTICAL_ANDESITE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_ANDESITE_SLAB);
            itemGroup.add(VERTICAL_COBBLED_DEEPSLATE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_DEEPSLATE_SLAB);
            itemGroup.add(VERTICAL_DEEPSLATE_BRICK_SLAB);
            itemGroup.add(VERTICAL_DEEPSLATE_TILE_SLAB);
            itemGroup.add(VERTICAL_BRICK_SLAB);
            itemGroup.add(VERTICAL_MUD_BRICK_SLAB);
            itemGroup.add(VERTICAL_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_SMOOTH_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_CUT_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_RED_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_SMOOTH_RED_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_CUT_RED_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_PRISMARINE_SLAB);
            itemGroup.add(VERTICAL_PRISMARINE_BRICK_SLAB);
            itemGroup.add(VERTICAL_DARK_PRISMARINE_SLAB);
            itemGroup.add(VERTICAL_NETHER_BRICK_SLAB);
            itemGroup.add(VERTICAL_RED_NETHER_BRICK_SLAB);
            itemGroup.add(VERTICAL_BLACKSTONE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_BLACKSTONE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB);
            itemGroup.add(VERTICAL_END_STONE_BRICK_SLAB);
            itemGroup.add(VERTICAL_PURPUR_SLAB);
            itemGroup.add(VERTICAL_QUARTZ_SLAB);
            itemGroup.add(VERTICAL_SMOOTH_QUARTZ_SLAB);
            itemGroup.add(VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(EXPOSED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WEATHERED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(OXIDIZED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WAXED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB);
        });
        ItemGroupEvents.modifyEntriesEvent(VERTICAL_SLAB_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(VERTICAL_OAK_SLAB);
            itemGroup.add(VERTICAL_SPRUCE_SLAB);
            itemGroup.add(VERTICAL_BIRCH_SLAB);
            itemGroup.add(VERTICAL_JUNGLE_SLAB);
            itemGroup.add(VERTICAL_ACACIA_SLAB);
            itemGroup.add(VERTICAL_DARK_OAK_SLAB);
            itemGroup.add(VERTICAL_MANGROVE_SLAB);
            itemGroup.add(VERTICAL_CHERRY_SLAB);
            itemGroup.add(VERTICAL_BAMBOO_SLAB);
            itemGroup.add(VERTICAL_BAMBOO_MOSAIC_SLAB);
            itemGroup.add(VERTICAL_CRIMSON_SLAB);
            itemGroup.add(VERTICAL_WARPED_SLAB);
            itemGroup.add(VERTICAL_STONE_SLAB);
            itemGroup.add(VERTICAL_COBBLESTONE_SLAB);
            itemGroup.add(VERTICAL_MOSSY_COBBLESTONE_SLAB);
            itemGroup.add(VERTICAL_SMOOTH_STONE_SLAB);
            itemGroup.add(VERTICAL_STONE_BRICK_SLAB);
            itemGroup.add(VERTICAL_MOSSY_STONE_BRICK_SLAB);
            itemGroup.add(VERTICAL_GRANITE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_GRANITE_SLAB);
            itemGroup.add(VERTICAL_DIORITE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_DIORITE_SLAB);
            itemGroup.add(VERTICAL_ANDESITE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_ANDESITE_SLAB);
            itemGroup.add(VERTICAL_COBBLED_DEEPSLATE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_DEEPSLATE_SLAB);
            itemGroup.add(VERTICAL_DEEPSLATE_BRICK_SLAB);
            itemGroup.add(VERTICAL_DEEPSLATE_TILE_SLAB);
            itemGroup.add(VERTICAL_BRICK_SLAB);
            itemGroup.add(VERTICAL_MUD_BRICK_SLAB);
            itemGroup.add(VERTICAL_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_SMOOTH_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_CUT_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_RED_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_SMOOTH_RED_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_CUT_RED_SANDSTONE_SLAB);
            itemGroup.add(VERTICAL_PRISMARINE_SLAB);
            itemGroup.add(VERTICAL_PRISMARINE_BRICK_SLAB);
            itemGroup.add(VERTICAL_DARK_PRISMARINE_SLAB);
            itemGroup.add(VERTICAL_NETHER_BRICK_SLAB);
            itemGroup.add(VERTICAL_RED_NETHER_BRICK_SLAB);
            itemGroup.add(VERTICAL_BLACKSTONE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_BLACKSTONE_SLAB);
            itemGroup.add(VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB);
            itemGroup.add(VERTICAL_END_STONE_BRICK_SLAB);
            itemGroup.add(VERTICAL_PURPUR_SLAB);
            itemGroup.add(VERTICAL_QUARTZ_SLAB);
            itemGroup.add(VERTICAL_SMOOTH_QUARTZ_SLAB);
            itemGroup.add(VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(EXPOSED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WEATHERED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(OXIDIZED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WAXED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB);
            itemGroup.add(WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB);
        });

        OxidizableBlocksRegistry.registerOxidizableBlockPair(VERTICAL_CUT_COPPER_SLAB, EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_VERTICAL_CUT_COPPER_SLAB, WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_VERTICAL_CUT_COPPER_SLAB, OXIDIZED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VERTICAL_CUT_COPPER_SLAB, WAXED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_VERTICAL_CUT_COPPER_SLAB, WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_VERTICAL_CUT_COPPER_SLAB, WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_VERTICAL_CUT_COPPER_SLAB, WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB);
    }

    public static final Block VERTICAL_OAK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(OAK_SLAB)),
            "vertical_oak_slab",
            true
    );

    public static final Block VERTICAL_SPRUCE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(SPRUCE_SLAB)),
            "vertical_spruce_slab",
            true
    );

    public static final Block VERTICAL_BIRCH_SLAB = register(
            new VerticalSlabBlock(Settings.copy(BIRCH_SLAB)),
            "vertical_birch_slab",
            true
    );

    public static final Block VERTICAL_JUNGLE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(JUNGLE_SLAB)),
            "vertical_jungle_slab",
            true
    );

    public static final Block VERTICAL_ACACIA_SLAB = register(
            new VerticalSlabBlock(Settings.copy(ACACIA_SLAB)),
            "vertical_acacia_slab",
            true
    );

    public static final Block VERTICAL_DARK_OAK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(DARK_OAK_SLAB)),
            "vertical_dark_oak_slab",
            true
    );

    public static final Block VERTICAL_MANGROVE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(MANGROVE_SLAB)),
            "vertical_mangrove_slab",
            true
    );

    public static final Block VERTICAL_CHERRY_SLAB = register(
            new VerticalSlabBlock(Settings.copy(CHERRY_SLAB)),
            "vertical_cherry_slab",
            true
    );

    public static final Block VERTICAL_BAMBOO_SLAB = register(
            new VerticalSlabBlock(Settings.copy(BAMBOO_SLAB)),
            "vertical_bamboo_slab",
            true
    );

    public static final Block VERTICAL_BAMBOO_MOSAIC_SLAB = register(
            new VerticalSlabBlock(Settings.copy(BAMBOO_MOSAIC_SLAB)),
            "vertical_bamboo_mosaic_slab",
            true
    );

    public static final Block VERTICAL_CRIMSON_SLAB = register(
            new VerticalSlabBlock(Settings.copy(CRIMSON_SLAB)),
            "vertical_crimson_slab",
            true
    );

    public static final Block VERTICAL_WARPED_SLAB = register(
            new VerticalSlabBlock(Settings.copy(WARPED_SLAB)),
            "vertical_warped_slab",
            true
    );

    public static final Block VERTICAL_STONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(STONE_SLAB)),
            "vertical_stone_slab",
            true
    );

    public static final Block VERTICAL_SMOOTH_STONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(SMOOTH_STONE_SLAB)),
            "vertical_smooth_stone_slab",
            true
    );

    public static final Block VERTICAL_COBBLESTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(COBBLESTONE_SLAB)),
            "vertical_cobblestone_slab",
            true
    );

    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(MOSSY_COBBLESTONE_SLAB)),
            "vertical_mossy_cobblestone_slab",
            true
    );

    public static final Block VERTICAL_STONE_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(STONE_BRICK_SLAB)),
            "vertical_stone_brick_slab",
            true
    );

    public static final Block VERTICAL_MOSSY_STONE_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(MOSSY_STONE_BRICK_SLAB)),
            "vertical_mossy_stone_brick_slab",
            true
    );

    public static final Block VERTICAL_GRANITE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(GRANITE_SLAB)),
            "vertical_granite_slab",
            true
    );

    public static final Block VERTICAL_POLISHED_GRANITE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(POLISHED_GRANITE_SLAB)),
            "vertical_polished_granite_slab",
            true
    );

    public static final Block VERTICAL_DIORITE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(DIORITE_SLAB)),
            "vertical_diorite_slab",
            true
    );

    public static final Block VERTICAL_POLISHED_DIORITE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(POLISHED_DIORITE_SLAB)),
            "vertical_polished_diorite_slab",
            true
    );

    public static final Block VERTICAL_ANDESITE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(ANDESITE_SLAB)),
            "vertical_andesite_slab",
            true
    );

    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(POLISHED_ANDESITE_SLAB)),
            "vertical_polished_andesite_slab",
            true
    );

    public static final Block VERTICAL_COBBLED_DEEPSLATE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(COBBLED_DEEPSLATE_SLAB)),
            "vertical_cobbled_deepslate_slab",
            true
    );

    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(POLISHED_DEEPSLATE_SLAB)),
            "vertical_polished_deepslate_slab",
            true
    );

    public static final Block VERTICAL_DEEPSLATE_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(DEEPSLATE_BRICK_SLAB)),
            "vertical_deepslate_brick_slab",
            true
    );

    public static final Block VERTICAL_DEEPSLATE_TILE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(DEEPSLATE_TILE_SLAB)),
            "vertical_deepslate_tile_slab",
            true
    );

    public static final Block VERTICAL_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(BRICK_SLAB)),
            "vertical_brick_slab",
            true
    );

    public static final Block VERTICAL_MUD_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(MUD_BRICK_SLAB)),
            "vertical_mud_brick_slab",
            true
    );

    public static final Block VERTICAL_SANDSTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(SANDSTONE_SLAB)),
            "vertical_sandstone_slab",
            true
    );

    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(SMOOTH_SANDSTONE_SLAB)),
            "vertical_smooth_sandstone_slab",
            true
    );

    public static final Block VERTICAL_CUT_SANDSTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(CUT_SANDSTONE_SLAB)),
            "vertical_cut_sandstone_slab",
            true
    );

    public static final Block VERTICAL_RED_SANDSTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(RED_SANDSTONE_SLAB)),
            "vertical_red_sandstone_slab",
            true
    );

    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(SMOOTH_RED_SANDSTONE_SLAB)),
            "vertical_smooth_red_sandstone_slab",
            true
    );

    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(CUT_RED_SANDSTONE_SLAB)),
            "vertical_cut_red_sandstone_slab",
            true
    );

    public static final Block VERTICAL_PRISMARINE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(PRISMARINE_SLAB)),
            "vertical_prismarine_slab",
            true
    );

    public static final Block VERTICAL_PRISMARINE_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(PRISMARINE_BRICK_SLAB)),
            "vertical_prismarine_brick_slab",
            true
    );

    public static final Block VERTICAL_DARK_PRISMARINE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(DARK_PRISMARINE_SLAB)),
            "vertical_dark_prismarine_slab",
            true
    );

    public static final Block VERTICAL_NETHER_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(NETHER_BRICK_SLAB)),
            "vertical_nether_brick_slab",
            true
    );

    public static final Block VERTICAL_RED_NETHER_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(RED_NETHER_BRICK_SLAB)),
            "vertical_red_nether_brick_slab",
            true
    );

    public static final Block VERTICAL_BLACKSTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(BLACKSTONE_SLAB)),
            "vertical_blackstone_slab",
            true
    );

    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB = register(
            new VerticalSlabBlock(Settings.copy(POLISHED_BLACKSTONE_SLAB)),
            "vertical_polished_blackstone_slab",
            true
    );

    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(POLISHED_BLACKSTONE_BRICK_SLAB)),
            "vertical_polished_blackstone_brick_slab",
            true
    );

    public static final Block VERTICAL_END_STONE_BRICK_SLAB = register(
            new VerticalSlabBlock(Settings.copy(END_STONE_BRICK_SLAB)),
            "vertical_end_stone_brick_slab",
            true
    );

    public static final Block VERTICAL_PURPUR_SLAB = register(
            new VerticalSlabBlock(Settings.copy(PURPUR_SLAB)),
            "vertical_purpur_slab",
            true
    );

    public static final Block VERTICAL_QUARTZ_SLAB = register(
            new VerticalSlabBlock(Settings.copy(QUARTZ_SLAB)),
            "vertical_quartz_slab",
            true
    );

    public static final Block VERTICAL_SMOOTH_QUARTZ_SLAB = register(
            new VerticalSlabBlock(Settings.copy(SMOOTH_QUARTZ_SLAB)),
            "vertical_smooth_quartz_slab",
            true
    );

    public static final Block VERTICAL_CUT_COPPER_SLAB = register(
            new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, Settings.copy(CUT_COPPER_SLAB)),
            "vertical_cut_copper_slab",
            true
    );

    public static final Block EXPOSED_VERTICAL_CUT_COPPER_SLAB = register(
            new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.EXPOSED, Settings.copy(EXPOSED_CUT_COPPER_SLAB)),
            "exposed_vertical_cut_copper_slab",
            true
    );

    public static final Block WEATHERED_VERTICAL_CUT_COPPER_SLAB = register(
            new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.WEATHERED, Settings.copy(WEATHERED_CUT_COPPER_SLAB)),
            "weathered_vertical_cut_copper_slab",
            true
    );

    public static final Block OXIDIZED_VERTICAL_CUT_COPPER_SLAB = register(
            new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, Settings.copy(OXIDIZED_CUT_COPPER_SLAB)),
            "oxidized_vertical_cut_copper_slab",
            true
    );

    public static final Block WAXED_VERTICAL_CUT_COPPER_SLAB = register(
            new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, Settings.copy(CUT_COPPER_SLAB)),
            "waxed_vertical_cut_copper_slab",
            true
    );

    public static final Block WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB = register(
            new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.EXPOSED, Settings.copy(EXPOSED_CUT_COPPER_SLAB)),
            "waxed_exposed_vertical_cut_copper_slab",
            true
    );

    public static final Block WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB = register(
            new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.WEATHERED, Settings.copy(WEATHERED_CUT_COPPER_SLAB)),
            "waxed_weathered_vertical_cut_copper_slab",
            true
    );

    public static final Block WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB = register(
            new OxidizableVerticalSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, Settings.copy(OXIDIZED_CUT_COPPER_SLAB)),
            "waxed_oxidized_vertical_cut_copper_slab",
            true
    );
}