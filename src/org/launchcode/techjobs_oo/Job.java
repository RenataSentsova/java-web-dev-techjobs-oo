package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        int nullData = 0;
        String res = "\n";
        res += "ID: " + getId() + "\n";
        if (getName() == null || getName().equals("")) {
            res += "Name: Data not available\n";
            nullData++;
        }
        else res += "Name: " + getName() + "\n";
        if (getEmployer() == null || getEmployer().getValue().equals("")) {
            res += "Employer: Data not available\n";
            nullData++;
        }
        else res += "Employer: " + getEmployer().toString() + "\n";
        if (getLocation() == null || getLocation().getValue().equals("")) {
            res += "Location: Data not available\n";
            nullData++;
        }
        else res += "Location: " + getLocation().toString() + "\n";
        if (getPositionType() == null || getPositionType().getValue().equals("")) {
            res += "Position Type: Data not available\n";
            nullData++;
        }
        else res += "Position Type: " + getPositionType().toString() + "\n";
        if (getCoreCompetency() == null || getCoreCompetency().getValue().equals("")) {
            res += "Core Competency: Data not available\n";
            nullData++;
        }
        else res += "Core Competency: " + getCoreCompetency().toString() + "\n";
        if (nullData == 5) return "OOPS! This job does not seem to exist.";
        return res;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
