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
import train.common.core.handlers.RecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.recipes.rollingstock.SteamRecipes;
import wwcp.common.core.handler.AddonPackRollingStockEntityHandler;
import wwcp.common.creativetabs.CreativeTabAddonPack;
import wwcp.common.library.AddonPackItems;
import wwcp.common.library.Info;
import wwcp.common.recipes.RecipesRegisterDiesel;


@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion, dependencies = "required-after:tc")
public class wwcp
{
    /* TrainCraft instance */
    @Instance(Info.modID)
    public static wwcp instance;

    /* TrainCraft Logger */
    public static Logger addonLog = LogManager.getLogger(Info.modName);

    public static CreativeTabs European, America, WWCP;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        addonLog.info("preInit Addon Pack -" + Info.modName);
        European = new CreativeTabAddonPack(CreativeTabs.getNextID(), "WWCP Europe", Items.boat);
        America = new CreativeTabAddonPack(CreativeTabs.getNextID(), "WWCP America", Items.diamond);
        WWCP = new CreativeTabAddonPack(CreativeTabs.getNextID(), "WWCP Special", Items.diamond_boots);

        AddonPackItems addonPackItems = new AddonPackItems();
        AddonPackRollingStockEntityHandler entityHandler = new AddonPackRollingStockEntityHandler();
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        addonLog.info("load Addon Pack -" + Info.modName);


    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        addonLog.info("Initializing recipes...");
        new RecipeHandler();
        new RecipesRegisterDiesel(TierRecipeManager.getInstance());

        addonLog.info("postInit Addon Pack -" + Info.modName);
    }
}
