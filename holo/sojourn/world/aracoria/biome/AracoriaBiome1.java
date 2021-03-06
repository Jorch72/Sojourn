package holo.sojourn.world.aracoria.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class AracoriaBiome1 extends BiomeGenBase
{
    public AracoriaBiome1(int par1)
    {
        super(par1);
        this.setBiomeName("Aracoria1");
        this.minHeight = 4.0F;
        this.maxHeight = 4.0F;
        this.theBiomeDecorator.treesPerChunk = 0;
        this.theBiomeDecorator.grassPerChunk = 0;
        this.theBiomeDecorator.flowersPerChunk = 0;
        this.topBlock = (byte) Block.grass.blockID;
        this.fillerBlock = (byte) Block.dirt.blockID;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.theBiomeDecorator = new AracoriaBiomeDecorator(this);
    }
}
