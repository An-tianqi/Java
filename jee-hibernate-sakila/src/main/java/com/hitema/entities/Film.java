package com.hitema.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id", nullable = false)
    private Long id;

    private String title;

    public Film() {
    }

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Title{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append('}');
        return sb.toString();
    }
}
