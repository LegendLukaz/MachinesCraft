package lukaz.machinescraft.common.oredict;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import lukaz.machinescraft.MachinesCraft;
import lukaz.machinescraft.common.block.BlockMachinesCraftOre;
import lukaz.machinescraft.common.itemblock.ItemBlockMachinesCraftOre;
import net.minecraftforge.oredict.OreDictionary;

public class MACOredict {
	
	public static void init() {
		// TODO Auto-generated method stub
		String[] arr = BlockMachinesCraftOre.oreTypes;
		int i = arr.length;
		
		for(int j = 0;j<i;j++){
		
			OreDictionary.registerOre(arr[j].replace("_", ""), new ItemStack(MachinesCraft.oreMachinesCraft, 1, j));
		}
		
		
		
		
	}

}
	
