package com.resourcefulbees.resourcefulbees.registry;

import com.resourcefulbees.resourcefulbees.ResourcefulBees;
import com.resourcefulbees.resourcefulbees.config.Config;
import com.resourcefulbees.resourcefulbees.item.*;
import com.resourcefulbees.resourcefulbees.lib.NBTConstants;
import com.resourcefulbees.resourcefulbees.utils.TooltipBuilder;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ResourcefulBees.MOD_ID);


    public static final RegistryObject<Item> OREO_COOKIE = ITEMS.register("oreo_cookie", () -> new Item(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).food(new Food.Builder()
            .effect(new EffectInstance(Effects.REGENERATION, 600, 1), 1)
            .effect(new EffectInstance(Effects.ABSORPTION, 2400, 3), 1)
            .effect(new EffectInstance(Effects.SATURATION, 2400, 1), 1)
            .effect(new EffectInstance(Effects.LUCK, 600, 3), 1)
            .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), 1)
            .effect(new EffectInstance(Effects.RESISTANCE, 6000, 0), 1)
            .effect(new EffectInstance(Effects.WATER_BREATHING, 6000, 0), 1)
            .effect(new EffectInstance(Effects.NIGHT_VISION, 1200, 0), 1)
            .hunger(8)
            .saturation(2)
            .setAlwaysEdible()
            .build())
            .rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> T1_BEEHIVE_ITEM = ITEMS.register("t1_beehive",() -> new BlockItem(ModBlocks.T1_BEEHIVE.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> T2_BEEHIVE_ITEM = ITEMS.register("t2_beehive",() -> new BlockItem(ModBlocks.T2_BEEHIVE.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> T3_BEEHIVE_ITEM = ITEMS.register("t3_beehive",() -> new BlockItem(ModBlocks.T3_BEEHIVE.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> T4_BEEHIVE_ITEM = ITEMS.register("t4_beehive",() -> new BlockItem(ModBlocks.T4_BEEHIVE.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> SCRAPER = ITEMS.register("scraper", () ->  new Item(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).maxStackSize(1)) {
        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable World worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            tooltip.add(new StringTextComponent(TextFormatting.GOLD + I18n.format("item.resourcefulbees.scraper.tooltip")));
            tooltip.add(new StringTextComponent(TextFormatting.GOLD + I18n.format("item.resourcefulbees.scraper.tooltip.1")));
            super.addInformation(stack, worldIn, tooltip, flagIn);
        }
    });
    public static final RegistryObject<Item> SMOKER = ITEMS.register("smoker", () -> new Smoker(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).setNoRepair().maxDamage(Config.SMOKER_DURABILITY.get())));
    public static final RegistryObject<Item> BELLOW = ITEMS.register("bellow", () -> new Item(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> SMOKERCAN = ITEMS.register("smoker_can", () -> new Item(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> WAX = ITEMS.register("wax", () -> new Item(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> POLLEN = ITEMS.register("pollen", () -> new Pollen(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> FERTILIZER = ITEMS.register("fertilizer", () -> new Fertilizer(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> CENTRIFUGE_ITEM = ITEMS.register("centrifuge", () -> new BlockItem(ModBlocks.CENTRIFUGE.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> MECHANICAL_CENTRIFUGE_ITEM = ITEMS.register("mechanical_centrifuge", () -> new BlockItem(ModBlocks.MECHANICAL_CENTRIFUGE.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> CENTRIFUGE_CONTROLLER_ITEM = ITEMS.register("centrifuge_controller", () -> new BlockItem(ModBlocks.CENTRIFUGE_CONTROLLER.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> CENTRIFUGE_CASING_ITEM = ITEMS.register("centrifuge_casing", () -> new BlockItem(ModBlocks.CENTRIFUGE_CASING.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> HONEY_GENERATOR_ITEM = ITEMS.register("honey_generator", () -> new BlockItem(ModBlocks.HONEY_GENERATOR.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> WAX_BLOCK_ITEM = ITEMS.register("wax_block", () -> new BlockItem(ModBlocks.WAX_BLOCK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> GOLD_FLOWER_ITEM = ITEMS.register("gold_flower", () -> new BlockItem(ModBlocks.GOLD_FLOWER.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> BEE_JAR = ITEMS.register("bee_jar", () -> new BeeJar(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).maxDamage(0).maxStackSize(16)));
    public static final RegistryObject<Item> OAK_BEE_NEST_ITEM = ITEMS.register("bee_nest",() -> new BlockItem(ModBlocks.OAK_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> ACACIA_BEE_NEST_ITEM = ITEMS.register("acacia_bee_nest",() -> new BlockItem(ModBlocks.ACACIA_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> GRASS_BEE_NEST_ITEM = ITEMS.register("grass_bee_nest",() -> new BlockItem(ModBlocks.GRASS_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> JUNGLE_BEE_NEST_ITEM = ITEMS.register("jungle_bee_nest",() -> new BlockItem(ModBlocks.JUNGLE_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> NETHER_BEE_NEST_ITEM = ITEMS.register("nether_bee_nest",() -> new BlockItem(ModBlocks.NETHER_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> PRISMARINE_BEE_NEST_ITEM = ITEMS.register("prismarine_bee_nest",() -> new BlockItem(ModBlocks.PRISMARINE_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> PURPUR_BEE_NEST_ITEM = ITEMS.register("purpur_bee_nest",() -> new BlockItem(ModBlocks.PURPUR_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> BIRCH_BEE_NEST_ITEM = ITEMS.register("birch_bee_nest",() -> new BlockItem(ModBlocks.BIRCH_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> WITHER_BEE_NEST_ITEM = ITEMS.register("wither_bee_nest",() -> new BlockItem(ModBlocks.WITHER_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> BROWN_MUSHROOM_NEST_ITEM = ITEMS.register("brown_mushroom_bee_nest",() -> new BlockItem(ModBlocks.BROWN_MUSHROOM_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> CRIMSON_BEE_NEST_ITEM = ITEMS.register("crimson_bee_nest",() -> new BlockItem(ModBlocks.CRIMSON_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_BEE_NEST_ITEM = ITEMS.register("crimson_nylium_bee_nest",() -> new BlockItem(ModBlocks.CRIMSON_NYLIUM_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> DARK_OAK_NEST_ITEM = ITEMS.register("dark_oak_bee_nest",() -> new BlockItem(ModBlocks.DARK_OAK_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> RED_MUSHROOM_NEST_ITEM = ITEMS.register("red_mushroom_bee_nest",() -> new BlockItem(ModBlocks.RED_MUSHROOM_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> SPRUCE_BEE_NEST_ITEM = ITEMS.register("spruce_bee_nest",() -> new BlockItem(ModBlocks.SPRUCE_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> WARPED_BEE_NEST_ITEM = ITEMS.register("warped_bee_nest",() -> new BlockItem(ModBlocks.WARPED_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> WARPED_NYLIUM_BEE_NEST_ITEM = ITEMS.register("warped_nylium_bee_nest",() -> new BlockItem(ModBlocks.WARPED_NYLIUM_BEE_NEST.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> T1_APIARY_ITEM = ITEMS.register("t1_apiary",() -> new BlockItem(ModBlocks.T1_APIARY_BLOCK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> T2_APIARY_ITEM = ITEMS.register("t2_apiary",() -> new BlockItem(ModBlocks.T2_APIARY_BLOCK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> T3_APIARY_ITEM = ITEMS.register("t3_apiary",() -> new BlockItem(ModBlocks.T3_APIARY_BLOCK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> T4_APIARY_ITEM = ITEMS.register("t4_apiary",() -> new BlockItem(ModBlocks.T4_APIARY_BLOCK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> APIARY_STORAGE_ITEM = ITEMS.register("apiary_storage",() -> new BlockItem(ModBlocks.APIARY_STORAGE_BLOCK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> APIARY_BREEDER_ITEM = ITEMS.register("apiary_breeder",() -> new BlockItem(ModBlocks.APIARY_BREEDER_BLOCK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> ENDER_BEECON_ITEM = ITEMS.register("ender_beecon", () -> new BlockItem(ModBlocks.ENDER_BEECON.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> PURPUR_HONEY_TANK_ITEM = ITEMS.register("purpur_honey_tank", () -> new BlockItem(ModBlocks.PURPUR_HONEY_TANK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> NETHER_HONEY_TANK_ITEM = ITEMS.register("nether_honey_tank", () -> new BlockItem(ModBlocks.NETHER_HONEY_TANK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> WOODEN_HONEY_TANK_ITEM = ITEMS.register("wooden_honey_tank", () -> new BlockItem(ModBlocks.WOODEN_HONEY_TANK.get(), new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES)));
    public static final RegistryObject<Item> IRON_STORAGE_UPGRADE = ITEMS.register("iron_storage_upgrade", () -> new UpgradeItem(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).maxDamage(0).maxStackSize(16),
            UpgradeItem.builder()
            .upgradeType(NBTConstants.NBT_STORAGE_UPGRADE)
            .upgradeModification(NBTConstants.NBT_SLOT_UPGRADE, 27F)
            .build()));
    public static final RegistryObject<Item> GOLD_STORAGE_UPGRADE = ITEMS.register("gold_storage_upgrade", () -> new UpgradeItem(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).maxDamage(0).maxStackSize(16),
            UpgradeItem.builder()
                    .upgradeType(NBTConstants.NBT_STORAGE_UPGRADE)
                    .upgradeModification(NBTConstants.NBT_SLOT_UPGRADE, 54F)
                    .build()));
    public static final RegistryObject<Item> DIAMOND_STORAGE_UPGRADE = ITEMS.register("diamond_storage_upgrade", () -> new UpgradeItem(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).maxDamage(0).maxStackSize(16),
            UpgradeItem.builder()
                    .upgradeType(NBTConstants.NBT_STORAGE_UPGRADE)
                    .upgradeModification(NBTConstants.NBT_SLOT_UPGRADE, 81F)
                    .build()));
    public static final RegistryObject<Item> EMERALD_STORAGE_UPGRADE = ITEMS.register("emerald_storage_upgrade", () -> new UpgradeItem(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).maxDamage(0).maxStackSize(16),
            UpgradeItem.builder()
                    .upgradeType(NBTConstants.NBT_STORAGE_UPGRADE)
                    .upgradeModification(NBTConstants.NBT_SLOT_UPGRADE, 108F)
                    .build()));
    public static final RegistryObject<Item> APIARY_BREEDER_UPGRADE = ITEMS.register("apiary_breeder_upgrade", () -> new UpgradeItem(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).maxDamage(0).maxStackSize(16),
            UpgradeItem.builder()
                    .upgradeType(NBTConstants.NBT_BREEDER_UPGRADE)
                    .upgradeModification(NBTConstants.NBT_BREEDER_COUNT, 1)
                    .build()) {
        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable World worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            tooltip.addAll(new TooltipBuilder()
                    .addTip(I18n.format("item.resourcefulbees.apiary_breeder_upgrade.tooltip.info"), TextFormatting.GOLD)
                    .build());
            super.addInformation(stack, worldIn, tooltip, flagIn);
        }
    });
    public static final RegistryObject<Item> APIARY_BREED_TIME_UPGRADE = ITEMS.register("apiary_breed_time_upgrade", () -> new UpgradeItem(new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).maxDamage(0).maxStackSize(16),
            UpgradeItem.builder()
                    .upgradeType(NBTConstants.NBT_BREEDER_UPGRADE)
                    .upgradeModification(NBTConstants.NBT_BREED_TIME, 300)
                    .build()) {
        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable World worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            tooltip.addAll(new TooltipBuilder()
                    .addTip(I18n.format("item.resourcefulbees.apiary_breed_time_upgrade.tooltip.info"), TextFormatting.GOLD)
                    .build());
            super.addInformation(stack, worldIn, tooltip, flagIn);
        }
    });
    public static final RegistryObject<Item> HONEY_FLUID_BUCKET = ITEMS.register("honey_fluid_bucket", () -> new BucketItem(ModFluids.HONEY_STILL, new Item.Properties().group(ItemGroupResourcefulBees.RESOURCEFUL_BEES).containerItem(net.minecraft.item.Items.BUCKET).maxStackSize(1)));
}
