package Mingress.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import Mingress.client.ClientSideProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MingressCore.MODID, version = MingressCore.VERSION)
public class MingressCore
{
    public static final String MODID = "mingressmod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "Mingress.client.ClientSideProxy", serverSide = "Mingress.common.CommonSideProxy")
	public static CommonSideProxy proxy;
	public static ClientSideProxy clientproxy;

	public static Block blockStateTest;
	public static final CreativeTabs tabMingress = new TabCreateHandler("MingressMod");

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	blockStateTest = new BlockStateTest();
    	GameRegistry.registerBlock(blockStateTest, "blockStateTest_name");
		// some example code
		//勝手に書き換えるなり何なりどうぞ
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
