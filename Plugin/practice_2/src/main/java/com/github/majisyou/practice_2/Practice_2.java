package com.github.majisyou.practice_2;

import org.bukkit.plugin.java.JavaPlugin;

public final class Practice_2 extends JavaPlugin {
    /*
    * 以下のURLのPractice
    * https://www.youtube.com/watch?v=KTIf-jQRuf8&list=PLxTqjj5hagYi3-TRMwx9Fs7PBOw8yl1pL&index=58
    *
    * PluginでできることとModでできることの違い
    * Bukkit < craftBukkit < NMS(net.minecraft.Server)
    * Example:
    * Bukkit -> Player.sendMessage() interface
    * CraftBukkit -> sendMessage(){} method
    * NMS -> Packet
    * こんな感じで、Bukkitが一番シンプルだが、自由度はなく
    * NMSはパケットまで拡張できるがややこしい
    * そんなイメージ
    *
    * なんかPart1見てたｗ
    * 以下のURLのPractice
    * https://www.youtube.com/watch?v=mKM9urkXkEE&list=PLxTqjj5hagYi3-TRMwx9Fs7PBOw8yl1pL&index=56
    *
    * Eventを理解しよう
    * EventとListenerが必要
    * Sync か Asyncを考えよう
    *　
    * EventListenersにイベントを登録する必要があるよ
    *
    * @EventHandler これはイベントの優先度を示すアノテーションだよ
    *
    * Step.1 新しいクラスを作成しよう
    * Step.2 implement Listener を追加しよう
    * Step.3 イベントリスナーに登録しよう
    * Step.4 コンパイルしてテスト
    *
    * */


    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Practice_2Event(),this);
        sendLog("----PluginEnabled----");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        sendLog("----PluginDisabled----");
    }

    /**
     * MethodName: LogSystem
     * description: コンソールにログを出力させる  */
    private void sendLog(String arg){
        this.getLogger().info(arg);
    }

}
