import java.util.Arrays;

public class Slytherin extends Hogwarts<Slytherin>{
    public Slytherin(String studentName, int spellPower, int transgressionDist, int cunning, int determination, int ambitiousness, int resourcefulness, int conceit) {
        super(studentName, Faculties.SLYTHERIN,spellPower, transgressionDist);
        this.setSkillSet(new int[]{cunning, determination, ambitiousness, resourcefulness, conceit});
    }

    @Override
    public void compareTo(Slytherin opponent) {
        int thisTotal = totalPower();
        int opponentTotal = opponent.totalPower();
        if (thisTotal == opponentTotal) System.out.println(getStudentName() + " такой же Слизеринец, как и " + opponent.getStudentName());
        if (thisTotal > opponentTotal) {
            System.out.println(getStudentName() + " лучший Слизеринец, чем " + opponent.getStudentName());
        } else {
            System.out.println(opponent.getStudentName() + " лучший Слизеринец, чем " + getStudentName());
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
                "\n\t\tХитрость:" + getSkillSet()[0] +
                "\n\t\tРешительность: " + getSkillSet()[1] +
                "\n\t\tАмбициозность: " + getSkillSet()[2] +
                "\n\t\tНаходчивость: " + getSkillSet()[3] +
                "\n\t\tЖажда власти: " + getSkillSet()[4];
    }
}
