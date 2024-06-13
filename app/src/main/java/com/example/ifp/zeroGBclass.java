package com.example.ifp;

import android.graphics.Bitmap;
import android.graphics.Color;
public class zeroGBclass { //exception are handled in onClick listener
    public static Bitmap removeGreenBlue(Bitmap originalBitmap) {

        int width = originalBitmap.getWidth();
        int height = originalBitmap.getHeight();
        Bitmap zeroedBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        int[] pixels = new int[width * height];
        originalBitmap.getPixels(pixels, 0, width, 0, 0, width, height);

        for (int i = 0; i < pixels.length; i++) {
            int red = Color.red(pixels[i]);
            int recolorPixel = Color.rgb(red, 0, 0);
            pixels[i] = recolorPixel;
        }

        zeroedBitmap.setPixels(pixels, 0, width, 0, 0, width, height);
        return zeroedBitmap;
    }
}

