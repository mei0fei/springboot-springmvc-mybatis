package com.example.mapper;

import java.util.List;

import com.example.model.Post;

public interface PostMapper {
	List<Post> findPostsByBlogId(int post_id);
	Post findPostById(int id);
	void insertPost(Post post);
	void deletePost(int id);

}
