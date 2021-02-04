package com.otter.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OtterWizard extends EntityMob {

    private static final DataParameter<Boolean> ATTACKING = EntityDataManager.<Boolean>createKey(EntityGhast.class, DataSerializers.BOOLEAN);

	public OtterWizard(World worldIn) {
		super(worldIn);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
	}
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 1.0d));
        this.targetTasks.addTask(1, new EntityAIFindEntityNearestPlayer(this));
        this.tasks.addTask(2, new OtterWizard.AIFireballAttack(this));
	}
	 protected void entityInit()
	    {
	        super.entityInit();
	        this.dataManager.register(ATTACKING, Boolean.valueOf(false));
	    }
	  @SideOnly(Side.CLIENT)
	    public boolean isAttacking()
	    {
	        return ((Boolean)this.dataManager.get(ATTACKING)).booleanValue();
	    }

	    public void setAttacking(boolean attacking)
	    {
	        this.dataManager.set(ATTACKING, Boolean.valueOf(attacking));
	    }

    static class AIFireballAttack extends EntityAIBase
        {
            private final OtterWizard parentEntity;
            public int attackTimer;

            public AIFireballAttack(OtterWizard wiz)
            {
                this.parentEntity = wiz;
            }

            public boolean shouldExecute()
            {
                return this.parentEntity.getAttackTarget() != null;
            }

            public void startExecuting()
            {
                this.attackTimer = 0;
            }

            public void resetTask()
            {
                this.parentEntity.setAttacking(false);
            }

            public void updateTask()
            {
                EntityLivingBase entitylivingbase = this.parentEntity.getAttackTarget();
                double d0 = 64.0D;

                if (entitylivingbase.getDistanceSq(this.parentEntity) < 4096.0D && this.parentEntity.canEntityBeSeen(entitylivingbase))
                {
                    World world = this.parentEntity.world;
                    ++this.attackTimer;

                    if (this.attackTimer == 10)
                    {
                        world.playEvent((EntityPlayer)null, 1015, new BlockPos(this.parentEntity), 0);
                    }

                    if (this.attackTimer == 20)
                    {
                        double d1 = 4.0D;
                        Vec3d vec3d = this.parentEntity.getLook(1.0F);
                        double d2 = entitylivingbase.posX - (this.parentEntity.posX + vec3d.x * 4.0D);
                        double d3 = entitylivingbase.getEntityBoundingBox().minY + (double)(entitylivingbase.height / 2.0F) - (0.5D + this.parentEntity.posY + (double)(this.parentEntity.height / 2.0F));
                        double d4 = entitylivingbase.posZ - (this.parentEntity.posZ + vec3d.z * 4.0D);
                        world.playEvent((EntityPlayer)null, 1016, new BlockPos(this.parentEntity), 0);
                        EntityLargeFireball entitylargefireball = new EntityLargeFireball(world, this.parentEntity, d2, d3, d4);
                        entitylargefireball.explosionPower = 1;
                        entitylargefireball.posX = this.parentEntity.posX + vec3d.x * 4.0D;
                        entitylargefireball.posY = this.parentEntity.posY + (double)(this.parentEntity.height / 2.0F) + 0.5D;
                        entitylargefireball.posZ = this.parentEntity.posZ + vec3d.z * 4.0D;
                        world.spawnEntity(entitylargefireball);
                        this.attackTimer = -40;
                    }
                }
                else if (this.attackTimer > 0)
                {
                    --this.attackTimer;
                }

                this.parentEntity.setAttacking(this.attackTimer > 10);
            }
        }

}