//package org.example;
//
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.beans.Transient;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "PROJECT_EVENT_UPDATES")
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@Getter
//public class Project {
//    @Id
//    @Column(name = "PROJECT_ID")
//    private Long id;
//
//    @Column(name = "NAME", nullable = false)
//    private String name;
//
//    @Transient
//    private List<ItemUpdate> updates = new ArrayList<>();
//
//    private Project(ProjectBuilder builder) {
//        this.id = builder.id;
//        this.name = builder.name;
//        this.updates = builder.updates;
//    }
//
//    static ProjectBuilder builder(Long id, String name) {
//        return new ProjectBuilder(id, name);
//    }
//
//    static class ProjectBuilder {
//        private final Long id;
//        private final String name;
//        private final List<ItemUpdate> updates = new ArrayList<>();
//
//        ProjectBuilder(Long id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//
//        ProjectBuilder add(ItemUpdate update) {
//            updates.add(update);
//            return this;
//        }
//
//        Project build() {
//            return new Project(this);
//        }
//    }
//}
