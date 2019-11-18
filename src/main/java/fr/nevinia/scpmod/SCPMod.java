package fr.nevinia.scpmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SCPMod.MOD_ID)
public class SCPMod
{
    // la constante avec l'identifiant du mod
    public static final String MOD_ID = "scpmod";

    // le logger du mod
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    // constructeur de la classe principale, on enregistre ici nos events
    public SCPMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("SCPMod setup completed.");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("SCPMod client setup completed.");
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent event) {
        LOGGER.info("SCPMod server setup completed.");
    }
}
