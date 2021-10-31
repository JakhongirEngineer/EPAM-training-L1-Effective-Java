package caches;

import com.google.common.cache.CacheLoader;

public class CacheLoaderImpl extends CacheLoader<String, String> {

    @Override
    public String load(String value) throws Exception {
        return value.toUpperCase();
    }
}
