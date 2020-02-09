package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes ImageTypes) {

        ImageReader imageReader = null;

        if (ImageTypes == ImageTypes.BMP)
            imageReader = new BmpReader();
        else if (ImageTypes == ImageTypes.JPG)
            imageReader = new JpgReader();
        else if (ImageTypes == ImageTypes.PNG)
            imageReader = new PngReader();
        else
            throw new IllegalArgumentException();

        return imageReader;
    }
}
