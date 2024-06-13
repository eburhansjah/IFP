package com.example.ifp;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class Rotate {

    public static Bitmap rotateBitmap(Bitmap originalBitmap, float mAngleRotate) {

        // Create a matrix and apply the rotation
        Matrix matrix = new Matrix();
        matrix.postRotate(mAngleRotate);

        // Create a rotated bitmap
        Bitmap rotatedBitmap = Bitmap.createBitmap(originalBitmap, 0, 0, originalBitmap.getWidth(), originalBitmap.getHeight(), matrix, true);
        // Set the rotated bitmap to the image view
        return rotatedBitmap;
        }
}

