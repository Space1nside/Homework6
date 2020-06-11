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
