package Week03.BaiTap_Animal;

public class Animal_TestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion();

        lion.setAnimal("Lion");
        lion.makeNoice();
        lion.roam();

        Hippo hippo = new Hippo();

        hippo.setAnimal("Hippo");
        hippo.makeNoice();
        hippo.roam();
    }
}
