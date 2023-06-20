package com.hcc.entities;

import javax.persistence.*;

@Entity
@Table(name = "assignments")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "branch")
    private String branch;
    @Column(name = "code_review_video_url")
    private String reviewVideoUrl;
    @Column(name = "github_url")
    private String githubUrl;
    @Column(name = "number")
    private Integer number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "code_reviewer_id")
    private Integer codeReviewer;

    public Assignment() {
    }

    public Assignment(String branch, String reviewVideoUrl, String githubUrl,
                      Integer number, User user, Integer codeReviewer) {
        this.branch = branch;
        this.reviewVideoUrl = reviewVideoUrl;
        this.githubUrl = githubUrl;
        this.number = number;
        this.user = user;
        this.codeReviewer = codeReviewer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getReviewVideoUrl() {
        return reviewVideoUrl;
    }

    public void setReviewVideoUrl(String reviewVideoUrl) {
        this.reviewVideoUrl = reviewVideoUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public User getUserId() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }

    public Integer getCodeReviewer() {
        return codeReviewer;
    }

    public void setCodeReviewer(Integer codeReviewer) {
        this.codeReviewer = codeReviewer;
    }
}
