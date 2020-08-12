package com.ruoyi.grokking.algorithms.queue;

public class MyCircularDeque {

    private int[] array;

    private int index;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        array = new int[k];
        index = 0;
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (index >= array.length) {
            return false;
        }
        array[index++] = value;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (index >= array.length) {
            return false;
        }
        System.arraycopy(array, 0, array, 1, index++);
        array[0] = value;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (index <= 0) {
            return false;
        }
        array[--index] = 0;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (index <= 0) {
            return false;
        }
        System.arraycopy(array, 1, array, 0, --index);
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (index <= 0) {
            return -1;
        }
        return array[index - 1];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (index <= 0) {
            return -1;
        }
        return array[0];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return index <= 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return index == array.length;
    }
}
/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */