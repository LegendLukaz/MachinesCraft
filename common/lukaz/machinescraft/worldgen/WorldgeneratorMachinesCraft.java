package lukaz.machinescraft.worldgen;

import java.util.Random;

import lukaz.machinescraft.Machinescraft;

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
		int Ycoord = random.nextInt(Machinescraft.AluminiumOreMaxY);
		int Zcoord = blockZ + random.nextInt(16);
		  
		(new WorldGenMinable(Machinescraft.AluminiumOre.blockID, Machinescraft.AluminiumOreNode)).generate(world, random, Xcoord, Ycoord, Zcoord);
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
