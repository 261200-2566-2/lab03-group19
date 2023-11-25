// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1 : Character Construction");
        character c1 = new character("Tutu");
        c1.checkStatus();
        character c2 = new character("Pompom");
        c2.checkStatus();
        c2.upCharacterOneLv();
        c2.checkStatus();
        c2.upCharacterOneLv();
        c2.upCharacterOneLv();
        c2.checkStatus();

        System.out.println("\n\n\n\n\nTest 2 : Sword");
        sword s1 = new sword();
        sword.checkSwordStatus(s1);
        sword s2 = new sword("Boss of the Gym's Collar");
        sword.checkSwordStatus(s2);
        s2.upSwordOneLv();
        s2.upSwordOneLv();
        s2.upSwordOneLv();
        sword.checkSwordStatus(s2);

        System.out.println("\n\n\n\n\nTest 3 : Shield");
        shields b1 = new shields();
        shields.checkShieldStatus(b1);
        shields b2 = new shields("Eight Direction Barrier");
        shields.checkShieldStatus(b2);
        b2.upShieldOneLv();
        b2.upShieldOneLv();
        b2.upShieldOneLv();
        shields.checkShieldStatus(b2);

        System.out.println("\n\n\n\n\nTest 4 : Sword & Shield / Add & Drop");
        c2.swordDrop();
        c2.swordAdd(s2);
        c2.swordDrop();
        c2.swordAdd(s2);
        c2.swordAdd(s1);
        c2.swordAdd(s2);
        System.out.println();
        c2.shieldDrop();
        c2.shieldAdd(b2);
        c2.shieldDrop();
        c2.shieldAdd(b2);
        c2.shieldAdd(b1);
        c2.shieldAdd(b2);
        System.out.println("\n\nOK! Let's check Pompom's status now");
        c2.checkStatus();

        System.out.println("\n\n\n\n\nTest 5 : Damage Calculate");
        System.out.println();
        System.out.println("Tutu VS Pompom");
        c1.checkStatus();
        c2.checkStatus();
        c1.attack(c2);
        c2.checkStatus();
        sword s3 = new sword("Bombastic Side Eyes");
        s3.upSwordOneLv();
        s3.upSwordOneLv();
        s3.upSwordOneLv();
        c1.swordAdd(s3);
        c1.checkStatus();
        c1.attack(c2);
        c2.checkStatus();
        c2.attack(c1);
        c2.attack(c1);
        c1.attack(c2);
    }
}