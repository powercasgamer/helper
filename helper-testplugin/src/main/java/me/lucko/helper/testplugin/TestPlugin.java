package me.lucko.helper.testplugin;

import me.lucko.helper.Commands;
import me.lucko.helper.adventure.Text;
import me.lucko.helper.plugin.ExtendedJavaPlugin;
import net.kyori.adventure.text.Component;

public class TestPlugin extends ExtendedJavaPlugin {

    @Override
    public void enable() {
        Commands.create()
            .handler(ctx -> {
                Text.sendMessage(ctx.sender(), Component.text("Testing 123"));
                Text.sendMessage(ctx.sender(), Text.fromLegacy("&d&n&oHELLO HOW ARE YOU", '&'));
            })
            .register("test");
    }
}
