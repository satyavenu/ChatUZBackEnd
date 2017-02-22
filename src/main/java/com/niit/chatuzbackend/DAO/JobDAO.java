package com.niit.chatuzbackend.DAO;

import java.util.List;

import com.niit.chatuzbackend.model.Job;

public interface JobDAO {
	public boolean saveOrUpdate(Job job);

	public boolean delete(Job job);

	public List<Job> list();
}
