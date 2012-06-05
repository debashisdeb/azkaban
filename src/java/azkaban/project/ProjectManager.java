package azkaban.project;

import java.security.AccessControlException;
import java.util.List;

import azkaban.user.User;

public interface ProjectManager {
    
    public List<String> getProjectNames();
    
    public List<Project> getProjects(User user);
    
    public Project getProject(String name, User user) throws AccessControlException;
    
    public Project createProjects(String projectName, String description, User creator) throws ProjectManagerException;
    
    public Project removeProjects(String projectName, User user) throws ProjectManagerException;
}