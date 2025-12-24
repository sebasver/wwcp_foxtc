package wwcp.common.library;

import net.minecraft.item.Item;
import train.common.library.TypeOfRollingStock;

/**
 * Enum class for the Rolling stock item
 * DO NOT ADD OTHER ITEMS BESIDES ROLLING STOCK ITEMS HERE
 */
public enum WWCPItems
{
    WWCPShopShunter("DefaultNormal", train.common.library.TypeOfRollingStock.DIESEL, "WWCP"),
    SD90MACH("DefaultNormal", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    C630M("DefaultNormal", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    GP30("DefaultNormal", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    GP35("DefaultNormal", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    SD45("DefaultNormal", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    EurofimaOpen1("item.compartmentEurofima", train.common.library.TypeOfRollingStock.PASSENGER,"European"),
    EurofimaCompartment1("item.compartmentEurofima", train.common.library.TypeOfRollingStock.PASSENGER,"European"),
    EurofimaCompartment1_2("item.compartmentEurofima", train.common.library.TypeOfRollingStock.PASSENGER,"European"),
    EurofimaPanorama("item.compartmentEurofima", train.common.library.TypeOfRollingStock.PASSENGER,"European"),
    BR103("item.BR103", train.common.library.TypeOfRollingStock.ELECTRIC, "European"),
    EP3("item.EP3", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    ES2("item.ES2", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    EF4("item.EF4", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    SLRV("SLRV", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    F140AC1("DefaultNormal", train.common.library.TypeOfRollingStock.ELECTRIC, "European"),
    BR145("DefaultNormal", train.common.library.TypeOfRollingStock.ELECTRIC, "European"),
    ChristmasBR01("DefaultChristmas", train.common.library.TypeOfRollingStock.STEAM, "WWCP"),
    T32TenderChristmas("DefaultChristmas",train.common.library.TypeOfRollingStock.FREIGHT, "WWCP"),
    RheingoldSalon1Christmas("DefaultChristmas", train.common.library.TypeOfRollingStock.PASSENGER, "WWCP"),
    RheingoldSalon2Christmas("DefaultChristmas", train.common.library.TypeOfRollingStock.PASSENGER, "WWCP"),
    RheingoldSpeise1Christmas("DefaultChristmas", train.common.library.TypeOfRollingStock.PASSENGER, "WWCP"),
    RheingoldSpeise2Christmas("DefaultChristmas", train.common.library.TypeOfRollingStock.PASSENGER, "WWCP"),
    XM4A("DefaultNormal",train.common.library.TypeOfRollingStock.FREIGHT, "American"),
    AAR40ft("DefaultNormal",train.common.library.TypeOfRollingStock.FREIGHT, "American"),


    //minecraftTemplateUntradeable("template-icon", STEAM)
    ;


    /**
     * @param iconName
     * @param typeOfRollingStock the type of rollingstock
     * @param tabName
     * @param amountForEmerald amount for Emerald
     */
    WWCPItems(String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, String tabName, int amountForEmerald)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.tabName = tabName;
        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = this.name();
    }

    WWCPItems(String itemName, String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, String tabName, int amountForEmerald)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.tabName = tabName;
        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = itemName;
    }

    /** USED FOR ROLLINGSTOCK THAT IS NOT ALLOWED TO BE TRADED FOR
     * @param iconName
     * @param typeOfRollingStock the type of rollingstock
     * @param tabName the tab the stock should be assigend to;
     */

    WWCPItems(String iconName, TypeOfRollingStock typeOfRollingStock, String tabName)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.tabName = tabName;
        this.amountForEmerald = -1;
        ItemName = this.name();
    }

    WWCPItems(String itemName, String iconName, TypeOfRollingStock typeOfRollingStock, String tabName)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.tabName = tabName;
        this.amountForEmerald = -1;
        ItemName = itemName;
    }

    public Item item;
    public final String iconName;
    public final TypeOfRollingStock TypeOfRollingStock;
    public final String tabName;

    public final String ItemName;

    /**
     * amount for emerald. For ItemRollingStock, it is the price for one train
     */
    public byte amountForEmerald;
}
