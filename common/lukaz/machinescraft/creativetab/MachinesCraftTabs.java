package lukaz.machinescraft.creativetab;

import lukaz.machinescraft.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MachinesCraftTabs extends CreativeTabs {
	
	public MachinesCraftTabs(int par1, String par2Str) {

        super(par1, par2Str);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
    {
        return new ItemStack(ModBlocks.mechanicBlock);
    }
	
}
