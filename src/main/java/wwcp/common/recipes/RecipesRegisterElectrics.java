package wwcp.common.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.ItemIDs;
import wwcp.common.library.WWCPItems;

import java.util.Iterator;

public class RecipesRegisterElectrics extends AbstractRecipeHandler
{

    public RecipesRegisterElectrics(ITierCraftingManager cm)
    {
        Iterator var2 = this.ingotSteel.iterator();

        while(var2.hasNext()) {
            ItemStack k = (ItemStack) var2.next();
            Item itemSteel = k.getItem();
            int itemDamageSteel = k.getItemDamage();

            for (ItemStack dye : dyeOrange) {//EP3
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.ironBogie.item, 12), new ItemStack(ItemIDs.steelframe.item, 6), new ItemStack(itemSteel, 10, itemDamageSteel), new ItemStack(ItemIDs.pantograph.item, 2), new ItemStack(ItemIDs.partComponentGE.item, 2), new ItemStack(ItemIDs.transformer.item, 6), new ItemStack(ItemIDs.copperWireFine.item, 8), new ItemStack(ItemIDs.controls.item, 2), dye, new ItemStack(WWCPItems.EP3.item, 1), 1);
            }
            for (ItemStack dye : dyeOrange) {//ES2
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(ItemIDs.pantograph.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 1), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.copperWireFine.item, 4), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(WWCPItems.ES2.item, 1), 1);
            }
            for (ItemStack dye : dyeOrange) {//EF4
                cm.addRecipe(3, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.ironBogie.item, 12), new ItemStack(ItemIDs.steelframe.item, 6), new ItemStack(itemSteel, 10, itemDamageSteel), new ItemStack(ItemIDs.pantograph.item, 2), new ItemStack(ItemIDs.partComponentGE.item, 4), new ItemStack(ItemIDs.transformer.item, 6), new ItemStack(ItemIDs.copperWireFine.item, 8), new ItemStack(ItemIDs.controls.item, 1), dye, new ItemStack(WWCPItems.EF4.item, 1), 1);
            }

        }

    }

    public static void betterAddRecipe(int tier, ItemStack top1, ItemStack top2,
                                       ItemStack top3, ItemStack top4, ItemStack mid1, ItemStack mid2, ItemStack mid3,
                                       ItemStack bottom1, ItemStack bottom2, ItemStack bottom3, ItemStack output, int outputSize) {
        ITierCraftingManager cm = TierRecipeManager.getInstance();
        cm.addRecipe(tier, top1, bottom1, bottom2, bottom3, top2, top3, mid2, mid3, mid1, top4, output, outputSize);
    }
}
