package com.wenxiang.boilingelixir.utils;


public class ColorUtils {
    public static String intToColorCode(int color) {
        if (color < 0 || color > 0xFFFFFF) {
            throw new IllegalArgumentException("Color value must be between 0 and 16777215.");
        }

        // 使用掩码来获取RGB各通道的值
        int red = (color >> 16) & 0xFF; // 获取红色通道
        int green = (color >> 8) & 0xFF; // 获取绿色通道
        int blue = color & 0xFF; // 获取蓝色通道

        // 将每个颜色通道的值转换成两位十六进制字符串
        String redHex = String.format("%02X", red);
        String greenHex = String.format("%02X", green);
        String blueHex = String.format("%02X", blue);

        // 拼接成完整的颜色代码字符串
        return "#" + redHex + greenHex + blueHex;
    }
}
