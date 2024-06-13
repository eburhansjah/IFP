package com.example.ifp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

public class grayscaleclass {
    public static Bitmap applyGrayscale(Bitmap originalBitmap) { //exception are handled in onClick listener

        if (originalBitmap == null) {
            return null;
        }

        Bitmap grayscaleBitmap = Bitmap.createBitmap(originalBitmap.getWidth(), originalBitmap.getHeight(), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(grayscaleBitmap);

        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        paint.setColorFilter(colorMatrixColorFilter);

        canvas.drawBitmap(originalBitmap, 0, 0, paint);

        return grayscaleBitmap;
    }
}

