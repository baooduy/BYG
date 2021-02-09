package corgiaoc.byg.common.world.biome;

import corgiaoc.byg.config.json.endbiomedata.EndBiomeData;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.WeightedList;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;

import javax.annotation.Nullable;
import java.util.*;

@SuppressWarnings("deprecation")
public class BYGEndBiome {
    public static final List<BYGEndBiome> BYG_END_BIOMES = new ArrayList<>();
    private final Biome biome;

    public static List<EndBiomeData> endBiomeData = new ArrayList<>();
    public static List<EndBiomeData> voidBiomeData = new ArrayList<>();

    public static Map<Identifier, WeightedList<Identifier>> BIOME_TO_HILLS = new HashMap<>();
    public static Map<Identifier, Identifier> BIOME_TO_EDGE = new HashMap<>();

    public BYGEndBiome(Biome.Weather climate, Biome.Category category, float depth, float scale, BiomeEffects effects, GenerationSettings biomeGenerationSettings, SpawnSettings mobSpawnInfo) {
        biome = new Biome(climate, category, depth, scale, effects, biomeGenerationSettings, mobSpawnInfo);
        BYG_END_BIOMES.add(this);
    }

    public BYGEndBiome(Biome.Builder builder) {
        this.biome = builder.build();
        BYG_END_BIOMES.add(this);
    }

    public BYGEndBiome(Biome biome) {
        this.biome = biome;
        BYG_END_BIOMES.add(this);
    }

    public Biome getBiome() {
        return this.biome;
    }

    @Nullable
    public WeightedList<Identifier> getHills() {
        return null;
    }

    @Nullable
    public Biome getEdge() {
        return null;
    }

    public int getWeight() {
        return 5;
    }

    public Object getBiomeDictionary() {
        return null; //new BiomeDictionary.Type[]{BiomeDictionary.Type.END};
    }


    public boolean isVoid() {
        return false;
    }

    public RegistryKey<Biome> getKey() {
        return RegistryKey.of(Registry.BIOME_KEY, Objects.requireNonNull(BuiltinRegistries.BIOME.getId(this.biome)));
    }
}
