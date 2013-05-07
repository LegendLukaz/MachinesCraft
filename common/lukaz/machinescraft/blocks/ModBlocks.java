package lukaz.machinescraft.blocks;

import lukaz.machinescraft.lib.BlockIds;
import lukaz.machinescraft.lib.Strings;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    /* Mod block instances */
    public static Block aluminiumOre;
    public static Block mechanicBlock;

    public static void init()
    {

        aluminiumOre = new BlockAluminiumOre(BlockIds.ALUMINIUM_ORE);
        mechanicBlock = new BlockMechanicBlock(BlockIds.MECHANIC_BLOCK);

        GameRegistry.registerBlock(aluminiumOre, Strings.ALUMINIUM_ORE_NAME);
        GameRegistry.registerBlock(mechanicBlock, Strings.MECHANIC_BLOCK_NAME);


    }

}
