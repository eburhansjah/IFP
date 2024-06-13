package com.example.ifp;

import android.graphics.Bitmap;
import android.graphics.Color;

public class recolorclass { //exception are handled in onClick listener

    public static Bitmap applyRecolor(Bitmap originalBitmap, int targetR, int targetG, int targetB, int newR, int newG, int newB) throws Exception {
        try {
            int width = originalBitmap.getWidth();
            int height = originalBitmap.getHeight();
            Bitmap recolorBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

            int[] pixels = new int[width * height];
            originalBitmap.getPixels(pixels, 0, width, 0, 0, width, height);

            boolean colorFound = false;

            for (int i = 0; i < pixels.length; i++) {
                int pixelColor = pixels[i];
                int R = Color.red(pixelColor);
                int G = Color.green(pixelColor);
                int B = Color.blue(pixelColor);

                if (R == targetR * 255 / 100 && G == targetG * 255 / 100 && B == targetB * 255 / 100) {
                    colorFound = true;
                    int newPixelColor = Color.rgb(
                            (int) Math.round(newR * 2.55),
                            (int) Math.round(newG * 2.55),
                            (int) Math.round(newB * 2.55)
                    );
                    pixels[i] = newPixelColor;
                }
            }

            if (!colorFound) {
                return null;
            }

            recolorBitmap.setPixels(pixels, 0, width, 0, 0, width, height);
            return recolorBitmap;
        } catch (Exception e) {
            throw new Exception("An error occurred while applying the recolor effect.", e);
        }
    }
}

