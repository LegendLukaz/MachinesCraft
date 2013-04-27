package lukaz.machinescraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAluminiumOre extends Block {
	
	public BlockAluminiumOre(int id) {

		super(id, Material.rock);
		
		}
	
	@Override
	public void func_94332_a(IconRegister par1IconRegister)
	{
	         this.field_94336_cN = par1IconRegister.func_94245_a("MachinesCraft:AluminiumOre");
	}

}
