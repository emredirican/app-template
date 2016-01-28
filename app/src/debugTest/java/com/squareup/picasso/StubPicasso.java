package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;

public class StubPicasso extends Picasso {
  StubPicasso(Context context) {
    super(context, new StubDispatcher(context), Cache.NONE, null, null, null, null, null, false,
        false);
  }

  public static StubPicasso init(Context context) {
    return new StubPicasso(context);
  }

  @Override
  public RequestCreator load(String path) {
    return new StubRequestCreator();
  }

  @Override
  public RequestCreator load(Uri uri) {
    return new StubRequestCreator();
  }

  @Override
  public RequestCreator load(File file) {
    return new StubRequestCreator();
  }

  @Override
  public RequestCreator load(int resourceId) {
    return new StubRequestCreator();
  }

  private static class StubRequestCreator extends RequestCreator {

    @Override
    public void into(ImageView target) {
      //stub!
    }
  }

  private static class StubDispatcher extends Dispatcher {

    StubDispatcher(Context context) {
      super(context, null, null, null, null, null);
    }
  }
}
