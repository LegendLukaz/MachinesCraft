package lukaz.machinescraft.common.helper;

import lukaz.machinescraft.MachinesCraft;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class MachinesCraftBlockHelper {

	public static Block get(String name)
    {
        return GameRegistry.findBlock(MachinesCraft.MODID, name);
    }
	
}
