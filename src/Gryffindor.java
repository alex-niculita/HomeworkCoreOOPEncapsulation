import java.util.Arrays;
import java.util.SortedMap;

public class Gryffindor extends Hogwarts{
    public Gryffindor(String studentName, int spellPower, int transgressionDist, int nobility, int honor, int courage) {
        super(studentName, Faculties.GRYFFINDOR, spellPower, transgressionDist);
        this.setSkillSet(new int[]{nobility, honor, courage});
    }

    @Override
    public void compareTo(Hogwarts opponent) {
        if (opponent.getFaculty()!=Faculties.GRYFFINDOR){
            System.out.println("Please compare students within the same faculty");
            return;
        }
        int thisTotal = totalPower();
        int opponentTotal = opponent.totalPower();
        if (thisTotal == opponentTotal) System.out.println(getStudentName() + " такой же Гриффиндорец, как и " + opponent.getStudentName());
        if (thisTotal > opponentTotal) {
            System.out.println(getStudentName() + " лучший Гриффиндорец, чем " + opponent.getStudentName());
        } else {
            System.out.println(opponent.getStudentName() + " лучший Гриффиндорец, чем " + getStudentName());
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
                "\n\t\tБлагородство : " + getSkillSet()[0] +
                "\n\t\tЧесть: " + getSkillSet()[1] +
                "\n\t\tХрабрость: " + getSkillSet()[2];
    }
}
