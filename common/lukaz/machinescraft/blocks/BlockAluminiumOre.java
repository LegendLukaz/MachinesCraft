package lukaz.machinescraft.blocks;

import lukaz.machinescraft.Machinescraft;
import lukaz.machinescraft.lib.Strings;
import net.minecraft.block.material.Material;

public class BlockAluminiumOre extends BlockMachinescraft
{

    public BlockAluminiumOre(int id) {

        super(id, Material.rock);
        this.setUnlocalizedName(Strings.ALUMINIUM_NAME);
        this.setCreativeTab(Machinescraft.machinesCraftTab);
        this.setHardness(3.0F);
        this.setResistance(10.0F);

    }

}
