package io.thedogofchaos.GregicAgrifactoryCore.unified.data;

import com.tterrag.registrate.util.entry.RegistryEntry;
import io.thedogofchaos.GregicAgrifactoryCore.block.OreCropBlock;
import io.thedogofchaos.GregicAgrifactoryCore.organic.Crop;
import io.thedogofchaos.GregicAgrifactoryCore.unified.registry.CropRegistry;


public class ModBlocks {
    public static final Crop becquerelliumCrop = ModPlants.Becquerellium; // shitty hack because of my own code.

    public static final RegistryEntry<OreCropBlock> BECQUERELLIUM_CROP = CropRegistry.makeCropBlock(becquerelliumCrop);

    public static void init() {
        becquerelliumCrop.setCropBlock(BECQUERELLIUM_CROP);
    }

}
