package lukaz.machinescraft.blocks;

import lukaz.machinescraft.Machinescraft;
import lukaz.machinescraft.lib.Strings;
import net.minecraft.block.material.Material;

public class BlockMechanicBlock extends BlockMachinescraft {
	
	public BlockMechanicBlock(int id) {

		super(id, Material.iron);
		this.setUnlocalizedName(Strings.MECHANIC_BLOCK_NAME);
		this.setHardness(3.33F);
		this.setResistance(30F);
		this.setCreativeTab(Machinescraft.machinesCraftTab);
		}
	
}
