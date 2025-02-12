package dev.anvilcraft.skyland.integration.rg;

import dev.anvilcraft.lib.integration.Integrations;
import dev.anvilcraft.rg.api.RGAdditional;
import dev.anvilcraft.rg.api.server.TranslationUtil;
import dev.anvilcraft.skyland.integration.rg.event.RollingGateEventListener;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.common.NeoForge;

import java.util.Optional;

@Integrations("rolling_gate")
public class RollingGateIntegration {
    public void apply() {
        Optional<? extends ModContainer> skyland = ModList.get().getModContainerById("skyland");
        if (skyland.isEmpty()) return;
        ModContainer modContainer = skyland.get();
        modContainer.registerExtensionPoint(RGAdditional.class, new SkylandRGAdditional());
        NeoForge.EVENT_BUS.register(new RollingGateEventListener());
        TranslationUtil.loadLanguage(RollingGateIntegration.class, "skyland", "en_us");
    }
}
