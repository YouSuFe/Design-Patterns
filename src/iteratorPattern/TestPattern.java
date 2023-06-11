package iteratorPattern;

import java.util.ArrayList;

public class TestPattern {
    public static void main(String[] args) {
        System.out.println("********************* Pattern Demo *********************");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu             = new DinerMenu();
        CafeMenu cafeMenu               = new CafeMenu();
        Waitress waitress               = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();

    }
}
