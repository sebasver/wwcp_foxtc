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
//    SD90MACH("DefaultNormal", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    M630("item.M630_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    M640("item.M640_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    C630M("item.C630M_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    SD45X("item.SD45W_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    RS10("item.RS10_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    RS18("item.RS18_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    RS18C("item.RS18C_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    C430("item.C430_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    C424("item.C424_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    C425("item.C425_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    GP30("item.GP30_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    GP35("item.GP35_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    SD45("item.SD45_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    C408W("item.C408W_Icon", train.common.library.TypeOfRollingStock.DIESEL, "American"),
    SLRVC("SLRV_MID", train.common.library.TypeOfRollingStock.PASSENGER,"American"),
    EurofimaOpen1("item.CompartmentEurofima", train.common.library.TypeOfRollingStock.PASSENGER,"European"),
    EurofimaCompartment1("item.CompartmentEurofima", train.common.library.TypeOfRollingStock.PASSENGER,"European"),
    EurofimaCompartment1_2("item.CompartmentEurofima1_2", train.common.library.TypeOfRollingStock.PASSENGER,"European"),
    EurofimaPanorama("EurofimaPanorama", train.common.library.TypeOfRollingStock.PASSENGER,"European"),
    BR103("item.BR103", train.common.library.TypeOfRollingStock.ELECTRIC, "European"),
    EP2("item.EP2_Cab", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    EP2_Center("item.EP2_Center", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    EP3("item.EP3", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    ES2("item.ES2", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    EF4("item.EF4", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    SLRV("SLRV", train.common.library.TypeOfRollingStock.ELECTRIC, "American"),
    F140AC1("item.BombardierTRAXXF140MS2", train.common.library.TypeOfRollingStock.ELECTRIC, "European"),
    BR145("item.BR145", train.common.library.TypeOfRollingStock.ELECTRIC, "European"),
    ChristmasBR01("BR01Christmas", train.common.library.TypeOfRollingStock.STEAM, "WWCP"),
    T32TenderChristmas("T32TenderChristmas",train.common.library.TypeOfRollingStock.FREIGHT, "WWCP"),
    RheingoldSalon1Christmas("DefaultChristmas", train.common.library.TypeOfRollingStock.PASSENGER, "WWCP"),
    RheingoldSalon2Christmas("DefaultChristmas", train.common.library.TypeOfRollingStock.PASSENGER, "WWCP"),
    RheingoldSpeise1Christmas("RheingoldKitchen1st", train.common.library.TypeOfRollingStock.PASSENGER, "WWCP"),
    RheingoldSpeise2Christmas("DefaultChristmas", train.common.library.TypeOfRollingStock.PASSENGER, "WWCP"),
    XM4A("item.XM4A_Icon",train.common.library.TypeOfRollingStock.FREIGHT, "American"),
    AAR40ft("item.AAR40ft_Icon",train.common.library.TypeOfRollingStock.FREIGHT, "American"),
    Paccar64Woodchip("item.Paccar64Woodchip_Icon",train.common.library.TypeOfRollingStock.FREIGHT, "American"),
    Gunderson596Woodchip("item.Gunderson596Woodchip_Icon",train.common.library.TypeOfRollingStock.FREIGHT, "American"),
    PS2Early3Bay("item.PS2Early3Bay_Icon",train.common.library.TypeOfRollingStock.FREIGHT, "American"),
    OpenTriLevelAutorack("item.OpenTriLevelAutorack_Icon",train.common.library.TypeOfRollingStock.FREIGHT, "American"),
    VertAPacAutorack("item.VertAPac_Icon",train.common.library.TypeOfRollingStock.FREIGHT, "American"),
    Hbbins("IconHbbins",train.common.library.TypeOfRollingStock.FREIGHT, "European"),
    Habbiins_17("IconHabbins",train.common.library.TypeOfRollingStock.FREIGHT, "European"),
    G322("IconG322_400b",train.common.library.TypeOfRollingStock.FREIGHT, "European"),
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

    WWCPItems(String classMethodName, String iconName, int amountForEmerald) {
        this.className = classMethodName;
        this.iconName = iconName;
        this.amountForEmerald = amountForEmerald;
    }

    public Item item;
    public String iconName;
    public TypeOfRollingStock TypeOfRollingStock;
    public String tabName;
    public String ItemName;
    public String className;


    /**
     * @param classMethodName
     * @param iconName
     * @param typeOfRollingStock IE: STEAM, DIESEL, AND ELECTRIC
     * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
     */

    public int amountForEmerald;
}
