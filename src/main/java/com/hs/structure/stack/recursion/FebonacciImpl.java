package com.hs.structure.stack.recursion;

import org.junit.Test;

/**
 * @author heshuai
 * @title: FebonacciIpl
 * @description: TODO
 * @date 2021年08月02日 22:16
 */
public class FebonacciImpl {

    @Test
    public void testFebonacciFunction() {
        System.out.println(febonacci(13L));
    }

    private Long febonacci(Long i) {
        if (i == 0) return 0L;
        if (i == 1) return 1L;
        return febonacci(i - 1) + febonacci(i - 2);
    }

}
