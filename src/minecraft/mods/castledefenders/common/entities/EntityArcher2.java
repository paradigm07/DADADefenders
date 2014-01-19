package mods.castledefenders.common.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.IMob;
import net.minecraft.world.World;

public class EntityArcher2 extends EntityArcher {

	public EntityArcher2(World world) {
		super(world);
	}
	
	/**
	 * @return Zone de detection du mod
	 */
	public double getFollowRange () { return 40.D; }
	/**
	 * @return Vitesse du mod
	 */
	public double getMoveSpeed () { return 0.0D; }
	/**
	 * @return Point de vie du mod
	 */
	public double getHealt () { return 30.0D; }
	/**
	 * @return Point de vie du mod
	 */
	public int getAttackStrength () { return 7; }
	
}
