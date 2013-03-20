package machinesCraftCommon;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Legend_Luk_MachinesCraft", name = "MachinesCraft", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MachinesCraft 
{
	@SidedProxy(clientSide = "machinesCraftCommon.ClientProxy", serverSide = "machinesCraftCommon.CommonProxy")
	public static CommonProxy proxy;
	
	//Block Declare
	public static Block MechanicBlock;
	public static Block AluminiumOre;
	
	//Item Declare
	public static Item Aluminium;
	
	//IDs
	public static int MechanicBlockBlockID;
	public static int AluminiumOreBlockID;
	public static int AluminiumItemID;
	
	//WorldGen
	public static int AluminiumOreNode;
	public static int AluminiumOreMaxY;
	
	public static CreativeTabs machinesCraftTab = new MachinesCraftTabs(CreativeTabs.getNextID(), "machinescrafttab");
	
	@PreInit
	public void preload(FMLPreInitializationEvent event)
	{
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try {

			MechanicBlockBlockID = cfg.getBlock("Mechanic Block", 3000).getInt();
			AluminiumOreBlockID = cfg.getBlock("Aluminium Ore", 3001).getInt();
			
			AluminiumItemID = cfg.getItem("Aluminium", 7000).getInt();
			
			AluminiumOreNode = cfg.get(Configuration.CATEGORY_GENERAL, "AluminiumOreNode", "6").getInt();
			AluminiumOreMaxY = cfg.get(Configuration.CATEGORY_GENERAL, "Aluminium Maxium Y-level", "55" + 1).getInt();
			
			LanguageRegistry.instance().addStringLocalization("itemGroup.machinescrafttab", "Machines Craft");
			
			MechanicBlock = new BlockMechanicBlock(MechanicBlockBlockID).setHardness(3.0F).setResistance(15.0F).setUnlocalizedName("mechanicBlock");
			MechanicBlock.setCreativeTab(this.machinesCraftTab);
			GameRegistry.registerBlock(MechanicBlock, "machinescraft_mechanicBlock");
			LanguageRegistry.addName(MechanicBlock, "Mechanic Block");
			
			Aluminium = new ItemAluminium(AluminiumItemID).setUnlocalizedName("aluminium").setMaxStackSize(64);
			LanguageRegistry.addName(MachinesCraft.Aluminium, "Aluminium Ingot");
			Aluminium.setCreativeTab(this.machinesCraftTab);
			OreDictionary.registerOre("ingotAluminium", MachinesCraft.Aluminium);
			CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(MachinesCraft.MechanicBlock), "XXX", "X X", "XXX",
					Character.valueOf('X'), "ingotAluminium"));
			
			AluminiumOre = new BlockAluminiumOre(AluminiumOreBlockID).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("aluminiumOre");
			AluminiumOre.setCreativeTab(this.machinesCraftTab);
			ItemStack AluminiumOreStack = new ItemStack(AluminiumOre);
			GameRegistry.registerBlock(AluminiumOre, "machinescraft.AluminiumOre");
			LanguageRegistry.addName(AluminiumOre, "Aluminium Ore");
			GameRegistry.registerWorldGenerator(new WorldgeneratorMachinesCraft());
			GameRegistry.addSmelting(AluminiumOre.blockID, new ItemStack(Aluminium, 1), 1.0F);
			
			} catch (Exception e) {

			FMLLog.log(Level.SEVERE, e, "Machines Craft has problems loading configs");

			} finally {

			cfg.save();

			}
	}
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		MinecraftForge.setBlockHarvestLevel(AluminiumOre, "pickaxe", 2);
	}

}
