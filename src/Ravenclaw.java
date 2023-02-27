import java.util.Arrays;

public class Ravenclaw extends Hogwarts<Ravenclaw>{
    public Ravenclaw(String studentName, int spellPower, int transgressionDist, int intelligence, int wisdom, int wit, int creativity) {
        super(studentName, Faculties.RAVENCLAW,spellPower, transgressionDist);
        this.setSkillSet(new int[]{intelligence, wisdom, wit, creativity});
    }

    @Override
    public void compareTo(Ravenclaw opponent) {
        int thisTotal = totalPower();
        int opponentTotal = opponent.totalPower();
        if (thisTotal == opponentTotal) System.out.println(getStudentName() + " такой же Когтевранец, как и " + opponent.getStudentName());
        if (thisTotal > opponentTotal) {
            System.out.println(getStudentName() + " лучший Когтевранец, чем " + opponent.getStudentName());
        } else {
            System.out.println(opponent.getStudentName() + " лучший Когтевранец, чем " + getStudentName());
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
                "\n\t\tУм: " + getSkillSet()[0] +
                "\n\t\tМудрость: " + getSkillSet()[1] +
                "\n\t\tОстроумие: " + getSkillSet()[2] +
                "\n\t\tТворчество: " + getSkillSet()[3];
    }
}
