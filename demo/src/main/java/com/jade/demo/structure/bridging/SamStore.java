package com.jade.demo.structure.bridging;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class SamStore extends Store{

    public SamStore(Pie pie) {
        super(pie);
    }

    @Override
    Pie makePie() {
        System.out.print("山姆大叔的小店💒");
        return pie.makePie();
    }
}
