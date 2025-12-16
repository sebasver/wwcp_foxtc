/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package wwcp.common.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wwcp.common.library.WWCPItems;

public final class CreativeTabAmerican extends CreativeTabs
{
	private final Item itemForIcon;

	public CreativeTabAmerican(int tabID, String tabName, Item tabIcon) {
		super(tabID, tabName);
		setBackgroundImageName("item_search.png");
		itemForIcon = tabIcon;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(WWCPItems.Eurofima1stClassOpen.item);
	}

	@Override
	public String getTranslatedTabLabel() {
		return super.getTabLabel();
	}

	@Override
	public Item getTabIconItem(){return WWCPItems.Eurofima1stClassOpen.item;}
}
