package com.img.utils;

import com.mojang.blaze3d.vertex.Tesselator;                // Forge/Mojmap 1.21.1 下的 Tessellator :contentReference[oaicite:0]{index=0}
import com.mojang.blaze3d.vertex.BufferBuilder;             // BufferBuilder :contentReference[oaicite:1]{index=1}
import com.mojang.blaze3d.vertex.DefaultVertexFormat;       // DefaultVertexFormat :contentReference[oaicite:2]{index=2}
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.VertexFormat;
//import com.mojang.blaze3d.vertex.VertexFormat;
//import com.mojang.blaze3d.platform.BufferUploader;          // 提交渲染用的 BufferUploader :contentReference[oaicite:3]{index=3}
import com.mojang.blaze3d.vertex.PoseStack;                 // PoseStack 本体 :contentReference[oaicite:4]{index=4}
//import net.minecraft.util.math.Matrix4f;
import org.joml.Matrix4f;

/**
 * @author : IMG
 * @create : 2025/2/16
 * @description : 来自<a href="https://github.com/paulzzh/YuZuUI-GTNH/blob/master/src/main/java/com/paulzzh/yuzu/gui/RenderUtils.java">paulzzh/YuZuUI-GTNH</a>, 有部分修改
 */
public class RenderUtils {

    /**
     * 在屏幕上绘制一个 0–1 贴图坐标的矩形。
     */
    public static void blit(float x, float y, float width, float height, PoseStack poseStack) {
        Matrix4f matrix = poseStack.last().pose();
        BufferBuilder buf = Tesselator.getInstance().begin(
                VertexFormat.Mode.QUADS,
                DefaultVertexFormat.POSITION_TEX
        );

        buf.addVertex(matrix, x,         y,          0).setUv(0f, 0f);
        buf.addVertex(matrix, x,         y + height, 0).setUv(0f, 1f);
        buf.addVertex(matrix, x + width, y + height, 0).setUv(1f, 1f);
        buf.addVertex(matrix, x + width, y,          0).setUv(1f, 0f);

        BufferUploader.drawWithShader(buf.buildOrThrow());
    }
}
