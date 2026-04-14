package wwcp.common.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.inventory.TrainCraftingManager;
import train.common.library.ItemIDs;
import wwcp.common.library.WWCPCraftingItems;

import static net.minecraft.init.Blocks.wool;
import static net.minecraft.init.Items.leather;

public class RecipeHandlerWWCP extends AbstractRecipeHandler {

    public RecipeHandlerWWCP()
    {
        initItemRecipes();
    }

    public void initItemRecipes()
    {

        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.DBComponent.item, 2),
                " C ", "CRC", " C ",
                'R', Items.redstone,
                'C', RED_DYE);

        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.DBBogies.item, 2),
                "MCM", "S S", "W W",
                'W', new ItemStack(ItemIDs.bogie.item),
                'S', SteelIngotItem,
                'M', new ItemStack(ItemIDs.electmotor.item),
                'C', Items.redstone);


        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.OBBComponent.item, 2),
                " C ", "CRC", " C ",
                'R', WHITE_DYE,
                'C', RED_DYE);


        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.TraxxComponent.item, 2),
                " C ", "CRC", " C ",
                'R', Items.redstone,
                'C', CYAN_DYE);

        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.DBBogies.item, 2),
                "MCM", "S S", "W W",
                'W', new ItemStack(ItemIDs.bogie.item),
                'S', SteelIngotItem,
                'M', new ItemStack(ItemIDs.electmotor.item),
                'C', Items.redstone);


        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.EurofimaBogie.item, 2),
                " B ", "SSS", "A A",
                'A', new ItemStack(ItemIDs.bogie.item),
                'S', SteelIngotItem,
                'B', ORANGE_DYE);


        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.SGGNSBogie.item, 2),
                " C ", "SSS", "W W",
                'W', new ItemStack(ItemIDs.bogie.item),
                'S', SteelIngotItem,
                'C', CYAN_DYE);


        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.ContainerItem.item, 4),
                "SSS", "SCS", "SSS",
                'S', SteelIngotItem,
                'C', GRAY_DYE);


        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.WWCPToken.item, 6),
                "   ", "WWW", "SSS",
                'S', BLUE_DYE,
                'W', PURPLE_DYE);


        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.LeatherSeats.item, 2),
                "  C", " CC", " RR",
                'R', getAnyPlankType(1),
                'C', new ItemStack(leather));

        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.clothSeats.item, 2),
                "  C", " CC", " RR",
                'R', getAnyPlankType(1),
                'C', new ItemStack(wool));

        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.PangeaToken.item, 2),
                " C ", "CRC", " C ",
                'R', GoldIngotItem,
                'C', YELLOW_DYE);

        TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.Fan.item, 2),
                " C ", "CRC", " C ",
                'R', new ItemStack(ItemIDs.electronicCircuit.item),
                'C', new ItemStack(ItemIDs.propeller.item));
    }
}
