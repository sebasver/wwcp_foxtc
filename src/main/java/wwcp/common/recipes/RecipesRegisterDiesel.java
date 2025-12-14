package wwcp.common.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.ItemIDs;
import wwcp.common.library.AddonRollingStockItems;

import java.util.Iterator;

public class RecipesRegisterDiesel extends AbstractRecipeHandler
{

    public RecipesRegisterDiesel(ITierCraftingManager cm)
    {
        Iterator var2 = this.ingotSteel.iterator();

        while(var2.hasNext()) {
            ItemStack k = (ItemStack) var2.next();
            Item itemSteel = k.getItem();
            int itemDamageSteel = k.getItemDamage();

            cm.addRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), null, null, null, null,null, null,null,null,null, new ItemStack(AddonRollingStockItems.WWCPShopShunter.item, 1), 1);

        }

    }

    public static void betterAddRecipe(int tier, ItemStack top1, ItemStack top2,
                                       ItemStack top3, ItemStack top4, ItemStack mid1, ItemStack mid2, ItemStack mid3,
                                       ItemStack bottom1, ItemStack bottom2, ItemStack bottom3, ItemStack output, int outputSize) {
        ITierCraftingManager cm = TierRecipeManager.getInstance();
        cm.addRecipe(tier, top1, bottom1, bottom2, bottom3, top2, top3, mid2, mid3, mid1, top4, output, outputSize);
    }
}
