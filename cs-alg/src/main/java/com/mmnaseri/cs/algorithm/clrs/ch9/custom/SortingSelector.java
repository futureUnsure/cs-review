package com.mmnaseri.cs.algorithm.clrs.ch9.custom;

import com.mmnaseri.cs.algorithm.clrs.ch9.Selector;
import com.mmnaseri.cs.algorithm.common.Sorter;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (7/11/15, 6:12 PM)
 */
public class SortingSelector<E extends Comparable<E>> implements Selector<E> {

    private final Sorter<E> sorter;

    public SortingSelector(Sorter<E> sorter) {
        this.sorter = sorter;
    }

    @SafeVarargs
    @Override
    public final E select(int order, E... items) {
        if (items.length == 0) {
            return null;
        }
        sorter.sort(items);
        return items[Math.max(0, Math.min(order, items.length - 1))];
    }

}