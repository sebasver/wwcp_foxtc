package wwcp.common.library;

import net.minecraft.item.Item;
import train.common.library.TypeOfRollingStock;
import wwcp.common.core.handler.TypeOfRollingStockWWCP;

import static wwcp.common.core.handler.TypeOfRollingStockWWCP.*;

/**
 * Enum class for the Rolling stock item
 * DO NOT ADD OTHER ITEMS BESIDES ROLLING STOCK ITEMS HERE
 */
public enum WWCPItems
{
    WWCPShopShunter("WWCPShopShunterIcon", DIESEL, "WWCP"),
//    SD90MACH("DefaultNormal", DIESEL, "American"),
    M630("item.M630_Icon", DIESEL, "American"),
    M640("item.M640_Icon", DIESEL, "American"),
    C630M("item.C630M_Icon", DIESEL, "American"),
    SD45X("item.SD45W_Icon", DIESEL, "American"),
    RS10("item.RS10_Icon", DIESEL, "American"),
    RS18("item.RS18_Icon", DIESEL, "American"),
    RS18C("item.RS18C_Icon", DIESEL, "American"),
    C430("item.C430_Icon", DIESEL, "American"),
    C424("item.C424_Icon", DIESEL, "American"),
    C425("item.C425_Icon", DIESEL, "American"),
    GP30("item.GP30_Icon", DIESEL, "American"),
    GP35("item.GP35_Icon", DIESEL, "American"),
    SD45("item.SD45_Icon", DIESEL, "American"),
    SD70M("item.SD70M_Icon", DIESEL, "American"),
    SD75M("item.SD75M_Icon", DIESEL, "American"),
    SD75I("item.SD75I_Icon", DIESEL, "American"),
    C408W("item.C408W_Icon", DIESEL, "American"),
    SLRVC("SLRV_MID", PASSENGER,"American"),
    EurofimaOpen1("Eurofima1stOpen", PASSENGER,"European"),
    EurofimaCompartment1("Eurofima1stCompartment", PASSENGER,"European"),
    EurofimaCompartment1_2("Eurofima1st2ndCompartment", PASSENGER,"European"),
    EurofimaPanorama("EurofimaPanoramaItem", PASSENGER,"European"),
    BR103("BR103Item", ELECTRIC, "European"),
    EP2("item.EP2_Cab", ELECTRIC, "American"),
    EP2_Center("item.EP2_Center", ELECTRIC, "American"),
    EP3("item.EP3", ELECTRIC, "American"),
    ES2("item.ES2", ELECTRIC, "American"),
    EF4("item.EF4", ELECTRIC, "American"),
    SLRV("SLRV", ELECTRIC, "American"),
    F140AC1("item.BombardierTRAXXF140MS2", ELECTRIC, "European"),
    BR145("item.BR145", ELECTRIC, "European"),
    ChristmasBR01("BR01ChristmasIcon", STEAM, "WWCP"),
    T32TenderChristmas("T32TenderChristmasIcon",FREIGHT, "WWCP"),
    RheingoldSalon1Christmas("RheingoldChristmasSalon1", PASSENGER, "WWCP"),
    RheingoldSalon2Christmas("RheingoldChristmasSalon2", PASSENGER, "WWCP"),
    RheingoldSpeise1Christmas("RheingoldChristmasKitchen1", PASSENGER, "WWCP"),
    RheingoldSpeise2Christmas("RheingoldChristmasKitchen2", PASSENGER, "WWCP"),
    XM4A("item.XM4A_Icon",FREIGHT, "American"),
    AAR40ft("item.AAR40ft_Icon",FREIGHT, "American"),
    Paccar64Woodchip("item.Paccar64Woodchip_Icon",FREIGHT, "American"),
    Gunderson596Woodchip("item.Gunderson596Woodchip_Icon",FREIGHT, "American"),
    PS2Early3Bay("item.PS2Early3Bay_Icon",FREIGHT, "American"),
    OpenTriLevelAutorack("item.OpenTriLevelAutorack_Icon",FREIGHT, "American"),
    VertAPacAutorack("item.VertAPac_Icon",FREIGHT, "American"),
    Hbbins("IconHbbins",FREIGHT, "European"),
    Habbiins_17("IconHabbins",FREIGHT, "European"),
    G322("IconG322_400b",FREIGHT, "European"),
    TraxxF140MS2("TRAXXF140MS2",FREIGHT, "European"),
    ES64U2("TaurusES6U2", UNIVERSAL,"European"),
    ES64U4("TaurusES64U4", UNIVERSAL,"European"),
    MZIV("IconMzIV",FREIGHT, "European"),
    SGNSS60("SGNSS60", FREIGHT, "European")
    //minecraftTemplateUntradeable("template-icon", STEAM)
    ;


    /**
     * @param iconName
     * @param typeOfRollingStock the type of rollingstock
     * @param tabName
     * @param amountForEmerald amount for Emerald
     */
    WWCPItems(String iconName, TypeOfRollingStockWWCP typeOfRollingStock, String tabName, int amountForEmerald)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.tabName = tabName;
        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = this.name();
    }

    WWCPItems(String itemName, String iconName, TypeOfRollingStockWWCP typeOfRollingStock, String tabName, int amountForEmerald)
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
    
    WWCPItems(String iconName, TypeOfRollingStockWWCP typeOfRollingStock, String tabName)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.tabName = tabName;
        this.amountForEmerald = -1;
        ItemName = this.name();
    }

    WWCPItems(String itemName, String iconName, TypeOfRollingStockWWCP typeOfRollingStock, String tabName)
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
    public TypeOfRollingStockWWCP TypeOfRollingStock;
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
