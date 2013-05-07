package lukaz.machinescraft.configuration;

import java.io.File;
import java.util.logging.Level;

import lukaz.machinescraft.lib.BlockIds;
import lukaz.machinescraft.lib.ItemIds;
import lukaz.machinescraft.lib.Strings;
import lukaz.machinescraft.lib.Worldgen;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler
{
    public static Configuration configuration;
    
    public static void init(File configFile) {

        configuration = new Configuration(configFile);

        try {
            configuration.load();
            
            /*block config*/
            BlockIds.MECHANIC_BLOCK = configuration.getBlock(Strings.MECHANIC_BLOCK_NAME, BlockIds.DEF_MECHANIC_BLOCK).getInt(BlockIds.DEF_MECHANIC_BLOCK);
            BlockIds.ALUMINIUM_ORE = configuration.getBlock(Strings.ALUMINIUM_ORE_NAME, BlockIds.DEF_ALUMINIUM_ORE).getInt(BlockIds.DEF_ALUMINIUM_ORE);
            
            /*items config*/
            ItemIds.ALUMINIUM = configuration.getItem(Strings.ALUMINIUM_NAME, ItemIds.DEF_ALUMINIUM).getInt(ItemIds.DEF_ALUMINIUM);
            
            /*World gen config*/
            Worldgen.ALUMINIUM_ORE_NODE = configuration.get(Configuration.CATEGORY_GENERAL, Strings.ALUMINIUM_ORE_NODE, Worldgen.DEF_ALUMINIUM_ORE_NODE).getInt(Worldgen.DEF_ALUMINIUM_ORE_NODE);
            Worldgen.ALUMINIUM_ORE_MAX_Y_LEVEL = configuration.get(Configuration.CATEGORY_GENERAL, Strings.ALUMINIUM_ORE_MAX_Y, Worldgen.DEF_ALUMINIUM_ORE_MAX_Y_LEVEL + 1).getInt();
                                   
            
            } catch (Exception e) {

            FMLLog.log(Level.SEVERE, e, "Machines Craft has problems loading configs");

            } finally {

            configuration.save();

            }
}
}
