package lukaz.machinescraft.oredictionary;

import lukaz.machinescraft.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterOre
{
    public static void init()
    {
        OreDictionary.registerOre("ingotAluminium", new ItemStack(ModItems.aluminium));
    }
}
