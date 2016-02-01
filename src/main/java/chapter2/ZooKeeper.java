/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package chapter2;

class Mammal {
    String name = "furry ";

    String makeNoise() {
        return "makeNoise";
    }
}

class Zebra extends Mammal {
    String name = "stripes ";

    @Override
    String makeNoise() {
        return "bray";
    }
}

public class ZooKeeper {
    public static void main(final String args[]) {
        new ZooKeeper().go();
    }

    void go() {
        final Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }
}
