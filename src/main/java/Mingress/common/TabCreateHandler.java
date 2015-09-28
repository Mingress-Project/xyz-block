package Mingress.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabCreateHandler extends CreativeTabs{

	public TabCreateHandler(String label) {
		super(label);
	}
	@Override
	public Item getTabIconItem() {
		return new ItemStack(MingressCore.blockStateTest, 1, 0).getItem();
		//blockStateTestのブロックをtabのアイコンに使ってるので変えたいときはMingressCore.（Item型orBlock型）を
		//指定してね
	}

}
