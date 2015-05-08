package org.elasticsearch.plugin.example;

import org.elasticsearch.common.inject.AbstractModule;

/**
 * @author ZuoYe
 * @date 2015年5月7日
 */
public class ExampleRestModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(HelloRestHandler.class).asEagerSingleton();
	}

}
