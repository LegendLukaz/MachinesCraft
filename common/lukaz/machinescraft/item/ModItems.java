package lukaz.machinescraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import lukaz.machinescraft.lib.ItemIds;

public class ModItems
{
    // Item instance
    public static Item aluminium;

    public static void init()
    {
        aluminium = new ItemAluminium(ItemIds.ALUMINIUM);
        
        GameRegistry.addSmelting(ItemIds.ALUMINIUM, new ItemStack(aluminium, 1), 1.0F);
    }

}
