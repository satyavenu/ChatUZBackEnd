package com.niit.chatuzbackend.DAO;

import java.util.List;

import com.niit.chatuzbackend.model.ForumComment;

public interface ForumCommentDAO {
	public boolean saveOrUpdate(ForumComment forumcomment);

	public boolean delete(ForumComment forumcomment);

	public List<ForumComment> list(int fid);
}