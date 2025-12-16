package wwcp.common.recipes;

import net.minecraft.item.ItemStack;
import train.common.api.crafting.TraincraftCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.inventory.TrainCraftingManager;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;


public class RecipeHandlerWWCP extends AbstractRecipeHandler {

    public RecipeHandlerWWCP() {
        initItemRecipes();
    }


    public void initItemRecipes(){

//        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.partBlombergB.item,1),
//                "MCM", "SSS", "W W",
//                'W', new ItemStack(ItemIDs.bogie.item),
//                'S', steelItem,
//                'M', new ItemStack(ItemIDs.electmotor.item),
//                'C', new ItemStack(ItemIDs.partComponentEMD.item));
    }
}
