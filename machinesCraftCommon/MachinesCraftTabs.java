package machinesCraftCommon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import machinesCraftCommon.MachinesCraft;

public class MachinesCraftTabs extends CreativeTabs {
	
	public MachinesCraftTabs(int par1, String par2Str) {

        super(par1, par2Str);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
    {
        return new ItemStack(MachinesCraft.MechanicBlock); //need fix on this line
    }
	
}
