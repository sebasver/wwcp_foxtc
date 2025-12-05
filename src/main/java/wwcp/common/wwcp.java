package wwcp.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wwcp.common.core.handler.AddonPackRollingStockEntityHandler;
import wwcp.common.creativetabs.CreativeTabAddonPack;
import wwcp.common.library.AddonPackItems;
import wwcp.common.library.Info;
import wwcp.common.recipes.AddonTableRecipeRegister;


@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion, dependencies = "required-after:tc")
public class wwcp
{
    /* TrainCraft instance */
    @Instance(Info.modID)
    public static wwcp instance;

    /* TrainCraft Logger */
    public static Logger addonLog = LogManager.getLogger(Info.modName);

    public static CreativeTabs Germany;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        addonLog.info("preInit Addon Pack -" + Info.modName);
        Germany = new CreativeTabAddonPack(CreativeTabs.getNextID(), "addonTabOne", Items.apple);

        AddonPackItems addonPackItems = new AddonPackItems();
        AddonPackRollingStockEntityHandler entityHandler = new AddonPackRollingStockEntityHandler();
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        addonLog.info("load Addon Pack -" + Info.modName);

        addonLog.info("Initializing recipes...");
        new AddonTableRecipeRegister();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        addonLog.info("postInit Addon Pack -" + Info.modName);
    }
}
