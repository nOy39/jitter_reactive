package org.a2lpo.jitter_reactive.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private boolean isDone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subtask_for_id")
    private Task subTaskFor;
}
