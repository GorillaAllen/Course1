package louis_20231130;

class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
                { "Mr. ", "Mrs. ", "Ms. " },
                { "Smith", "Jones" }
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
        System.out.println("----------------------");

        String[][] louis = names;

        // louis twoDim array
        // Mr. Smith
        System.out.println(louis[0][0] + louis[1][0]);
        // Ms. Jones
        System.out.println(louis[0][2] + louis[1][1]);
        System.out.println("----------------------");

        names[1][1] = "John wick";

        // Mr. Smith
        System.out.println(louis[0][0] + louis[1][0]);
        // Ms. John wick
        System.out.println(louis[0][2] + louis[1][1]);
        System.out.println("----------------------");

        louis[1][1] = "apple";

        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

    }
}