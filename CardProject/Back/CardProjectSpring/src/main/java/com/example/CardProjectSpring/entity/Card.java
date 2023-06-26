package com.example.CardProjectSpring.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.Year;



@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class Card {

    @Id
    public int id;

    public String name;

    public String editor;

    public String edition;

    public Year release;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Year getRelease() {
        return release;
    }

    public void setRelease(Year release) {
        this.release = release;
    }

    public Card() {
    }

    public Card(String name, String editor, String edition, Year release) {
        this.name = name;
        this.editor = editor;
        this.edition = edition;
        this.release = release;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", editor='" + editor + '\'' +
                ", edition='" + edition + '\'' +
                ", release=" + release +
                '}';
    }
}
