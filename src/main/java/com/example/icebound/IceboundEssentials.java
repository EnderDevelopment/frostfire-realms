package com.example.icebound;

import com.mojang.brigadier.Command;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(IceboundEssentials.MOD_ID)
public final class IceboundEssentials {
    public static final String MOD_ID = "icebound_essentials";

    public IceboundEssentials() {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID)
    public static final class Commands {
        private Commands() {
        }

        @SubscribeEvent
        public static void register(RegisterCommandsEvent event) {
            event.getDispatcher().register(
                    net.minecraft.commands.Commands.literal("icebound")
                            .executes(context -> {
                                context.getSource().sendSuccess(
                                        () -> Component.literal("Icebound Essentials is installed. Use the same modpack version on the server and every player.")
                                                .withStyle(ChatFormatting.AQUA),
                                        false);
                                return Command.SINGLE_SUCCESS;
                            }));
        }
    }
}
