package com.github.majisyou.practice_1;

import org.bukkit.plugin.java.JavaPlugin;

public final class Practice_1 extends JavaPlugin {
/*
* 以下のURLのプラクティス
* https://www.youtube.com/watch?v=yggAJmwBd-o&list=PLxTqjj5hagYi3-TRMwx9Fs7PBOw8yl1pL&index=57
*
* Step.1 開発環境を用意しよう -> IntelliJを使用
* Step.2 テスト環境を用意しよう -> Conohaサーバーを使用
* Step.3 IntelliJにいろいろなプラグインを導入しよう -> 金がかかるcopilotがあるため入れず
* Step.4 プロジェクトを作成しよう -> これ
* Step.5 mavenを理解しよう -> Gradleを使用中
* Step.6 ログを出力させるMethodを作成しよう -> sendLog()メソッド ちなみに、sendLogをMethodとして実装する必要はない
* Step.7 コンパイルしよう -> 日本語のエラーが発生
* Step.7.5 エラーを直そう　-> build.gradleに以下の項目を追加しよう
*          tasks.withType(AbstractCompile)*.options*.encoding = tasks.withType(GroovyCompile)*.groovyOptions*.encoding = 'UTF-8'
 * Step.8 テストしよう
*
* 以下のサイトも確認しよう
* --今回はなし--
* */


    @Override
    public void onEnable() {
        // Plugin startup logic
        sendLog("----PluginEnabled----");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        sendLog("----PluginDisabled----");
    }

    // Methodとして実装する必要はないが、メソッド・説明・変数を記述の仕方の演習をしよう
    /**
    * MethodName: LogSystem
    * description: コンソールにログを出力させる  */
    private void sendLog(String arg){
        this.getLogger().info(arg);
    }

}
