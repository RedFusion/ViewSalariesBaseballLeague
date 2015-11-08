package ru.menkin.models;

import java.util.*;

/**
 * @author Menkin
 * POJO Model
 */
public class Player {
    private int id;
    private String team;
    private String name;
    private String salary;
    private String position;
    private Team team_id;

    public Player() {}

    public Player(final int id, final String team, final String name, final String salary, final String position) {
        this.id = id;
        this.team = team;
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Team team_id) {
        this.team_id = team_id;
    }
}