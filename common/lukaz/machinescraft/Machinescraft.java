package lukaz.machinescraft;

import java.io.File;

import lukaz.machinescraft.blocks.ModBlocks;
import lukaz.machinescraft.configuration.ConfigurationHandler;
import lukaz.machinescraft.core.handlers.LocalizationHandler;
import lukaz.machinescraft.core.helper.LogHelper;
import lukaz.machinescraft.creativetab.MachinesCraftTabs;
import lukaz.machinescraft.item.ModItems;
import lukaz.machinescraft.lib.Reference;
import lukaz.machinescraft.oredictionary.RegisterOre;
import lukaz.machinescraft.worldgen.WorldgeneratorMachinesCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod ( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION ) 
public class Machinescraft
{
    public static CreativeTabs machinesCraftTab = new MachinesCraftTabs(CreativeTabs.getNextID(), Reference.MOD_ID.toLowerCase());
    
    @PreInit
    public void preload(FMLPreInitializationEvent event)
    {
        //initialize of Log Helper
        LogHelper.init();
        
        //localization handler
        LocalizationHandler.loadLanguages();
        
        //init config
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        
        //Initialize mod items
        ModItems.init();
        
     // Initialize mod blocks
        ModBlocks.init();
        
        //Oredictionary init
        RegisterOre.init();
                
        //World Gen Register
        GameRegistry.registerWorldGenerator(new WorldgeneratorMachinesCraft());
        
        
    }
    
    @Init
    public void load(FMLInitializationEvent event) 
    {
        MinecraftForge.setBlockHarvestLevel(ModBlocks.aluminiumOre, "pickaxe", 2);
    }

}


