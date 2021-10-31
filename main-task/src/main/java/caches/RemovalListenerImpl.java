package caches;

import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

public class RemovalListenerImpl implements RemovalListener<String, String> {
    @Override
    public void onRemoval(RemovalNotification<String, String> removalNotification) {
        System.out.println(removalNotification.getCause().name());
    }
}
