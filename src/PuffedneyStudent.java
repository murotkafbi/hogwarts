public class PuffedneyStudent extends  HogwartsStudent {
    private int diligence;
    private int loyalty;
    private int honesty;

    public PuffedneyStudent(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return diligence + loyalty + honesty;
    }

    public void compareHogwarts(PuffedneyStudent puffedneyStudent) {
        int ability1 = ability();
        int ability2 = puffedneyStudent.ability();
        if (ability1 < ability2) {
            System.out.printf("Пуфендеец %s лучше,чем пуфендеец %s: %d VS %d%n", getName(), puffedneyStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуфендеец %s лучше,чем пуфендеец %s: %d VS %d%n", puffedneyStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Пуфендеец %s такой же,как пуфендеец %s: %d VS %d%n", puffedneyStudent.getName(), getName(), ability1, ability2);
        }
    }
}