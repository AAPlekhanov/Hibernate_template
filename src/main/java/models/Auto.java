package models;

import javax.persistence.*;

@Entity
@Table(name = "autos")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model")
    private String model;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")   // колонка в таблице autos с id'шниками user'ов
    private User user;

    // необходимый конструктор по умолчанию
    public Auto() {

    }

    public Auto(String model) {
        this.model = model;
    }

    public Auto(String model, User user) {
        this.model = model;
        this.user = user;
    }

    // getters and setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
