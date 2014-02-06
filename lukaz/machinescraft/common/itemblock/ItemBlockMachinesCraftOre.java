package lukaz.machinescraft.common.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMachinesCraftOre extends ItemBlock {

	public static final String[] oreTypes = new String[] {"ore_Aluminium", "ore_Zinc", "ore_Rubidium", "ore_Thorium"};
	
	public ItemBlockMachinesCraftOre(Block block) {
		super(block);
		this.setMaxDamage(0);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int meta)
	{
		return meta;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) 
	{
		int meta = itemstack.getItemDamage();

		if (meta < 0 || meta >= oreTypes.length) 
		{
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + oreTypes[meta];
	}
}
