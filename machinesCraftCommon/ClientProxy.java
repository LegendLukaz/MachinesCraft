package machinesCraftCommon;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy 
{
	@Override
    public void registerRenderThings()
    {
		MinecraftForgeClient.preloadTexture("/MachinesCraft/Blocks.png");
		MinecraftForgeClient.preloadTexture("/MachinesCraft/Items.png");
    }
}
