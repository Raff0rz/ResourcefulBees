package com.resourcefulbees.resourcefulbees.client.gui.widget;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class TabToggleImageButton extends TabImageButton {

    protected final ItemStack toggledItem;
    protected final int xDiffTex;
    protected boolean stateTriggered;

    public TabToggleImageButton(int xIn, int yIn, int widthIn, int heightIn, int xTexStartIn, int yTexStartIn, int xDiffTextIn, int yDiffTextIn, boolean stateTriggered, ResourceLocation background, ItemStack displayItem, ItemStack toggledItem, Button.IPressable onPressIn) {
        super(xIn, yIn, widthIn, heightIn, xTexStartIn, yTexStartIn, yDiffTextIn, background, displayItem, 0, 0, onPressIn);
        this.toggledItem = toggledItem;
        this.xDiffTex = xDiffTextIn;
        this.stateTriggered = stateTriggered;
    }

    public void setStateTriggered(boolean stateTriggered) { this.stateTriggered = stateTriggered; }

    public boolean isStateTriggered() { return this.stateTriggered; }

    @Override
    public void renderButton(@NotNull MatrixStack matrixStack, int p_230431_2_, int p_230431_3_, float p_230431_4_) {
        Minecraft minecraft = Minecraft.getInstance();
        minecraft.getTextureManager().bindTexture(this.resourceLocation);
        RenderSystem.disableDepthTest();
        int i = this.xTexStart;
        int j = this.yTexStart;
        if (this.stateTriggered) {
            i += this.xDiffTex;
        }

        if (this.isHovered()) {
            j += this.yDiffText;
        }

        this.drawTexture(matrixStack, this.x, this.y, i, j, this.width, this.height);
        if (this.displayItem != null && !this.stateTriggered) {
            Minecraft.getInstance().getItemRenderer().renderItemAndEffectIntoGUI(this.displayItem, this.x + 1, this.y + 1);
        } else if (toggledItem != null && this.stateTriggered) {
            Minecraft.getInstance().getItemRenderer().renderItemAndEffectIntoGUI(this.toggledItem, this.x + 1, this.y + 1);
        }
        RenderSystem.enableDepthTest();
    }
}
