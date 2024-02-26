package com.never3924.blockinfohud.BlockUtil;

import com.mojang.realmsclient.client.Request;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.PushReaction;

import java.util.stream.Stream;

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

    public Block getBlock(){
        return this.blockState.getBlock();
    }

    public Stream<Property<?>> getProperties(){
        return this.blockState.getProperties().stream();
    }

    public SoundType getSoundType(){
        return this.blockState.getSoundType();
    }

    public Stream<TagKey<Block>> getTags(){
        return this.blockState.getTags();
    }

    public PushReaction getPushReaction(){
        return this.blockState.getPistonPushReaction();
    }
}
