package machinesCraftCommon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMechanicBlock extends Block {
	
	public BlockMechanicBlock(int id) {

		super(id, Material.iron);
		
		}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void func_94332_a(IconRegister par1IconRegister)
    {
        field_94336_cN = par1IconRegister.func_94245_a("MachinesCraft:MechanicBlock");
    }
	
}
