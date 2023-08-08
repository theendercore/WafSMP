package com.theendercore.wafsmp.commands;


import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import static com.theendercore.wafsmp.WafSMP.config;

public class MapCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        String url = config.getString("mapURL");
        if (url == null) return false;
        sender.sendMessage(Component.text("You can see the map here:").style(Style.style().color(TextColor.color(16755200)).build()).appendNewline()
                .append(Component.text(url).clickEvent(ClickEvent.clickEvent(ClickEvent.Action.OPEN_URL, url)))
        );
        return true;
    }


}
