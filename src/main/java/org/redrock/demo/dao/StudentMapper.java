package org.redrock.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.redrock.demo.po.Student;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentMapper {

    String findStuById (Integer id);

    Integer findStuByName (String name);

    boolean  insertStudent(Student student);

    boolean deleteStudent(Integer id);

    boolean updateStudent(Student student);
}
