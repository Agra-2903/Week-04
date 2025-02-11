package org.example.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    private List<T> candidates = new ArrayList<>();

    public void addResume(T candidate){
        candidates.add(candidate);
    }

    public List<? extends JobRole> getResumes(){
        return candidates;
    }
}
