package login.login.dao;

import login.login.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class studentRepository {

    private SqlSession sqlSession;

    @Autowired
    public studentRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Student findStudentByName(String name) {
        return sqlSession.selectOne("database.getStudentByName", name);
    }

}