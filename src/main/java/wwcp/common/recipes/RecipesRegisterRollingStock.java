package wwcp.common.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.ItemIDs;
import wwcp.common.library.WWCPCraftingItems;
import wwcp.common.library.WWCPItems;

public class RecipesRegisterRollingStock extends AbstractRecipeHandler {

    public RecipesRegisterRollingStock(ITierCraftingManager cm)
    {


        //EP2_Center
        betterAddRecipe(3, new ItemStack(ItemIDs.steelcab.item, 1), null, null, ORANGE_DYE,
                null, new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(ItemIDs.copperWireFine.item, 2),
                null, new ItemStack(ItemIDs.steelframe.item, 1), TCItemStack(SteelIngotItem, 4), new ItemStack(WWCPItems.EP2_Center.item), 1);


        //Paccar64Woodchip
        betterAddRecipe(2, null, null, null, BROWN_DYE,
                null, new ItemStack(Blocks.chest, 1), null,
                new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 6), new ItemStack(WWCPItems.Paccar64Woodchip.item), 1);

        betterAddRecipe(2, new ItemStack(ItemIDs.freightCarRibbing.item, 4), null, null, BROWN_DYE,
                null, new ItemStack(Blocks.chest, 1), null,
                new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 4), new ItemStack(WWCPItems.Gunderson596Woodchip.item), 1);


        //OpenTriLevelAutorack
        betterAddRecipe(2, null, null, null, BROWN_DYE,
                null, new ItemStack(Blocks.chest, 1), null,
                new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 6), TCItemStack(SteelIngotItem, 4), new ItemStack(WWCPItems.OpenTriLevelAutorack.item), 1);


        //VertAPacAutorack
        betterAddRecipe(2, null, null, null, YELLOW_DYE,
                null, new ItemStack(Blocks.chest, 1), null,
                new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), TCItemStack(SteelIngotItem, 6), new ItemStack(WWCPItems.VertAPacAutorack.item), 1);


        //XM4A
        betterAddRecipe(2, new ItemStack(ItemIDs.freightCarRibbing.item, 4), null, null, BROWN_DYE,
                new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.boxcarDoor.item, 2), null,
                new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.XM4A.item), 1);


        //AAR 40ft Boxcar
        betterAddRecipe(2, null, null, null, BROWN_DYE,
                new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.boxcarDoor.item, 2), null,
                new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.AAR40ft.item), 1);


        //PS2Early3Bay
        betterAddRecipe(2, new ItemStack(ItemIDs.freightCarRibbing.item, 4), null, null, WHITE_DYE,
                new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.hopperBay.item, 3), null,
                new ItemStack(ItemIDs.freightCarTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.PS2Early3Bay.item), 1);


        //SLRVC
        betterAddRecipe(3, null, null, null, YELLOW_DYE,
                null, new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(ItemIDs.copperWireFine.item, 1),
                new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), TCItemStack(SteelIngotItem, 2), new ItemStack(WWCPItems.SLRVC.item), 1);


        //GS Van
        betterAddRecipe(2, getAnyPlankType(3), getAnyPlankType(3), getAnyPlankType(3), getAnyPlankType(1),
                new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.boxcarDoor.item, 2), null,
                new ItemStack(ItemIDs.bogie.item, 1), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(ItemIDs.bogie.item, 1), new ItemStack(WWCPItems.GS.item), 1);


        //DSB E
        betterAddRecipe(2, null, null, null,
                new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.boxcarDoor.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), BROWN_DYE,
                new ItemStack(ItemIDs.bogie.item, 1), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(ItemIDs.bogie.item, 1), new ItemStack(WWCPItems.DSBE.item), 1);


        //DSB ZE
        betterAddRecipe(2, null, new ItemStack(ItemIDs.tankcarDome.item, 1), null,
                new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.boiler.item, 1), new ItemStack(ItemIDs.steelframe.item, 1), WHITE_DYE,
                new ItemStack(ItemIDs.bogie.item, 1), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(ItemIDs.bogie.item, 1), new ItemStack(WWCPItems.DSBZE.item), 1);


        //DSB 735
        betterAddRecipe(2, null, new ItemStack(ItemIDs.tankcarDome.item, 2), null,
                new ItemStack(Blocks.chest, 1), new ItemStack(ItemIDs.boiler.item, 2), new ItemStack(ItemIDs.steelframe.item, 1), GRAY_DYE,
                new ItemStack(ItemIDs.bogie.item, 1), new ItemStack(ItemIDs.steelframe.item, 1), new ItemStack(ItemIDs.bogie.item, 1), new ItemStack(WWCPItems.DSB735.item), 1);


        betterAddRecipe(3, null, //Hbbins
                new ItemStack(WWCPCraftingItems.ContainerItem.item, 1),
                new ItemStack(WWCPCraftingItems.ContainerItem.item, 1),
                null,
                null,
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPCraftingItems.SGGNSBogie.item, 2),
                GREEN_DYE,
                null,
                new ItemStack(WWCPItems.SGNSS60.item), 1);


        betterAddRecipe(3, null, //Hbbins
                new ItemStack(ItemIDs.boxcarDoor.item, 2),
                null,
                null,
                null,
                getAnyPlankType(2),
                null,
                new ItemStack(ItemIDs.bogie.item, 2),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.Hbbins.item), 1);

        betterAddRecipe(3, null, //Hbbillns
                new ItemStack(ItemIDs.boxcarDoor.item, 4),
                null,
                null,
                null,
                getAnyPlankType(2),
                null,
                new ItemStack(ItemIDs.bogie.item, 2),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.Hbbillns.item), 1);

        betterAddRecipe(3, null, //Habbiins-17
                new ItemStack(ItemIDs.boxcarDoor.item, 4),
                null,
                null,
                null,
                getAnyPlankType(2),
                null,
                new ItemStack(WWCPCraftingItems.SGGNSBogie.item, 2),
                new ItemStack(ItemIDs.steelframe.item, 2),
                null,
                new ItemStack(WWCPItems.Habbiins_17.item), 1);

        betterAddRecipe(3, null, //Eurofima Compartment 1
                null,
                null,
                null,
                new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                getAnyPlankType(2),
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
                getAnyPlankType(2),
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


        betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Salon 1
                null,
                new ItemStack(Blocks.glass, 2),
                new ItemStack(Blocks.redstone_lamp, 1),
                new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                getAnyPlankType(2),
                TCItemStack(GoldIngotItem, 1),
                new ItemStack(ItemIDs.bogie.item, 2),
                new ItemStack(ItemIDs.steelframe.item, 1),
                null,
                new ItemStack(WWCPItems.RheingoldSalon1Christmas.item), 1);

        betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Salon 1
                null,
                new ItemStack(Blocks.glass, 2),
                null,
                new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                getAnyPlankType(2),
                TCItemStack(GoldIngotItem, 1),
                new ItemStack(ItemIDs.bogie.item, 2),
                new ItemStack(ItemIDs.steelframe.item, 1),
                null,
                new ItemStack(WWCPItems.RheingoldSalon1.item), 1);

        betterAddRecipe(3, new ItemStack(Blocks.glass, 2), //Eurofima Panorama
                null,
                null,
                new ItemStack(Items.diamond, 1),
                new ItemStack(WWCPCraftingItems.LeatherSeats.item, 2),
                new ItemStack(Blocks.wool, 3),
                TCItemStack(GoldIngotItem, 2),
                new ItemStack(WWCPCraftingItems.EurofimaBogie.item, 2),
                new ItemStack(ItemIDs.steelframe.item, 1),
                null,
                new ItemStack(WWCPItems.EurofimaPresidentiale.item), 1);


        betterAddRecipe(2, new ItemStack(Blocks.glass, 2), //Rheingold Christmas Kitchen 1
                null,
                new ItemStack(Blocks.glass, 2),
                new ItemStack(Blocks.redstone_lamp, 1),
                new ItemStack(WWCPCraftingItems.LeatherSeats.item, 1),
                getAnyPlankType(2),
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
                getAnyPlankType(2),
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
                getAnyPlankType(2),
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
                getAnyPlankType(2),
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
                getAnyPlankType(2),
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
                getAnyPlankType(2),
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
                getAnyPlankType(2),
                new ItemStack(Blocks.furnace, 1),
                new ItemStack(ItemIDs.bogie.item, 2),
                new ItemStack(ItemIDs.steelframe.item, 1),
                null,
                new ItemStack(WWCPItems.RheingoldBagage.item), 1);


    }


    public static void betterAddRecipe(int tier, ItemStack top1, ItemStack top2,
                                       ItemStack top3, ItemStack top4, ItemStack mid1, ItemStack mid2, ItemStack mid3,
                                       ItemStack bottom1, ItemStack bottom2, ItemStack bottom3, ItemStack output, int outputSize)
    {
        ITierCraftingManager cm = TierRecipeManager.getInstance();
        cm.addRecipe(tier, top1, bottom1, bottom2, bottom3, top2, top3, mid2, mid3, mid1, top4, output, outputSize);
    }
}
