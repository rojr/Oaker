package com.gmail.robmadeyou;

import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;

/**
 * Created by apex on 13/08/14.
 */
public abstract class Task<C extends ClientContext> extends ClientAccessor<C> {

	public Task(C arg0) {
		super(arg0);
	}

	public abstract boolean activate();

	public abstract void execute();
}
