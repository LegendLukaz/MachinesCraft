package lukaz.machinescraft.common.helper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabsMachinesCraft extends CreativeTabs {
	
	 public CreativeTabsMachinesCraft(int position, String tabID)
     {
             super(position, tabID);
     }

	 @Override
     //TODO: public ItemStack getIconItemStack()
     public ItemStack func_151244_d() 
     {
             return new ItemStack(MachinesCraftBlockHelper.get("machinescraftore"), 1, 0);
     }

     @Override
     public Item getTabIconItem() 
     {
             return null;
     }

}
