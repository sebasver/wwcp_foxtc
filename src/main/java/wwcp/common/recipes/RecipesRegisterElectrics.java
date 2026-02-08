package wwcp.common.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.ItemIDs;
import wwcp.common.library.WWCPCraftingItems;
import wwcp.common.library.WWCPItems;

import java.util.Iterator;

public class RecipesRegisterElectrics extends AbstractRecipeHandler {

    public RecipesRegisterElectrics(ITierCraftingManager cm) {
        Iterator var2 = this.ingotSteel.iterator();

        while (var2.hasNext()) {
            ItemStack k = (ItemStack) var2.next();
            Item itemSteel = k.getItem();
            int itemDamageSteel = k.getItemDamage();

            for (ItemStack dye : dyeOrange) {//EP3
                betterAddRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.pantograph.item, 2), new ItemStack(ItemIDs.partComponentGE.item, 3), dye,
                        new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.copperWireFine.item, 8),
                        new ItemStack(ItemIDs.ironBogie.item, 12), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 12, itemDamageSteel), new ItemStack(WWCPItems.EP3.item), 1);
            }
            for (ItemStack dye : dyeOrange) {//ES2
                betterAddRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.pantograph.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 1), dye,
                        new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.copperWireFine.item, 2),
                        new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(WWCPItems.ES2.item), 1);
            }
            for (ItemStack dye : dyeOrange) {//EF4
                betterAddRecipe(2, new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.pantograph.item, 2), new ItemStack(ItemIDs.partComponentGE.item, 4), dye,
                        new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.copperWireFine.item, 6),
                        new ItemStack(ItemIDs.ironBogie.item, 12), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 10, itemDamageSteel), new ItemStack(WWCPItems.EF4.item), 1);
            }
            for (ItemStack dye : dyeOrange) {//EP2
                betterAddRecipe(2, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.pantograph.item, 1), new ItemStack(ItemIDs.partComponentGE.item, 2), dye,
                        new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.copperWireFine.item, 3),
                        new ItemStack(ItemIDs.ironBogie.item, 9), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 5, itemDamageSteel), new ItemStack(WWCPItems.EP2.item), 1);
            }
            for (ItemStack dye : dyeYellow) {//SLRV
                betterAddRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), new ItemStack(ItemIDs.pantograph.item, 1), null, dye,
                        new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.transformer.item, 2), new ItemStack(ItemIDs.copperWireFine.item, 3),
                        new ItemStack(ItemIDs.ironBogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(WWCPItems.SLRV.item), 1);
            }

            betterAddRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), //BR103
                    new ItemStack(ItemIDs.pantograph.item, 1),
                    new ItemStack(WWCPCraftingItems.DBComponent.item, 1),
                    null,
                    new ItemStack(ItemIDs.controls.item, 1),
                    new ItemStack(ItemIDs.transformer.item, 2),
                    new ItemStack(ItemIDs.copperWireFine.item, 2),
                    new ItemStack(WWCPCraftingItems.DBBogies.item, 2),
                    new ItemStack(ItemIDs.steelframe.item, 1),
                    new ItemStack(itemSteel, 4, itemDamageSteel),
                    new ItemStack(WWCPItems.BR103.item), 1);

            betterAddRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), //BR145
                    new ItemStack(ItemIDs.pantograph.item, 1),
                    new ItemStack(WWCPCraftingItems.DBComponent.item, 1),
                    null,
                    new ItemStack(ItemIDs.controls.item, 1),
                    new ItemStack(ItemIDs.transformer.item, 2),
                    new ItemStack(ItemIDs.copperWireFine.item, 3),
                    new ItemStack(WWCPCraftingItems.DBBogies.item, 2),
                    new ItemStack(ItemIDs.steelframe.item, 1),
                    new ItemStack(itemSteel, 4, itemDamageSteel),
                    new ItemStack(WWCPItems.BR145.item), 1);

            betterAddRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), //TRAXXF140AC1
                    new ItemStack(ItemIDs.pantograph.item, 1),
                    new ItemStack(WWCPCraftingItems.TraxxComponent.item, 1),
                    null,
                    new ItemStack(ItemIDs.controls.item, 1),
                    new ItemStack(ItemIDs.transformer.item, 2),
                    new ItemStack(ItemIDs.copperWireFine.item, 3),
                    new ItemStack(ItemIDs.bogie.item, 2),
                    new ItemStack(ItemIDs.steelframe.item, 1),
                    new ItemStack(itemSteel, 4, itemDamageSteel),
                    new ItemStack(WWCPItems.F140AC1.item), 1);

            betterAddRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), //TRAXXF140MS2
                    new ItemStack(ItemIDs.pantograph.item, 2),
                    new ItemStack(WWCPCraftingItems.TraxxComponent.item, 1),
                    null,
                    new ItemStack(ItemIDs.controls.item, 1),
                    new ItemStack(ItemIDs.transformer.item, 2),
                    new ItemStack(ItemIDs.copperWireFine.item, 3),
                    new ItemStack(ItemIDs.bogie.item, 2),
                    new ItemStack(ItemIDs.steelframe.item, 1),
                    new ItemStack(itemSteel, 4, itemDamageSteel),
                    new ItemStack(WWCPItems.TraxxF140MS2.item), 1);

            betterAddRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), //Taurus ES64U2
                    new ItemStack(ItemIDs.pantograph.item, 1),
                    new ItemStack(WWCPCraftingItems.OBBComponent.item, 1),
                    null,
                    new ItemStack(ItemIDs.controls.item, 1),
                    new ItemStack(ItemIDs.transformer.item, 2),
                    new ItemStack(ItemIDs.copperWireFine.item, 3),
                    new ItemStack(ItemIDs.bogie.item, 2),
                    new ItemStack(ItemIDs.steelframe.item, 1),
                    new ItemStack(itemSteel, 4, itemDamageSteel),
                    new ItemStack(WWCPItems.ES64U2.item), 1);

        }
    }

    public static void betterAddRecipe(int tier, ItemStack top1, ItemStack top2,
                                       ItemStack top3, ItemStack top4, ItemStack mid1, ItemStack mid2, ItemStack mid3,
                                       ItemStack bottom1, ItemStack bottom2, ItemStack bottom3, ItemStack output, int outputSize) {
        ITierCraftingManager cm = TierRecipeManager.getInstance();
        cm.addRecipe(tier, top1, bottom1, bottom2, bottom3, top2, top3, mid2, mid3, mid1, top4, output, outputSize);
    }
}
