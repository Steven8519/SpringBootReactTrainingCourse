package com.practice.springbootandreactcourse.service;

import com.practice.springbootandreactcourse.domain.Project;
import com.practice.springbootandreactcourse.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        return projectRepository.save(project);
    }
}
