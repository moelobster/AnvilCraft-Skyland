package dev.anvilcraft.skyland.client;

import dev.anvilcraft.skyland.Skyland;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = Skyland.MOD_ID, dist = Dist.CLIENT)
public class SkylandClient {
    public SkylandClient() {
        Skyland.INTEGRATION_MANAGER.compileContent();
        Skyland.INTEGRATION_MANAGER.loadAllClientIntegrations();
    }
}
