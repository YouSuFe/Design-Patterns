package compositePattern;

import java.util.ArrayList;

public class TestPattern {
    public static void main(String[] args) {
        System.out.println("********************* Pattern Demo *********************");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu             = new DinerMenu();
        CafeMenu cafeMenu               = new CafeMenu();
        ArrayList menus                 = new ArrayList();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);
        Waitress waitress               = new Waitress(menus);
        waitress.printMenu();

    }
}
