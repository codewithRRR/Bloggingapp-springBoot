package com.example.demo.articles;

import org.springframework.data.annotation.CreatedDate;

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
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
@ToString
public class ArticleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@NonNull
	private String title;

	@NonNull
	@Column(unique = true)
	private String slug;
	@Nullable
	private String subTitile;
	@NonNull
	private String body;

	@CreatedDate
	private String createdAt;

	@ManyToOne
	@JoinColumn(name = "authorId")
	private UserEntity author;

	public UserEntity getAuthor() {
		return author;
	}

	public void setAuthor(UserEntity author) {
		this.author = author;
	}

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

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getSubTitile() {
		return subTitile;
	}

	public void setSubTitile(String subTitile) {
		this.subTitile = subTitile;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "ArticleEntity [id=" + id + ", title=" + title + ", slug=" + slug + ", subTitile=" + subTitile
				+ ", body=" + body + ", createdAt=" + createdAt + ", author=" + author + "]";
	}

}
