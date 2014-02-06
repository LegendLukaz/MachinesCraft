package lukaz.machinescraft.common.block;

import java.util.List;

import lukaz.machinescraft.MachinesCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMachinesCraftOre extends Block 
{

	public static final String[] oreTypes = new String[] {"ore_Aluminium", "ore_Zinc", "ore_Rubidium", "ore_Thorium"};
	
	public BlockMachinesCraftOre() {
		
		super(Material. field_151576_e);
		this.func_149647_a(MachinesCraft.tabMachinesCraft);
		
		
		
		
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	      
	@SideOnly(Side.CLIENT)
	public void func_149651_a(IIconRegister iconRegister)
	{
	       icons = new IIcon[oreTypes.length];
	            
	       for(int i = 0; i < icons.length; i++)
	       {
	        icons[i] = iconRegister.registerIcon("machinescraft:"+oreTypes[i]);
	       }
	}
	

	@SideOnly(Side.CLIENT)
    @Override
    //TODO:                 getIcon()
    public IIcon func_149691_a(int side, int meta)
    {
            if (meta < 0 || meta >= icons.length) {
                    meta = 0;
            }

            return icons[meta];
    }
	
	@SideOnly(Side.CLIENT)
	@Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    //TODO:                getSubBlocks()
    public void func_149666_a(Item block, CreativeTabs creativeTabs, List list) 
	{
		
		for(int i = 0; i < oreTypes.length; ++i){
			list.add(new ItemStack(block, 1, i));
		}
		
	}
	

    @Override
    //TODO:		 getBlockHardness()
    public float func_149712_f(World world, int x, int y, int z)
    {

    	int meta = world.getBlockMetadata(x, y, z);
    		switch (meta)
    	       {
    	        case 0:
    	        		return 3.0F;
    	        		
    	        case 1:
    	        		return 3.0F;
    	        	
    	        case 2:
    	        		return 4.5F;
    	        	
    	        case 3:
    	        		return 5.0F;
    	        	
    	        default:
    	        		return 3.0F;
    	        }
    	}
     
    @Override
    public String getHarvestTool(int metadata)
    {
        return "pickaxe";
    }
    
    @Override
    public int getHarvestLevel(int metadata)
    {
        switch(metadata){
        
        case 0:
        	return 1;
        	
        case 1:
        	return 1;
        
        case 2:
        	return 2;
        	
        case 3:
        	return 3;
        	
        default:
        	return 1;
        }
    }
	
	

	
	@Override
    //TODO:           damageDropped()
    public int func_149692_a(int meta)
    {
            return meta;
    }

	
}
