public class Homework6 {
    public static void main(String[] args) {
        //creating dogs and cats
        Dog jupiter = new Dog("Jupiter");
        Dog pluto = new Dog("Pluto");
        Cat murzik = new Cat("Murzik");
        Cat nyan = new Cat("Nyan");

        //commands for dogs
        jupiter.run(697.4f);
        pluto.run(697.4f);
        jupiter.swim(9);
        pluto.swim(9);
        jupiter.jumpOverTheObstacle(0.265f);
        pluto.jumpOverTheObstacle(0.265f);

        System.out.println();

        //commands for cats
        murzik.run(132);
        nyan.run(132);
        murzik.swim(6);
        nyan.swim(4);
        murzik.jumpOverTheObstacle(2);
        nyan.jumpOverTheObstacle(2);


    }
}
