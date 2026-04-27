package wwcp.common.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.ItemIDs;
import wwcp.common.library.WWCPCraftingItems;
import wwcp.common.library.WWCPItems;

import java.util.Iterator;

public class RecipesRegisterDiesel extends AbstractRecipeHandler
{

    public RecipesRegisterDiesel(ITierCraftingManager cm)
    {
        //F7A
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 1), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.steelcab.item, 1), BLACK_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.F7A.item), 1);

        //GP30
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), BLACK_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 3), new ItemStack(WWCPItems.GP30.item), 1);


        //GP35
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), WHITE_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 3), new ItemStack(WWCPItems.GP35.item), 1);


        //GP60M
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 4), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), WHITE_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4),
                new ItemStack(ItemIDs.partBlombergB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 3), new ItemStack(WWCPItems.GP60M.item), 1);

            for (ItemStack dye : dyeRed) {//SD45
                betterAddRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), dye,
                        new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 3),

        //SD45
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), RED_DYE,
                new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.SD45.item), 1);

        //SD45X
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentEMD.item, 4), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), RED_DYE,
                new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 4),
                new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.SD45X.item), 1);

        //C430
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), RED_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.bogie.item, 4), new ItemStack(ItemIDs.steelframe.item, 3), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.C430.item), 1);

        //C630M
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), RED_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.C630M.item), 1);

        //M630
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), RED_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.M630.item), 1);

        //M640
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 4), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), RED_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4),
                new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 6), new ItemStack(WWCPItems.M640.item), 1);

        //C424
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), YELLOW_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.C424.item), 1);

        //C425
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), GREEN_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 3), new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.C425.item), 1);

        //RS10
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 1), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), GREEN_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2),
                new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 4), new ItemStack(WWCPItems.RS10.item), 1);

        //RS18
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), GREEN_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2),
                new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 4), new ItemStack(WWCPItems.RS18.item), 1);

        //RS18C
        betterAddRecipe(2, new ItemStack(ItemIDs.partComponentALCO.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), GREEN_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 2), new ItemStack(ItemIDs.dieselengine.item, 2),
                new ItemStack(ItemIDs.partTypeB.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.RS18C.item), 1);

        //C408W
        betterAddRecipe(3, new ItemStack(ItemIDs.partComponentGE.item, 3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), WHITE_DYE,
                new ItemStack(ItemIDs.controls.item, 1), new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.dieselengine.item, 4),
                new ItemStack(ItemIDs.partFlexicoil.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 4), new ItemStack(WWCPItems.C408W.item), 1);

        //SD70M
        betterAddRecipe(3, new ItemStack(ItemIDs.partComponentEMD.item, 3), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), BLACK_DYE,
                new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 4),
                new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.SD70M.item), 1);

        //SD75M
        betterAddRecipe(3, new ItemStack(ItemIDs.partComponentEMD.item, 4), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), WHITE_DYE,
                new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 4),
                new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.SD75M.item), 1);

        //SD75I
        betterAddRecipe(3, new ItemStack(ItemIDs.partComponentEMD.item, 4), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), WHITE_DYE,
                new ItemStack(ItemIDs.generator.item, 4), new ItemStack(ItemIDs.electmotor.item, 6), new ItemStack(ItemIDs.dieselengine.item, 4),
                new ItemStack(ItemIDs.bogie.item, 6), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.SD75I.item), 1);

        //BR215
        betterAddRecipe(2, new ItemStack(WWCPCraftingItems.Fan.item, 2), new ItemStack(ItemIDs.partTurboExhaust.item, 4), new ItemStack(ItemIDs.steelcab.item, 2), RED_DYE,
                new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1),
                new ItemStack(ItemIDs.transmition.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.BR215.item), 1);

        //DSB MH
        betterAddRecipe(2, new ItemStack(WWCPCraftingItems.Fan.item, 1), new ItemStack(ItemIDs.partTurboExhaust.item, 1), new ItemStack(ItemIDs.steelcab.item, 1), GREEN_DYE,
                new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.generator.item, 1), new ItemStack(ItemIDs.dieselengine.item, 1),
                new ItemStack(ItemIDs.transmition.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.DSBMH.item), 1);

        //BR218
        betterAddRecipe(2, new ItemStack(WWCPItems.BR217.item), null, new ItemStack(ItemIDs.ironChimney.item, 2), RED_DYE,
                null, new ItemStack(ItemIDs.generator.item, 2), null,
                null, new ItemStack(ItemIDs.electmotor.item, 2), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.BR218.item), 1);


        betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 1), //G322
                null,
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                null,
                new ItemStack(ItemIDs.transmition.item, 2),
                new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.bogie.item, 2),
                new ItemStack(ItemIDs.steelframe.item, 1),
                TCItemStack(SteelIngotItem, 2),
                new ItemStack(WWCPItems.G322.item), 1);

        betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 1), //Shopshunter
                new ItemStack(ItemIDs.partTurboExhaust.item, 1),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                null,
                new ItemStack(ItemIDs.transmition.item, 2),
                new ItemStack(ItemIDs.dieselengine.item, 3),
                new ItemStack(ItemIDs.bogie.item, 2),
                new ItemStack(ItemIDs.steelframe.item, 1),
                TCItemStack(SteelIngotItem, 2),
                new ItemStack(WWCPItems.WWCPShopShunter.item), 1);

            betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), //MZIV
                    null,
                    new ItemStack(ItemIDs.steelcab.item, 2),
                    new ItemStack(WWCPCraftingItems.Fan.item, 5),
                    new ItemStack(ItemIDs.electmotor.item, 2),
                    new ItemStack(ItemIDs.partTurboExhaust.item, 3),
                    new ItemStack(ItemIDs.dieselengine.item, 3),
                    new ItemStack(ItemIDs.bogie.item, 6),
                    new ItemStack(ItemIDs.steelframe.item, 3),
                    TCItemStack(SteelIngotItem, 2),
                    new ItemStack(WWCPItems.MZIV.item), 1);

            betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), //MZIII
                    null,
                    new ItemStack(ItemIDs.steelcab.item, 2),
                    new ItemStack(WWCPCraftingItems.Fan.item, 3),
                    new ItemStack(ItemIDs.boiler.item, 1),
                    new ItemStack(ItemIDs.partTurboExhaust.item, 2),
                    new ItemStack(ItemIDs.dieselengine.item, 2),
                    new ItemStack(ItemIDs.bogie.item, 6),
                    new ItemStack(ItemIDs.steelframe.item, 2),
                    TCItemStack(SteelIngotItem, 2),
                    new ItemStack(WWCPItems.MZIII.item), 1);

            betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), //MZI
                    null,
                    new ItemStack(ItemIDs.steelcab.item, 2),
                    new ItemStack(WWCPCraftingItems.Fan.item, 3),
                    new ItemStack(ItemIDs.partComponentEMD.item, 1),
                    new ItemStack(ItemIDs.partTurboExhaust.item, 1),
                    new ItemStack(ItemIDs.dieselengine.item, 1),
                    new ItemStack(ItemIDs.bogie.item, 6),
                    new ItemStack(ItemIDs.steelframe.item, 2),
                    new ItemStack(ItemIDs.boiler.item, 1),
                    new ItemStack(WWCPItems.MZI.item), 1);

            betterAddRecipe(3, new ItemStack(WWCPItems.MZI.item ,1), //MZII
                    null,
                    new ItemStack(ItemIDs.partAlternator.item, 2),
                    new ItemStack(ItemIDs.partComponentEMD.item, 2),
                    new ItemStack(ItemIDs.boiler.item, 1),
                    new ItemStack(ItemIDs.electmotor.item),
                    null,
                    TCItemStack(SteelIngotItem, 2),
                    null,
                    null,
                    new ItemStack(WWCPItems.MZII.item), 1);

            betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), //Class ME
                    null,
                    new ItemStack(ItemIDs.steelcab.item, 2),
                    new ItemStack(WWCPCraftingItems.Fan.item, 3),
                    new ItemStack(ItemIDs.electmotor.item, 2),
                    new ItemStack(ItemIDs.partTurboExhaust.item, 2),
                    new ItemStack(ItemIDs.dieselengine.item, 2),
                    new ItemStack(ItemIDs.bogie.item, 6),
                    new ItemStack(ItemIDs.steelframe.item, 2),
                    new ItemStack(ItemIDs.partAlternator.item, 2),
                    new ItemStack(WWCPItems.ME.item), 1);
        }
    }


    public static void betterAddRecipe(int tier, ItemStack top1, ItemStack top2,
                                       ItemStack top3, ItemStack top4, ItemStack mid1, ItemStack mid2, ItemStack mid3,
                                       ItemStack bottom1, ItemStack bottom2, ItemStack bottom3, ItemStack output, int outputSize)
    {
        ITierCraftingManager cm = TierRecipeManager.getInstance();
        cm.addRecipe(tier, top1, bottom1, bottom2, bottom3, top2, top3, mid2, mid3, mid1, top4, output, outputSize);
    }
}
