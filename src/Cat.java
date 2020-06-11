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
