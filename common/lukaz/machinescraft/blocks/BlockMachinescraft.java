package lukaz.machinescraft.blocks;

import lukaz.machinescraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class BlockMachinescraft extends Block
{
    public BlockMachinescraft(int id, Material material) {

        super(id, material);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void func_94332_a(IconRegister par1IconRegister)
    {
        field_94336_cN = par1IconRegister.func_94245_a(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName());
    }
}
