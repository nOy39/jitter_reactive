package org.a2lpo.jitter_reactive.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private boolean isDone;

    private LocalDateTime created;
    private LocalDateTime deadline;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subtask_for_id")
    private Task subTaskFor;

    @ManyToMany
    @JoinTable(name = "task_category",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;
}
