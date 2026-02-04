package wwcp.common.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.crafting.TraincraftCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.inventory.TrainCraftingManager;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;
import wwcp.common.library.WWCPCraftingItems;
import wwcp.common.library.WWCPItems;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.init.Items.leather;

public class RecipeHandlerWWCP extends AbstractRecipeHandler {

    public RecipeHandlerWWCP() {
        initItemRecipes();
    }

    private static ArrayList<ItemStack> multiNameOreDict(String... names) {
        ArrayList<ItemStack> entries = new ArrayList<ItemStack>();
        for (String name : names) {
            entries.addAll(OreDictionary.getOres(name));
        }
        return entries;
    }


    public void initItemRecipes() {
        ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");//doesnt work with mekanism steel
        ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
        ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
        ArrayList<ItemStack> logs = OreDictionary.getOres("logWood");
        ArrayList<ItemStack> plastics = multiNameOreDict("itemPlastic", "dustPlastic");//dustPlastic for MFR support
        ArrayList<ItemStack> copper = OreDictionary.getOres("ingotCopper");
        ArrayList<ItemStack> dustCoal = OreDictionary.getOres("dustCoal");
        List<ItemStack> coal = new ArrayList<ItemStack>();
        coal.add(new ItemStack(Items.coal));
        coal.addAll(OreDictionary.getOres("coal"));
        ArrayList<ItemStack> redstone = OreDictionary.getOres("dustRedstone");
        ArrayList<ItemStack> waterbucket = waterContainers();

        ArrayList<ItemStack> dyeRed = OreDictionary.getOres("dyeRed");
        ArrayList<ItemStack> dyeYellow = OreDictionary.getOres("dyeYellow");
        ArrayList<ItemStack> dyeOrange = OreDictionary.getOres("dyeOrange");
        ArrayList<ItemStack> dyeGreen = OreDictionary.getOres("dyeGreen");
        ArrayList<ItemStack> dyeBlue = OreDictionary.getOres("dyeBlue");
        ArrayList<ItemStack> dyeBrown = OreDictionary.getOres("dyeBrown");
        ArrayList<ItemStack> dyeGray = OreDictionary.getOres("dyeGray");
        ArrayList<ItemStack> dyeLightGray = OreDictionary.getOres("dyeLightGray");
        ArrayList<ItemStack> dyeBlack = OreDictionary.getOres("dyeBlack");
        ArrayList<ItemStack> dyeWhite = OreDictionary.getOres("dyeWhite");
        ArrayList<ItemStack> dyeMagenta = OreDictionary.getOres("dyeMagenta");
        ArrayList<ItemStack> dyeLime = OreDictionary.getOres("dyeLime");
        ArrayList<ItemStack> dyeLightBlue = OreDictionary.getOres("dyeLightBlue");
        ArrayList<ItemStack> dyePurple = OreDictionary.getOres("dyePurple");
        ArrayList<ItemStack> dyePink = OreDictionary.getOres("dyePink");
        ArrayList<ItemStack> dyeCyan = OreDictionary.getOres("dyeCyan");

        for (ItemStack steelItem : steel) {
            for (ItemStack redstoneItem : redstone) {
                for (ItemStack dyeRedItem : dyeRed) {
                    TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.DBComponent.item, 2),
                            " C ", "CRC", " C ",
                            'R', redstoneItem,
                            'C', dyeRedItem);

                    TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.DBBogies.item, 2),
                            "MCM", "S S", "W W",
                            'W', new ItemStack(ItemIDs.bogie.item),
                            'S', steelItem,
                            'M', new ItemStack(ItemIDs.electmotor.item),
                            'C', redstoneItem);
                }
                for (ItemStack cyanItem : dyeCyan){
                    TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.TraxxComponent.item, 2),
                            " C ", "CRC", " C ",
                            'R', redstoneItem,
                            'C', cyanItem);
                }
            }
        }
        for (ItemStack plankItem : planks){
            TrainCraftingManager.instance.addRecipe(new ItemStack(WWCPCraftingItems.LeatherSeats.item, 2),
                    "  C", "CCC", "R R",
                    'R', plankItem,
                    'C', new ItemStack(leather));
        }
    }
}
