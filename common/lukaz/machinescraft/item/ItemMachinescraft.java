package lukaz.machinescraft.item;

import lukaz.machinescraft.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMachinescraft extends Item
{
    public ItemMachinescraft(int id) {

        super(id - Reference.SHIFTED_ID_RANGE_CORRECTION);
        maxStackSize = 1;
        setNoRepair();
    }
    
    public void func_94581_a(IconRegister iconRegister)
    {
        iconIndex = iconRegister.func_94245_a(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName());
    }
}
