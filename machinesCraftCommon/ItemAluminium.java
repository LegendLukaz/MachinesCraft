package machinesCraftCommon;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemAluminium extends Item {

	 public ItemAluminium(int id) {

		 super(id);
		 }
	
	 public void func_94581_a(IconRegister iconRegister)
	 {
	          iconIndex = iconRegister.func_94245_a("MachinesCraft:Aluminium");
	 }
}
