package com.mmnaseri.cs.clrs.ch27.s0.impl;

/**
 * @author Mohammad Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (2/27/16)
 */
public class ContextAwareParallelScheduler extends AbstractParallelScheduler {

    ContextAwareParallelScheduler() {
        super();
    }

    @Override
    protected SchedulerContext createSchedulerContext() {
        return new NestedSchedulerContext();
    }

}
