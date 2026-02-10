package wwcp.common.recipes;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.ItemIDs;
import wwcp.common.library.WWCPCraftingItems;
import wwcp.common.library.WWCPItems;

import java.util.ArrayList;
import java.util.Iterator;

public class RecipesRegisterRollingStock extends AbstractRecipeHandler {

    public RecipesRegisterRollingStock(ITierCraftingManager cm) {
        Iterator var2 = this.ingotSteel.iterator();
        ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
        ArrayList<ItemStack> gold = OreDictionary.getOres("ingotGold");

        while (var2.hasNext()) {
            ItemStack k = (ItemStack) var2.next();
            Item itemSteel = k.getItem();
            int itemDamageSteel = k.getItemDamage();

            for (ItemStack dye : dyeOrange) {//EP2_Center
                betterAddRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), null, null, dye,
                        null, new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(ItemIDs.copperWireFine.item, 2),
                        null, new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(WWCPItems.EP2_Center.item), 1);
            }

            for (ItemStack dye : dyeBrown) {//Paccar64Woodchip
                betterAddRecipe(2, null, null, null, dye,
                        null, new ItemStack(Blocks.chest, 1), null,
                        new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(WWCPItems.Paccar64Woodchip.item), 1);

                betterAddRecipe(2, new ItemStack(ItemIDs.freightCarRibbing.item, 4), null, null, dye,
                        null, new ItemStack(Blocks.chest, 1), null,
                        new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(WWCPItems.Gunderson596Woodchip.item), 1);

            }

            for (ItemStack dye : dyeBrown) {//OpenTriLevelAutorack
                betterAddRecipe(2, null, null, null, dye,
                        null, new ItemStack(Blocks.chest, 1), null,
                        new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 6), new ItemStack(itemSteel, 4, itemDamageSteel), new ItemStack(WWCPItems.OpenTriLevelAutorack.item), 1);
            }

            for (ItemStack dye : dyeYellow) {//VertAPacAutorack
                betterAddRecipe(2, null, null, null, dye,
                        null, new ItemStack(Blocks.chest, 1), null,
                        new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(itemSteel, 6, itemDamageSteel), new ItemStack(WWCPItems.VertAPacAutorack.item), 1);
            }

            for (ItemStack dye : dyeBrown) {//XM4A
                betterAddRecipe(2, new ItemStack(ItemIDs.freightCarRibbing.item, 4), null, null, dye,
                        new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.boxcarDoor.item, 2), null,
                        new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(WWCPItems.XM4A.item), 1);
            }

            for (ItemStack dye : dyeBrown) {//AAR 40ft Boxcar
                betterAddRecipe(2, null, null, null, dye,
                        new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.boxcarDoor.item, 2), null,
                        new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(WWCPItems.AAR40ft.item), 1);
            }

            for (ItemStack dye : dyeWhite) {//PS2Early3Bay
                betterAddRecipe(2, new ItemStack(ItemIDs.freightCarRibbing.item, 4), null, null, dye,
                        new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.hopperBay.item, 3), null,
                        new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(WWCPItems.PS2Early3Bay.item), 1);
            }

            for (ItemStack dye : dyeYellow) {//SLRVC
                betterAddRecipe(3, null, null, null, dye,
                        null, new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(ItemIDs.copperWireFine.item, 1),
                        new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(itemSteel, 2, itemDamageSteel), new ItemStack(WWCPItems.SLRVC.item), 1);
            }
            for (ItemStack dye : dyeGreen){
                betterAddRecipe(3, null, //Hbbins
                        new ItemStack(WWCPCraftingItems.ContainerItem.item, 1),
                        new ItemStack(WWCPCraftingItems.ContainerItem.item, 1),
                        null,
                        null,
                        new ItemStack(ItemIDs.steelframe.item,2),
                        null,
                        new ItemStack(WWCPCraftingItems.SGGNSBogie.item, 2),
                        dye,
                        null,
                        new ItemStack(WWCPItems.SGNSS60.item),1);
            }

            for (ItemStack plankItem : planks) {
                betterAddRecipe(3, null, //Hbbins
                        new ItemStack(ItemIDs.boxcarDoor.item,2),
                        null,
                        null,
                        null,
                        new ItemStack(plankItem.getItem(),2),
                        null,
                        new ItemStack(WWCPCraftingItems.SGGNSBogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 2),
                        null,
                        new ItemStack(WWCPItems.Hbbins.item),1);

                betterAddRecipe(3, null, //Hbbins
                        new ItemStack(ItemIDs.boxcarDoor.item,4),
                        null,
                        null,
                        null,
                        new ItemStack(plankItem.getItem(),2),
                        null,
                        new ItemStack(WWCPCraftingItems.SGGNSBogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 2),
                        null,
                        new ItemStack(WWCPItems.Habbiins_17.item),1);

                betterAddRecipe(3, null, //Eurofima Compartment 1
                        null,
                        null,
                        null,
                        new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                        new ItemStack(plankItem.getItem(), 2),
                        null,
                        new ItemStack(WWCPCraftingItems.EurofimaBogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.EurofimaCompartment1.item), 1);

                betterAddRecipe(3, null, //Eurofima Compartment 1-2
                        null,
                        null,
                        null,
                        new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                        new ItemStack(plankItem.getItem(), 2),
                        new ItemStack(WWCPCraftingItems.clothSeats.item, 2),
                        new ItemStack(WWCPCraftingItems.EurofimaBogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.EurofimaCompartment1_2.item), 1);

                betterAddRecipe(3, null, //Eurofima Open 1
                        null,
                        null,
                        null,
                        new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                        null,
                        null,
                        new ItemStack(WWCPCraftingItems.EurofimaBogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.EurofimaOpen1.item), 1);

                betterAddRecipe(3, new ItemStack(Blocks.glass, 2), //Eurofima Panorama
                        null,
                        null,
                        null,
                        new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                        null,
                        null,
                        new ItemStack(WWCPCraftingItems.EurofimaBogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.EurofimaPanorama.item), 1);

                for (ItemStack GoldItem : gold) {

                    betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Salon 1
                            null,
                            new ItemStack(Blocks.glass, 2),
                            new ItemStack(Blocks.redstone_lamp, 1),
                            new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                            new ItemStack(plankItem.getItem(), 2),
                            new ItemStack(GoldItem.getItem(), 1),
                            new ItemStack(ItemIDs.bogie.item, 2),
                            new ItemStack(ItemIDs.steelframe.item, 1),
                            null,
                            new ItemStack(WWCPItems.RheingoldSalon1Christmas.item), 1);

                    betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Salon 1
                            null,
                            new ItemStack(Blocks.glass, 2),
                            null,
                            new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                            new ItemStack(plankItem.getItem(), 2),
                            new ItemStack(GoldItem.getItem(), 1),
                            new ItemStack(ItemIDs.bogie.item, 2),
                            new ItemStack(ItemIDs.steelframe.item, 1),
                            null,
                            new ItemStack(WWCPItems.RheingoldSalon1.item), 1);

                    betterAddRecipe(3, new ItemStack(Blocks.glass, 2), //Eurofima Panorama
                            null,
                            null,
                            new ItemStack(Items.diamond,1),
                            new ItemStack(WWCPCraftingItems.LeatherSeats.item, 2),
                            new ItemStack(Blocks.wool, 3),
                            new ItemStack(GoldItem.getItem(),2),
                            new ItemStack(WWCPCraftingItems.EurofimaBogie.item, 2),
                            new ItemStack(ItemIDs.steelframe.item, 1),
                            null,
                            new ItemStack(WWCPItems.EurofimaPresidentiale.item), 1);
                }

                betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Kitchen 1
                        null,
                        new ItemStack(Blocks.glass, 2),
                        new ItemStack(Blocks.redstone_lamp, 1),
                        new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                        new ItemStack(plankItem.getItem(), 2),
                        new ItemStack(Blocks.furnace, 1),
                        new ItemStack(ItemIDs.bogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.RheingoldSpeise1Christmas.item), 1);

                betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Kitchen 1
                        null,
                        new ItemStack(Blocks.glass, 2),
                        null,
                        new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                        new ItemStack(plankItem.getItem(), 2),
                        new ItemStack(Blocks.furnace, 1),
                        new ItemStack(ItemIDs.bogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.RheingoldKitchen1.item), 1);

                betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Salon 1
                        null,
                        new ItemStack(Blocks.glass, 2),
                        new ItemStack(Blocks.redstone_lamp, 1),
                        new ItemStack(WWCPCraftingItems.clothSeats.item, 1),
                        new ItemStack(plankItem.getItem(), 2),
                        null,
                        new ItemStack(ItemIDs.bogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.RheingoldSalon2Christmas.item), 1);

                betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Salon 1
                        null,
                        new ItemStack(Blocks.glass, 2),
                        null,
                        new ItemStack(WWCPCraftingItems.clothSeats.item, 1),
                        new ItemStack(plankItem.getItem(), 2),
                        null,
                        new ItemStack(ItemIDs.bogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.RheingoldSalon2.item), 1);

                betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Kitchen 1
                        null,
                        new ItemStack(Blocks.glass, 2),
                        new ItemStack(Blocks.redstone_lamp, 1),
                        new ItemStack(WWCPCraftingItems.clothSeats.item, 1),
                        new ItemStack(plankItem.getItem(), 2),
                        new ItemStack(Blocks.furnace, 1),
                        new ItemStack(ItemIDs.bogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.RheingoldSpeise2Christmas.item), 1);

                betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Kitchen 1
                        null,
                        new ItemStack(Blocks.glass, 2),
                        null,
                        new ItemStack(WWCPCraftingItems.clothSeats.item, 1),
                        new ItemStack(plankItem.getItem(), 2),
                        new ItemStack(Blocks.furnace, 1),
                        new ItemStack(ItemIDs.bogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.RheingoldKitchen2.item), 1);

                betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Kitchen 1
                        null,
                        new ItemStack(Blocks.glass, 2),
                        null,
                        new ItemStack(Blocks.chest, 2),
                        new ItemStack(plankItem.getItem(), 2),
                        new ItemStack(Blocks.furnace, 1),
                        new ItemStack(ItemIDs.bogie.item, 2),
                        new ItemStack(ItemIDs.steelframe.item, 1),
                        null,
                        new ItemStack(WWCPItems.RheingoldBagage.item), 1);
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
