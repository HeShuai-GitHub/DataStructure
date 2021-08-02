package com.hs.structure.stack;

import com.hs.structure.stack.linkedStorage.LinkedStack;
import com.hs.structure.stack.sqStorage.ShareSqStack;
import com.hs.structure.stack.sqStorage.SqStack;
import org.junit.Test;

/**
 * @author heshuai
 * @title: StackTest
 * @description: 栈测试
 * @date 2021年08月02日 21:42
 */
public class StackTest {

    @Test
    public void testShareSqStack() {
        ShareSqStack stack = new ShareSqStack(10);
        System.out.println("栈1是否为空：");
        System.out.println(stack.isEmpty(1));
        System.out.println("栈2是否为空：");
        System.out.println(stack.isEmpty(2));
        for (int i = 0; i < 8; i++) {
            stack.push(1, i);
        }
        stack.push(2,99);
        stack.push(2,999);
        System.out.println("栈1的长度:");
        System.out.println(stack.length(1));
        System.out.println("栈2的长度:");
        System.out.println(stack.length(2));
        System.out.println("获得栈1顶元素");
        System.out.println(stack.getTop(1));
        System.out.println("获得栈2顶元素");
        System.out.println(stack.getTop(2));
        System.out.println("打印栈1与栈2内元素");
        System.out.println(stack);
        System.out.println("弹出栈1顶元素");
        System.out.println(stack.pop(1));
        System.out.println("弹出栈2顶元素");
        System.out.println(stack.pop(2));
        stack.push(1,55);
        stack.push(2,555);
        System.out.println("清空栈1元素");
        stack.clearStack(1);
        System.out.println("栈1是否为空：");
        System.out.println(stack.isEmpty(1));
        System.out.println("栈2是否为空：");
        System.out.println(stack.isEmpty(2));
        System.out.println("打印栈1与栈2内元素");
        System.out.println(stack);
        stack.push(1, 10);
        System.out.println("打印栈1与栈2内元素");
        System.out.println(stack);
    }

    /**
     * 测试链式存储栈
     */
    @Test
    public void testLinkedStack() {
        Stack stack = new LinkedStack();
        System.out.println("是否为空：");
        System.out.println(stack.isEmpty());
        for (int i = 0; i < 50; i++) {
            stack.push(i);
        }
        System.out.println("栈的长度:");
        System.out.println(stack.length());
        System.out.println("获得栈顶元素");
        System.out.println(stack.getTop());
        System.out.println("打印栈内元素");
        System.out.println(stack);
        System.out.println("弹出栈顶元素");
        System.out.println(stack.pop());
        System.out.println("清空栈元素");
        stack.clearStack();
        System.out.println("是否为空：");
        System.out.println(stack.isEmpty());
        System.out.println("打印栈内元素");
        System.out.println(stack);
    }

    /**
     * 测试顺序存储栈
     */
    @Test
    public void testSqStack() {
        Stack stack = new SqStack();
        System.out.println("是否为空：");
        System.out.println(stack.isEmpty());
        for (int i = 0; i < 50; i++) {
            stack.push(i);
        }
        System.out.println("栈的长度:");
        System.out.println(stack.length());
        System.out.println("获得栈顶元素");
        System.out.println(stack.getTop());
        System.out.println("打印栈内元素");
        System.out.println(stack);
        System.out.println("弹出栈顶元素");
        System.out.println(stack.pop());
        System.out.println("清空栈元素");
        stack.clearStack();
        System.out.println("是否为空：");
        System.out.println(stack.isEmpty());
        System.out.println("打印栈内元素");
        System.out.println(stack);
    }

}
