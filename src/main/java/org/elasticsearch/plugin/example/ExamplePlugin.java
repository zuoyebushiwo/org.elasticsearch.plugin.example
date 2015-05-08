package org.elasticsearch.plugin.example;

import java.util.Collection;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.AbstractPlugin;

import com.google.common.collect.Lists;

/**
 * @author ZuoYe
 * @date 2015年5月7日
 */
public class ExamplePlugin extends AbstractPlugin {
	
	public String name() {
		return "example-plugin";
	}

	public String description() {
		return "Example Plugin Description";
	}
	
	@Override
	public Collection<Class<? extends Module>> modules() {
		Collection<Class<? extends Module>> modules = Lists.newArrayList();
        modules.add(ExampleRestModule.class);
        return modules;
	}
	
}
