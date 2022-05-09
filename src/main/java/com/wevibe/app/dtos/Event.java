package com.wevibe.app.dtos;

import java.time.LocalDateTime;
import java.util.List;

public class Event {

    private Integer idEvent;
    private String nameEvent;
    private Address addressEvent;
    private LocalDateTime startDateEvent;
    private LocalDateTime endDateEvent;
    private User organizer;
    private Integer limitOfParticipants;
    private List<User> members;
    private List<Tag> tags;
    private String description;

}
