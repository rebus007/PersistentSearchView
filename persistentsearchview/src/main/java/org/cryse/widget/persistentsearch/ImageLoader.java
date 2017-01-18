package org.cryse.widget.persistentsearch;

import android.net.Uri;
import android.widget.ImageView;

/**
 * Created by raphaelbussa on 13/01/17.
 */
public class ImageLoader {

    private static ImageLoader instance;
    private ImageLoaderInterface imageLoaderInterface;

    public static ImageLoader init(ImageLoaderInterface imageLoaderInterface) {
        if (instance == null) {
            instance = new ImageLoader();
        }
        instance.setImageLoaderInterface(imageLoaderInterface);
        return instance;
    }

    static void loadImage(Uri url, ImageView imageView) {
        if (instance == null) {
            throw new RuntimeException("ImageLoader must be implemented for use setAvatarUrl and setBackgroundUrl methods");
        }
        instance.imageLoaderInterface.loadImage(url, imageView);
    }

    private void setImageLoaderInterface(ImageLoaderInterface imageLoaderInterface) {
        this.imageLoaderInterface = imageLoaderInterface;
    }

    public interface ImageLoaderInterface {
        void loadImage(Uri url, ImageView imageView);
    }

}
