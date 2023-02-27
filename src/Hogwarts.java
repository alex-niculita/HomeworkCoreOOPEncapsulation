public abstract class Hogwarts {

    // == Fields ==
    private final String studentName;
    private Faculties faculty;
    private int spellPower;
    private int transgressionDist;
    private int[] skillSet;

    // == Constructors ==
    public Hogwarts(String studentName, Faculties faculty, int spellPower, int transgressionDist) {
        this.studentName = studentName;
        this.faculty = faculty;
        if((spellPower>=0&&spellPower<=100)&&(transgressionDist>=0&&transgressionDist<=100)){ // validate input, if else set default
            this.spellPower = spellPower;
            this.transgressionDist = transgressionDist;
        } else {
            this.spellPower = 0;
            this.transgressionDist = 0;
        }
    }

    // == Public Methods ==
    abstract public void compareTo(Hogwarts student); // Сравнение двух учеников одного факультета по свойствам только это факультета
    abstract protected int totalPower(); // Сумма баллов по всем качествам для студента, присущих определенному факультету

    public static void compareTo(Hogwarts student1, Hogwarts student2){ // Сравнение двух любых учеников по присущим всем ученикам школы характеристикам
        int total1 = student1.getSpellPower()+student1.getTransgressionDist();
        int total2 = student2.getSpellPower()+student2.getTransgressionDist();
        if (total1 == total2) System.out.println(student1.getStudentName() + " обладает такой же мощностью магии, как и " + student2.getStudentName());
        if (total1 > total2) {
            System.out.println(student1.getStudentName() + " обладает бОльшей мощностью магии, чем " + student2.getStudentName());
        } else {
            System.out.println(student2.getStudentName() + " обладает бОльшей мощностью магии, чем " + student1.getStudentName());
        }
    }

    @Override
    public String toString() {
        return "Name: " +studentName + "\tFaculty: " + faculty +
                "\n\tSkills: " +
                "\n\t\tSpell Power: " + spellPower +
                "\n\t\tTransgression Distance: " + transgressionDist;
    }

    // == Getters and Setters ==
    public String getStudentName() {
        return studentName;
    }

    public Faculties getFaculty() {
        return faculty;
    }

    protected void setFaculty(Faculties faculty) {
        this.faculty = faculty;
    }

    public int getSpellPower() {
        return spellPower;
    }

    protected void setSpellPower(int spellPower) {
        if(spellPower>=0&&spellPower<=100){ // validate input, if else set default
            this.spellPower = spellPower;
        } else {
            this.spellPower = 0;
        }
    }

    public int getTransgressionDist() {
        return transgressionDist;
    }

    protected void setTransgressionDist(int transgressionDist) {
        if(transgressionDist>=0&&transgressionDist<=100){ // validate input, if else set default
            this.transgressionDist = transgressionDist;
        } else {
            this.transgressionDist = 0;
        }
    }

    public int[] getSkillSet() {
        return skillSet;
    }

    protected void setSkillSet(int[] skillSet) {
        this.skillSet = skillSet;
    }
}
