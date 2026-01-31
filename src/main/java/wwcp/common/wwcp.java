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
import wwcp.common.core.handler.WWCPEntityHandler;
import wwcp.common.creativetabs.CreativeTabAmerican;
import wwcp.common.creativetabs.CreativeTabEuropean;
import wwcp.common.creativetabs.CreativeTabWWCP;
import wwcp.common.library.AddonPackItems;
import wwcp.common.library.Info;
import wwcp.common.recipes.RecipeHandlerWWCP;
import wwcp.common.recipes.RecipesRegisterDiesel;
import wwcp.common.recipes.RecipesRegisterElectrics;
import wwcp.common.recipes.RecipesRegisterRollingStock;


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
        European = new CreativeTabEuropean(CreativeTabs.getNextID(), "WWCP Europe");
        America = new CreativeTabAmerican(CreativeTabs.getNextID(), "WWCP America");
        WWCP = new CreativeTabWWCP(CreativeTabs.getNextID(), "WWCP Special");

        AddonPackItems addonPackItems = new AddonPackItems();
        WWCPEntityHandler entityHandler = new WWCPEntityHandler();
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
        new RecipeHandlerWWCP();
        new RecipesRegisterDiesel(TierRecipeManager.getInstance());
        new RecipesRegisterElectrics(TierRecipeManager.getInstance());
        new RecipesRegisterRollingStock(TierRecipeManager.getInstance());

        addonLog.info("postInit Addon Pack -" + Info.modName);
    }
}
