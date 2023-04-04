import java.util.ArrayList;

public class ExerciseManagement {
    // markascomplete iscompleted

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();

    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String anExercise) {

        this.exercises.add(new Exercise(anExercise));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise x : exercises) {
            if (x.getName().equals(exercise)) {
                x.setCompleted(true);
            } else {
                x.setCompleted(false);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise x : exercises) {
            if (x.getName().equals(exercise) && x.isCompleted()) {
                return true;
            }
        }
        return false;

    }

}
