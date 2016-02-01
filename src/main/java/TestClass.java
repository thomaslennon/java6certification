public class TestClass {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        final Triangle t = new Triangle(10, 11, 5);
        System.out.println("The traingle1 is: " + t.getType());

        System.out.println("The traingle2 is: " + Triangle2.getTriangleType(10, 4, 5));

    }

    @Override
    public boolean equals(final Object obj) {
        if ((obj == null) || !(obj instanceof TestClass)) {
            return false;
        }

        return true;
    }

}
