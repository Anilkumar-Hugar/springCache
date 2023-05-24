package com.internationalization.cache;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheClass {
	@Bean
	public ConcurrentMapCustomizer cacheManager() {
		return new ConcurrentMapCustomizer();
	}
}
