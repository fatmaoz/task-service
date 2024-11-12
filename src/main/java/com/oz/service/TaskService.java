package com.oz.service;

import com.oz.dto.TaskDTO;
import com.oz.enums.Status;

import java.util.List;
import java.util.Map;

public interface TaskService {

    TaskDTO create(TaskDTO taskDTO);

    TaskDTO readByTaskCode(String taskCode);
    List<TaskDTO> readAllTasksByProject(String projectCode);
    List<TaskDTO> readAllByStatus(Status status);
    List<TaskDTO> readAllByStatusIsNot(Status status);
    Map<String, Integer> getCountsByProject(String projectCode);
    Integer countNonCompletedByAssignedEmployee(String assignedEmployee);

    TaskDTO update(String taskCode, TaskDTO taskDTO);
    TaskDTO updateStatus(String taskCode, Status status);
    void completeByProject(String projectCode);

    void delete(String taskCode);
    void deleteByProject(String projectCode);

}
