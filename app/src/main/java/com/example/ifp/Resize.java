package com.example.ifp;

import android.graphics.Bitmap;

public class Resize {

    public static Bitmap resizeImage(Bitmap originalBitmap, int newWidth, int newHeight) {

        // Create a new bitmap with the desired dimensions
        Bitmap resizedBitmap = Bitmap.createScaledBitmap(originalBitmap, newWidth, newHeight, true);

        // Update the ImageView with the resized bitmap
        return resizedBitmap;
    }
}

