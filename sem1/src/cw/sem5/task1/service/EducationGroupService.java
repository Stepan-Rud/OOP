package cw.sem5.task1.service;

import cw.sem5.task1.model.EducationGroup;

import java.util.ArrayList;
import java.util.List;

public class EducationGroupService {
    private List<EducationGroup> group;

    public EducationGroupService() {
        this.group = new ArrayList<>();
    }

    public EducationGroup creatEducGroup(EducationGroup educGroupp) {
        educGroupp = new EducationGroup(educGroupp.getGroupNo(), educGroupp.getName(), educGroupp.getTeacher());
        return educGroupp;
    }

    public List<EducationGroup> createListEducGroup(EducationGroup educ) {
        group.add(educ);
        return group;
    }
}
