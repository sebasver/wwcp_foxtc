package wwcp.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import wwcp.common.items.ItemWWCPCrafting;
import wwcp.common.items.ItemWWCPRollingStock;

public class AddonPackItems
{
    /**
     * Setup all items
     */
    public AddonPackItems()
    {
        loadRollingStockItems();
        registerItems();
        loadCraftingItems();
        registerCraftingItems();
    }

    private void loadRollingStockItems()
    {
        for (WWCPItems item : WWCPItems.values())
        {
            item.item = new ItemWWCPRollingStock(item.iconName, item.TypeOfRollingStock, item.tabName);
        }
    }

    private void registerItems() {
        for (WWCPItems item : WWCPItems.values()) {
            if (item.item != null) {
                item.item.setUnlocalizedName(Info.modID + ":" + item.ItemName);
                GameRegistry.registerItem(item.item, item.ItemName);
            }
        }
    }

    private void loadCraftingItems() {
        for (WWCPCraftingItems item : WWCPCraftingItems.values()) {
            item.item = new ItemWWCPCrafting(item.iconName);
        }
    }

    private void registerCraftingItems() {
        for (WWCPCraftingItems item : WWCPCraftingItems.values()) {
            if (item.item != null) {
                item.item.setUnlocalizedName(Info.modID + ":" + item.className);
                GameRegistry.registerItem(item.item, item.className);
            }
        }
    }
}
