package wwcp.common.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.ItemIDs;
import wwcp.common.library.WWCPItems;

public class RecipesRegisterSteam extends AbstractRecipeHandler {

    public RecipesRegisterSteam(ITierCraftingManager cm)
    {
        betterAddRecipe(2, new ItemStack(ItemIDs.steelchimney.item, 1), //Christmas BR01
                new ItemStack(ItemIDs.tankcarDome.item, 1),
                null,
                new ItemStack(ItemIDs.steelcab.item, 1),
                new ItemStack(Blocks.redstone_lamp, 1),
                new ItemStack(ItemIDs.boiler.item, 2),
                new ItemStack(ItemIDs.firebox.item, 1),
                new ItemStack(ItemIDs.bogie.item, 6),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.ChristmasBR01.item), 1);

        betterAddRecipe(2, new ItemStack(ItemIDs.steelchimney.item, 1), //Christmas BR01
                new ItemStack(ItemIDs.tankcarDome.item, 1),
                null,
                new ItemStack(ItemIDs.steelcab.item, 1),
                null,
                new ItemStack(ItemIDs.boiler.item, 2),
                new ItemStack(ItemIDs.firebox.item, 1),
                new ItemStack(ItemIDs.bogie.item, 6),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.DBBR01.item), 1);

        betterAddRecipe(2, new ItemStack(ItemIDs.steelchimney.item, 1), //Christmas BR01
                new ItemStack(ItemIDs.tankcarDome.item, 1),
                null,
                new ItemStack(ItemIDs.steelcab.item, 1),
                null,
                new ItemStack(ItemIDs.boiler.item, 2),
                new ItemStack(ItemIDs.firebox.item, 1),
                new ItemStack(ItemIDs.bogie.item, 6),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.DBBR01_11.item), 1);

        betterAddRecipe(2, new ItemStack(ItemIDs.steelchimney.item, 1), //Christmas BR01
                new ItemStack(ItemIDs.tankcarDome.item, 1),
                null,
                new ItemStack(ItemIDs.steelcab.item, 1),
                null,
                new ItemStack(ItemIDs.boiler.item, 2),
                new ItemStack(ItemIDs.firebox.item, 1),
                new ItemStack(ItemIDs.bogie.item, 6),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.DBBR01_neubaukessel.item), 1);

        betterAddRecipe(2, new ItemStack(ItemIDs.steelchimney.item, 1), //Christmas BR01
                new ItemStack(ItemIDs.tankcarDome.item, 1),
                null,
                new ItemStack(ItemIDs.steelcab.item, 1),
                null,
                new ItemStack(ItemIDs.boiler.item, 2),
                new ItemStack(ItemIDs.firebox.item, 1),
                new ItemStack(ItemIDs.bogie.item, 6),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.DBBR01_henschel.item), 1);

        betterAddRecipe(1, new ItemStack(ItemIDs.steelchimney.item, 1), //DSB FII
                new ItemStack(ItemIDs.tankcarDome.item, 1),
                null,
                new ItemStack(ItemIDs.steelcab.item, 1),
                new ItemStack(Blocks.redstone_lamp, 1),
                new ItemStack(ItemIDs.boiler.item, 1),
                new ItemStack(ItemIDs.firebox.item, 1),
                new ItemStack(ItemIDs.bogie.item, 3),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.DSBFII.item), 1);

        betterAddRecipe(1, new ItemStack(WWCPItems.DSBFII.item, 1), //DSB FIII
                new ItemStack(ItemIDs.tankcarDome.item, 1),
                null,
                null,
                new ItemStack(Blocks.redstone_lamp, 1),
                new ItemStack(ItemIDs.boiler.item, 1),
                new ItemStack(ItemIDs.firebox.item, 1),
                null,
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.DSBFIII.item), 1);

        betterAddRecipe(1, null, //Tender T32 Christmas
                null,
                null,
                null,
                CoalItem(2),
                TCItemStack(WaterBucketItem, 1),
                null,
                new ItemStack(ItemIDs.bogie.item, 4),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.T32TenderChristmas.item), 1);

        betterAddRecipe(1, null, //Tender T32 Christmas
                null,
                null,
                null,
                CoalItem(2),
                TCItemStack(WaterBucketItem, 1),
                null,
                new ItemStack(ItemIDs.bogie.item, 4),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.T32Tender.item), 1);
    }

    public static void betterAddRecipe(int tier, ItemStack top1, ItemStack top2,
                                       ItemStack top3, ItemStack top4, ItemStack mid1, ItemStack mid2, ItemStack mid3,
                                       ItemStack bottom1, ItemStack bottom2, ItemStack bottom3, ItemStack output, int outputSize)
    {
        ITierCraftingManager cm = TierRecipeManager.getInstance();
        cm.addRecipe(tier, top1, bottom1, bottom2, bottom3, top2, top3, mid2, mid3, mid1, top4, output, outputSize);
    }
}
