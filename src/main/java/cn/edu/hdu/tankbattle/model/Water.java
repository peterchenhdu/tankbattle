/*
 * Copyright (c) 2011-2025 PiChen.
 */

package cn.edu.hdu.tankbattle.model;

/**
 * Water...
 *
 * @author chenpi
 * @since 2011-02-10 19:29
 */
public class Water extends Stuff {
    /**
     * 构造方法
     *
     * @param x x坐标
     * @param y y坐标
     */

    public Water(int x, int y) {
        super(x, y);
        this.setType(WATER);
        this.setWidth(20);
        this.setHeight(20);
    }

}
