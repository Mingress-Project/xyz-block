package Mingress.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonSideProxy {


	public World getClientWorld() {

		return null;
	}
	public void registerClientInfo(){}
	public boolean isThePlayer(EntityPlayer player)
	{
		return false;
	}

}