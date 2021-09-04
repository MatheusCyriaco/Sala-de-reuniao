package com.digital.innovation.room.salareuniao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="meetingroom")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "startHour", nullable = false)
    private String startHour;

    @Column(name = "endHour", nullable = false)
    private String endHour;

    public Room(){

    }

    public Room(long id, String name, String date, String startHour, String endHour){
        this.id=id;
        this.name=name;
        this.date=date;
        this.startHour=startHour;
        this.endHour=endHour;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }
}
