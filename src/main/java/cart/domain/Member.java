package cart.domain;

public class Member {

    private final Long id;
    private final String email;

    public Member(final Long id, final String email) {
        this.id = id;
        this.email = email;
    }

    public boolean isIdEquals(final long id) {
        return this.id == id;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
