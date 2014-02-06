package lukaz.machinescraft.common.worldgen;

import java.util.Random;

import lukaz.machinescraft.MachinesCraft;
import lukaz.machinescraft.common.block.BlockMachinesCraftOre;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class MACWorldGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub

		switch(world.provider.dimensionId)
        {
               case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
               case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
               case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
	}

	private void generateEnd(World world, Random random, int x, int z) {
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		
		String[] arr = BlockMachinesCraftOre.oreTypes;
		int i = arr.length;
		
		for(int j=0; j<i; j++){
			if(j == 2){
				this.addOreSpawn(MachinesCraft.oreMachinesCraft, j, world, random, x, z, 16, 16, 1 + random.nextInt(2), 2 + random.nextInt(1), 1, 25);
				continue;
			}
			
			if(j == 3){
				this.addOreSpawn(MachinesCraft.oreMachinesCraft, j, world, random, x, z, 16, 16, 1 + random.nextInt(1), 1 + random.nextInt(1), 1, 15);
				continue;
			}
		this.addOreSpawn(MachinesCraft.oreMachinesCraft, j, world, random, x, z, 16, 16, 4 + random.nextInt(2), 6, 10, 55);
		}
	}

	private void generateNether(World world, Random random, int x, int z) {

		
	}
	
    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     *
     * @param The Block to spawn
     * @param The World to spawn in
     * @param A Random object for retrieving random positions within the world to spawn the Block
     * @param An int for passing the X-Coordinate for the Generation method
     * @param An int for passing the Z-Coordinate for the Generation method
     * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An int for setting the maximum size of a vein
     * @param An int for the Number of chances available for the Block to spawn per-chunk
     * @param An int for the minimum Y-Coordinate height at which this block may spawn
     * @param An int for the maximum Y-Coordinate height at which this block may spawn
     **/
    public void addOreSpawn(Block block, int metadata, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
          int maxPossY = minY + (maxY - 1);
          
          int diffBtwnMinMaxY = maxY - minY;
          for(int x = 0; x < chancesToSpawn; x++)
          {
                 int posX = blockXPos + random.nextInt(maxX);
                 int posY = minY + random.nextInt(diffBtwnMinMaxY);
                 int posZ = blockZPos + random.nextInt(maxZ);
                 (new WorldGenMinable(block, metadata, maxVeinSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
          }
    }

}
