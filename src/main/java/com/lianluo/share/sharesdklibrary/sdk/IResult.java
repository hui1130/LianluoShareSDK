package com.lianluo.share.sharesdklibrary.sdk;

import android.content.Intent;

/**
 * Created by ezy on 17/3/18.
 */

public interface IResult {
    void onResult(int requestCode, int resultCode, Intent data);
}
