package com.vuclip.ubs.subscription_service;

import java.util.HashMap;
import java.util.Map;

public enum BlockTypeEnum {

    NONE, BLACKLIST, COOLDOWN;

    private static Map<String, BlockTypeEnum> blockTypeEnumMap = new HashMap<>();

    static {
        for (BlockTypeEnum blockTypeEnum : BlockTypeEnum.values()) {
            blockTypeEnumMap.put(blockTypeEnum.name(), blockTypeEnum);
        }
    }

    public static boolean isValidBlockType(String blockTypeEnum) {
        return (blockTypeEnumMap.get(blockTypeEnum) != null && !BlockTypeEnum.NONE.equals(blockTypeEnumMap.get(blockTypeEnum)));
    }

    public static BlockTypeEnum getBlockType(String blockType) {
        return blockTypeEnumMap.get(blockType);
    }
}