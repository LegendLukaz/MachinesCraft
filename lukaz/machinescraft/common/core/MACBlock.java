package lukaz.machinescraft.common.core;

import lukaz.machinescraft.MachinesCraft;
import lukaz.machinescraft.common.block.BlockMachinesCraftOre;
import lukaz.machinescraft.common.itemblock.ItemBlockMachinesCraftOre;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class MACBlock {
	
	public static void init()
    {
            initializeBlocks();
    }
	
	private static void initializeBlocks()
	{
		registerBlock(new BlockMachinesCraftOre().func_149663_c("machinescraftore"),ItemBlockMachinesCraftOre.class);
	}
	
	public static void registerBlock(Block block)
    {
            //TODO:                                                                 getUnlocalizedName()
        GameRegistry.registerBlock(block, block.func_149739_a().replace("tile.", ""));
    }
	
	 public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlockClass)
	    {
	                //TODO:                                                                                                 getUnlocalizedName()
	        GameRegistry.registerBlock(block, itemBlockClass, MachinesCraft.MODID + (block.func_149739_a().replace("tile.", "")));
	    }
}
