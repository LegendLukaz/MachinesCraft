package lukaz.machinescraft.item;

import lukaz.machinescraft.Machinescraft;
import lukaz.machinescraft.lib.Strings;

public class ItemAluminium extends ItemMachinescraft
{

    public ItemAluminium(int id) {

        super(id);
        this.setUnlocalizedName(Strings.ALUMINIUM_NAME);
        this.setCreativeTab(Machinescraft.machinesCraftTab);
        maxStackSize = 64;
    }

}
