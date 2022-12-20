package university.schedule.core;

import java.util.Objects;

public class Teacher extends NamedEntity {
    private final String post;
    private final String academicDegree;
    private final String email;
    private final String discord;

    public Teacher(
        String name,
        String post,
        String academicDegree,
        String email
    ) {
        super(name);
        this.post = post;
        this.academicDegree = academicDegree;
        this.email = email;
        this.discord = "";
    }

    public Teacher(
        String name,
        String post,
        String academicDegree,
        String email,
        String discord
    ) {
        super(name);
        this.post = post;
        this.academicDegree = academicDegree;
        this.email = email;
        this.discord = discord;
    }

    public String getPost() {
        return post;
    }
    public String getAcademicDegree() {
        return academicDegree;
    }
    public String getEmail() {
        return email;
    }
    public String getDiscord() {
        return discord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(post, teacher.post) &&
               Objects.equals(academicDegree, teacher.academicDegree) &&
               Objects.equals(email, teacher.email) &&
               Objects.equals(discord, teacher.discord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            super.hashCode(),
            post,
            academicDegree,
            email,
            discord
        );
    }
}
