public abstract class Animal {
    public Animal() {
    }
    public abstract void run(float distance);
    public abstract void swim(float distance);
    public abstract void jumpOverTheObstacle(float height);
}

public class Dog extends Animal {
    private final String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void run(float distance) {
        if (dogName.equals("Jupiter") && distance <= 500.0f && distance > 0.0f) {
            System.out.println(dogName + " run: " + true);
        } else if (dogName.equals("Pluto") && distance <= 800.0f && distance > 0.0f) {
            System.out.println(dogName + " run: " + true);
        } else {
            System.out.println(dogName + " run: " + false);
        }
    }

    @Override
    public void swim(float distance) {
        if (dogName.equals("Jupiter") && distance <= 10.0f && distance > 0.0f) {
            System.out.println(dogName + " swim: " + true);
        } else if (dogName.equals("Pluto") && distance <= 5.0f && distance > 0.0f) {
            System.out.println(dogName + " swim: " + true);
        } else {
            System.out.println(dogName + " swim: " + false);
        }
    }

    @Override
    public void jumpOverTheObstacle(float height) {
        if (height <= 0.5f || height > 0.0f) {
            System.out.println(dogName + " jump: " + true);
        } else {
            System.out.println(dogName + " jump: " + false);
        }
    }
}

public class Cat extends Animal {
    private final String catName;
    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public void run(float distance) {
        if (catName.equals("Murzik") && distance <= 200.0f && distance > 0.0f) {
            System.out.println(catName + " run: " + true);
        } else if (catName.equals("Nyan") && distance <= 130.0f && distance > 0.0f) {
            System.out.println(catName + " run: " + true);
        } else {
            System.out.println(catName + " run: " + false);
        }
    }

    @Override
    public void swim(float distance) {
        System.out.println("Cats can't swim");
    }

    @Override
    public void jumpOverTheObstacle(float height) {
        if (catName.equals("Murzik") && height <= 1.0f && height > 0.0f) {
            System.out.println(catName + " jump: " + true);
        } else if (catName.equals("Nyan") && height <= 3.0f && height > 0.0f) {
            System.out.println(catName + " jump: " + true);
        } else {
            System.out.println(catName + " jump: " + false);
        }
    }
}

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
