package com.github.majisyou.practice_2;

import org.bukkit.entity.Cow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Practice_2Event implements Listener {

    /**
     * これは牛を右クリックしたら爆発させるイベント
     * 変数：PlayerInteractEntityEvent event
     * 結果：void
     * */
    @EventHandler(priority = EventPriority.NORMAL)
    public void onEntityRightClick(PlayerInteractEntityEvent event){
        if(event.getRightClicked() instanceof Cow cow){
            cow.getWorld().createExplosion(cow.getLocation(),2.5F);
        }
    }
}
