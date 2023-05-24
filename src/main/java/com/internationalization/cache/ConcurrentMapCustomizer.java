package com.internationalization.cache;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConcurrentMapCustomizer implements CacheManagerCustomizer<ConcurrentMapCacheManager> {

	@Override
	public void customize(ConcurrentMapCacheManager cacheManager) {
		cacheManager.setAllowNullValues(false);
		cacheManager.setStoreByValue(false);
		System.out.println("customized cache");
	}

}
