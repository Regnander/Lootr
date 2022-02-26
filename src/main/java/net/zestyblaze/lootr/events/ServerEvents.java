package net.zestyblaze.lootr.events;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.zestyblaze.lootr.entity.LootrChestMinecartEntity;

public class ServerEvents {
    public static MinecraftServer serverInstance;

    static {
        ServerLifecycleEvents.SERVER_STARTED.register(new ServerLifecycleEvents.ServerStarted() {
            @Override
            public void onServerStarted(MinecraftServer server) {
                serverInstance = server;
            }
        });

        ServerLifecycleEvents.SERVER_STOPPED.register(new ServerLifecycleEvents.ServerStopped() {
            @Override
            public void onServerStopped(MinecraftServer server) {
                serverInstance = null;
            }
        });
    }

    public static void load(){};
}