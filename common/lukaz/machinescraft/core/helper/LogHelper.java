package lukaz.machinescraft.core.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

import lukaz.machinescraft.lib.Reference;

public class LogHelper {

    private static Logger machinescraftLogger = Logger.getLogger(Reference.MOD_ID);

    public static void init() {

        machinescraftLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        machinescraftLogger.log(logLevel, message);
    }

}
