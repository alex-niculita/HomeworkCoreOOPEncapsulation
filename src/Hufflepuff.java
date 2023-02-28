import java.util.Arrays;

public class Hufflepuff extends Hogwarts<Hufflepuff>{
    public Hufflepuff(String studentName, int spellPower, int transgressionDist, int diligence, int loyalty, int honesty) {
        super(studentName, Faculties.HUFFLEPUFF, spellPower, transgressionDist);
        this.setSkillSet(new int[]{diligence, loyalty, honesty});
    }

    @Override
    public void compareTo(Hufflepuff opponent) {
        int thisTotal = totalPower();
        int opponentTotal = opponent.totalPower();
        if (thisTotal == opponentTotal) System.out.println(getStudentName() + " такой же Пуффендуйец, как и " + opponent.getStudentName());
        if (thisTotal > opponentTotal) {
            System.out.println(getStudentName() + " лучший Пуффендуйец, чем " + opponent.getStudentName());
        } else {
            System.out.println(opponent.getStudentName() + " лучший Пуффендуйец, чем " + getStudentName());
        }
    }

    @Override
    protected int totalPower() {
        return Arrays.stream(this.getSkillSet()).sum();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tSpecial skills: " +
                "\n\t\tТрудолюбивость: " + getSkillSet()[0] +
                "\n\t\tВерность: " + getSkillSet()[1] +
                "\n\t\tЧестность: " + getSkillSet()[2];
    }
}
