package chapter2;

class Alpha {
    static String s = " ";

    protected Alpha() {
        s += "alpha ";
    }
}

class SubAlpha extends Alpha {
    protected SubAlpha() {
        s += "sub ";
    }
}

public class SubSubAlpha extends SubAlpha {

    private SubSubAlpha() {
        s += "subsub ";
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        new SubSubAlpha();
        System.out.println(s);

    }

}
