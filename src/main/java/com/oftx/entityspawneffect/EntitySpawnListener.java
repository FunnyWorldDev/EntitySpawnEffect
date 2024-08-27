package com.oftx.entityspawneffect;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class EntitySpawnListener implements Listener {

    @EventHandler
    public void onEntitySpawn(CreatureSpawnEvent event) {
        // 获取实体生成的位置
        Location location = event.getLocation();

        // 在实体生成的位置生成“sonic_boom”粒子
        Bukkit.getScheduler().runTaskLater(EntitySpawnEffect.getPlugin(EntitySpawnEffect.class), () -> {
            location.getWorld().spawnParticle(Particle.SONIC_BOOM, location, 1);
        }, 1L);
    }
}
