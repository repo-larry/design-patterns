package com.jade.demo.structure.bridging;

/**
 * @description:
 * @date: 2022/11/2
 **/
public class Application {
    public static void main(String[] args) {
        Store samStore = new SamStore(new ApplePie());
        Pie samStorePie = samStore.makePie();
        samStorePie.getType();

        Store jackStore = new JackStore(new CarrotPie());
        Pie jackStorePie = jackStore.makePie();
        jackStorePie.getType();
    }
}
