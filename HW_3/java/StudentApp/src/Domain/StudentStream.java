package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> groups;
    private int streamNumber; // Номер потока

    public StudentStream(int streamNumber) {
        this.groups = new ArrayList<>();
        this.streamNumber = streamNumber;
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}
