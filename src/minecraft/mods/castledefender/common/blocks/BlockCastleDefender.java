package mods.castledefender.common.blocks;

import mods.castledefender.common.ModCastleDefender;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class BlockCastleDefender extends BlockContainer {
	
	/**
	 * Constructeur
	 * @param id
	 */
	public BlockCastleDefender (int id, Material material) {
		super(id, material);
		this.setCreativeTab(ModCastleDefender.tabsCastleDefender);
	}
	
	/**
	 * Renregistrement des textures
	 */
	@Override
	public void registerIcons(IconRegister register) {
		this.blockIcon = register.registerIcon("castledefender:" + this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".") + 1));
	}
	
	/**
	 * only called by clickMiddleMouseButton , and passed to
	 * inventory.setCurrentItem (along with isCreative)
	 */
	@Override
	public int idPicked(World var1, int var2, int var3, int var4) {
		return 0;
	}
	
	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube() {
		return false;
	}
	
}