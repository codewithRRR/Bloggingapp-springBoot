package com.example.demo.comments;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;

import com.example.demo.articles.ArticleEntity;
import com.example.demo.users.UserEntity;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Setter
public class CommenEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Nullable
	private String title;

	@NonNull
	private String body;

	@CreatedDate
	private Date creatDate;

	@ManyToOne
	@JoinColumn(name = "articleId", nullable = false)
	private ArticleEntity article;

	@ManyToOne
	@JoinColumn(name = "authorId", nullable = false)
	private UserEntity author;

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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}

	public ArticleEntity getArticle() {
		return article;
	}

	public void setArticle(ArticleEntity article) {
		this.article = article;
	}

	public UserEntity getAuthor() {
		return author;
	}

	public void setAuthor(UserEntity author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "CommenEntity [id=" + id + ", title=" + title + ", body=" + body + ", creatDate=" + creatDate
				+ ", article=" + article + ", author=" + author + "]";
	}

}
