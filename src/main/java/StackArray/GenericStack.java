package StackArray;

import StackArrayList.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> extends Stack<E> {
    private E[] elements;

    public GenericStack() {
    }
}
