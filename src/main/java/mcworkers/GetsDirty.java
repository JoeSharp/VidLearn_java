package mcworkers;

class GetsDirty {
    private boolean isDirty = false;

    void clean() {
        isDirty = false;
    }

    void use() {
        isDirty = true;
    }
}
