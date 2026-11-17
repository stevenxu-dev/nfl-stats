package dev.stevenxu.nflstats.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "team")
public class Team {
    @Id
    @Column(length = 3)
    private String abbreviation;

    @Column(nullable = false)
    private String name;

    public enum Conference {
        AFC,
        NFC
    };
    public enum Division{
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Conference conference;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Division division;

    protected Team(){ }

    public Team(String abbreviation, String name, Conference conference, Division division){
        this.abbreviation = abbreviation;
        this.name = name;
        this.conference = conference;
        this.division = division;
    }

    public String getName(){
        return this.name;
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }

    public Conference getConference(){
        return this.conference;
    }

    public Division getDivision(){
        return this.division;
    }

}
