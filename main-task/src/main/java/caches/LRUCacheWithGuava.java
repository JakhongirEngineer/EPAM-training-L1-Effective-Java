package caches;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

public class LRUCacheWithGuava {
    private LoadingCache<String,String> cache;
    private final long MAXIMUM_SIZE = 100000;
    private final long TIME_LIMIT_ON_LAST_ACCESS_IN_SECONDS = 5;


    public LRUCacheWithGuava(){

    }

    private void buildCache(){
        this.cache = CacheBuilder.newBuilder()
                .maximumSize(MAXIMUM_SIZE)
                .expireAfterAccess(TIME_LIMIT_ON_LAST_ACCESS_IN_SECONDS, TimeUnit.SECONDS)
                .removalListener(new RemovalListenerImpl())
                .build(new CacheLoaderImpl());
    }

    public void put(String value){
        cache.put(value,value);
    }

    public String get(String key){
        return cache.getUnchecked(key);
    }

}
