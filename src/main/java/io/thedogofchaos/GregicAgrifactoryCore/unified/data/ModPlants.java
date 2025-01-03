package io.thedogofchaos.GregicAgrifactoryCore.unified.data;

import io.thedogofchaos.GregicAgrifactoryCore.organic.Crop;
import io.thedogofchaos.GregicAgrifactoryCore.unified.data.plants.GemCrops;
import io.thedogofchaos.GregicAgrifactoryCore.unified.data.plants.MetalCrops;
import io.thedogofchaos.GregicAgrifactoryCore.unified.data.plants.MiscCrops;

public class ModPlants {
    public static Crop Gold;
    public static Crop Magnetite;
    public static Crop Becquerellium;

    public static void init() {
        MetalCrops.init();
        GemCrops.init();
        MiscCrops.init();
    }
}
