package wwcp.common.library;

import net.minecraft.item.Item;
import train.common.library.TypeOfRollingStock;

/**
 * Enum class for the Rolling stock item
 * DO NOT ADD OTHER ITEMS BESIDES ROLLING STOCK ITEMS HERE
 */
public enum WWCPCraftingItems
{
    DBComponent("ItemDB", "partComponentDB", 1),
    DBBogies("ItemDBBogies","TraxxBogie", 1),
    TraxxComponent("TRAXXComponent", "partTRAXX",1),
    EurofimaBogie("EurofimaBogie","EurofimaBogie",1),
    LeatherSeats("LeatherSeats","LeatherSeats",1)
    ;

    WWCPCraftingItems(String classMethodName, String iconName, int amountForEmerald) {
        this.className = classMethodName;
        this.iconName = iconName;
        this.amountForEmerald = amountForEmerald;
    }

    public Item item;
    public final String iconName;
    public final String className;
    public int amountForEmerald;

    /**
     * @param classMethodName
     * @param iconName
     * @param typeOfRollingStock IE: STEAM, DIESEL, AND ELECTRIC
     * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
     */


}
