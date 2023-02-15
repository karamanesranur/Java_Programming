package Java_Programming_Muhtar.day018_GarbageCollection;

public class TestPizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

//pizza1.size = 'L';
        pizza1.setInfo('L' , 2,3);

        Pizza pizza2 = new Pizza();

//pizza1.size = 'M';
        pizza2.setInfo('S',1,2);

        System.out.println(pizza1);
        System.out.println(pizza2);


        System.out.println("--------------------------------------");

double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('S',2,3);
            total +=small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M',0,2);
            total +=medium.calcCost();

            Pizza lage = new Pizza();
            lage.setInfo('L',2,3);
            total +=lage.calcCost();
        }

        System.out.println("total = " + total);;






    }


}
