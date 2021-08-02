package com.hs.structure.stack.sqStorage;

import com.hs.structure.stack.Stack;

import java.util.Arrays;

/**
 * @author heshuai
 * @title: SqStack
 * @description: 使用顺序存储实现栈
 * @date 2021年08月02日 20:24
 */
public class SqStack implements Stack {

    private int[] data;

    private int top;

    public SqStack() {
        init();
    }

    @Override
    public void clearStack() {
        init();
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int getTop() {
        return data[top];
    }

    @Override
    public void push(int e) {
        dynamicCapacity();
        data[top + 1] = e;
        top++;
    }

    @Override
    public int pop() {
        if (top == -1) {
            throw new ArrayIndexOutOfBoundsException("stack Out of Boundary...");
        }
        int e = data[top];
        top--;
        dynamicCapacity();
        return e;
    }

    @Override
    public int length() {
        return top + 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    /**
     * 动态调整数组大小，若线性表的length达到数组空间上限，则扩容一倍；
     * 若线性表的length达到数组的容量的四分之一，则释放一半的数组空间
     */
    private  void dynamicCapacity() {
        // 扩容
        if (length() == data.length) {
            int[] data_old = data;
            // 对数组空间进行扩容
            int[] data_new = new int[data.length * 2];
            // 只需要对线性表的有效长度copy到新数组中即可
            for (int i = 0; i < length(); i++) {
                data_new[i] = data_old[i];
            }
            data = data_new;
        }
        // 释放
        if (length() == data.length/4) {
            int[] data_old = data;
            // 对数组空间进行释放
            int[] data_new = new int[data.length / 2];
            // 只需要对线性表的有效长度copy到新数组中即可
            for (int i = 0; i < length(); i++) {
                data_new[i] = data_old[i];
            }
            data = data_new;
        }
    }

    private void init() {
        top = -1;
        data = new int[2];
    }
}
