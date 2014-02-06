package lukaz.machinescraft;

import lukaz.machinescraft.common.core.MACBlock;
import lukaz.machinescraft.CommonProxy;
import lukaz.machinescraft.ClientProxy;
import lukaz.machinescraft.common.tileentity.MACTileEntity;
import lukaz.machinescraft.common.worldgen.MACWorldGen;
import lukaz.machinescraft.common.helper.CreativeTabsMachinesCraft;
import lukaz.machinescraft.common.itemblock.ItemBlockMachinesCraftOre;
import lukaz.machinescraft.common.oredict.MACOredict;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MachinesCraft.MODID, version = MachinesCraft.VERSION)

public class MachinesCraft
{
	@Instance("MachinesCraft")
    public static MachinesCraft instance;
    
    public static CommonProxy   proxy;
    
    public static CreativeTabs  tabMachinesCraft;
	
    public static final String 	MODID = "lukaz_machinescraft";
    public static final String 	VERSION = "1.7.2-1.0";
    public static Block 		oreMachinesCraft;
    public static String 		configPath;
    
    MACWorldGen worldgen = new MACWorldGen();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	
    	configPath = event.getModConfigurationDirectory() + "/machinescraft/";
    	tabMachinesCraft = new CreativeTabsMachinesCraft(CreativeTabs.getNextID(), "tabMachinesCraft");
    	
    	
    	MACBlock.init();
    	GameRegistry.registerWorldGenerator(worldgen, 2);
    	MACOredict.init();
    	
    	
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	   	
    	
    }
}
