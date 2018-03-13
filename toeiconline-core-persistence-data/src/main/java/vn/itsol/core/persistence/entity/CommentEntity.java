package vn.itsol.core.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="comments")

public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "content")
    private String content;

    @Column(name = "createddadte")
    private Timestamp createdDate;

    @ManyToOne
    @JoinColumn(name="userid")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name="listenguidelineid")
    private ListenGuideLineEntity listenGuideLine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ListenGuideLineEntity getListenGuideLine() {
        return listenGuideLine;
    }

    public void setListenGuideLine(ListenGuideLineEntity listenGuideLine) {
        this.listenGuideLine = listenGuideLine;
    }
}
