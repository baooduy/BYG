package corgiaoc.byg.common.properties.vanilla;

import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.carver.Carver;

import java.util.HashSet;
import java.util.Set;

public class BYGCarvableBlocks {

    @SuppressWarnings("deprecation")
    public static void addCarverBlocks() {
        for (Carver<?> worldCarver : Registry.CARVER) {
            Set<Block> blocks = new HashSet<>(worldCarver.alwaysCarvableBlocks);
            blocks.add(BYGBlocks.OVERGROWN_DACITE);
            blocks.add(BYGBlocks.PODZOL_DACITE);
            blocks.add(BYGBlocks.SOAPSTONE);
            blocks.add(BYGBlocks.ROCKY_STONE);
            blocks.add(BYGBlocks.MOSSY_STONE);
            blocks.add(BYGBlocks.OVERGROWN_STONE);
            blocks.add(BYGBlocks.SCORIA_STONE);
            blocks.add(BYGBlocks.MEADOW_DIRT);
            blocks.add(BYGBlocks.PEAT);
            worldCarver.alwaysCarvableBlocks = blocks;
        }
    }
}
