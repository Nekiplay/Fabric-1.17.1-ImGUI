package hypixelcryreborn.hypixelcry.mixins;

import com.mojang.blaze3d.systems.RenderSystem;
import hypixelcryreborn.hypixelcry.imgui.impementation.ImguiLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = RenderSystem.class, remap = false)
public class TailRenderMixin {
    @Inject(at = @At("HEAD"), method="flipFrame")
    private static void runTickTail(CallbackInfo ci) {
        ImguiLoader.onFrameRender();
    }
}
