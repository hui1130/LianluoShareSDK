package com.lianluo.share.sharesdklibrary.share.image.resource;

import android.graphics.Bitmap;

import java.io.File;

import com.lianluo.share.sharesdklibrary.share.image.ImageTool;

public class FileResource implements ImageResource {
    public final File file;

    public FileResource(File file) {
        this.file = file;
    }

    @Override
    public String toUri() {
        return file.toString();
    }

    @Override
    public Bitmap toBitmap() {
        return ImageTool.toBitmap(file);
    }

    @Override
    public byte[] toBytes() {
        return ImageTool.toBytes(ImageTool.toBitmap(file), Bitmap.CompressFormat.JPEG);
    }

}