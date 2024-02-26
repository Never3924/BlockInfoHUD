package com.never3924.blockinfohud.BlockUtil;

import com.mojang.realmsclient.client.Request;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class GetBlockUtils {
    private final Level level;
    private final BlockPos blockPos;
    private final BlockEntity blockEntity;
    private final BlockState blockState;

    public GetBlockUtils(Level level, BlockPos blockPos){
        this.level = level;
        this.blockPos = blockPos;
        this.blockEntity = level.getBlockEntity(blockPos);
        this.blockState = level.getBlockState(blockPos);
    }

    public GetBlockUtils(BlockEntity blockEntity){
        this.level = blockEntity.getLevel();
        this.blockPos = blockEntity.getBlockPos();
        this.blockEntity = blockEntity;
        this.blockState = blockEntity.getBlockState();
    }

    public CompoundTag getUpdateTag(){
        this.blockState
        return this.blockEntity.getUpdateTag();
    }

    public Level getLevel() {
        return level;
    }

    public BlockPos getBlockPos() {
        return blockPos;
    }

    public BlockEntity getBlockEntity() {
        return blockEntity;
    }

    public BlockState getBlockState() {
        return blockState;
    }
}
