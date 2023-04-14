package School.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
   private StudentRepo studentRepo;

    public StudentData saveDetails(StudentData studentData){
        return studentRepo.save(studentData);

    }


}
