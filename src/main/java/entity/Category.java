package entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anton Sustavov
 * @since 2019/04/30
 */
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "topic_id")
    private Set<Topic> topics = new HashSet<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
