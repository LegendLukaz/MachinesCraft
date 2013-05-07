package lukaz.machinescraft.worldgen;

import java.util.Random;

import lukaz.machinescraft.Machinescraft;
import lukaz.machinescraft.lib.BlockIds;
import lukaz.machinescraft.lib.Worldgen;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldgeneratorMachinesCraft implements IWorldGenerator {

	lukaz.machinescraft.Machinescraft MachinesCraft = new Machinescraft();
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		 switch (world.provider.dimensionId)
		  {
		   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		  }
		
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		int Xcoord = blockX + random.nextInt(16);
		int Ycoord = random.nextInt(Worldgen.ALUMINIUM_ORE_MAX_Y_LEVEL);
		int Zcoord = blockZ + random.nextInt(16);
		  
		(new WorldGenMinable(BlockIds.ALUMINIUM_ORE, Worldgen.ALUMINIUM_ORE_NODE)).generate(world, random, Xcoord, Ycoord, Zcoord);
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
