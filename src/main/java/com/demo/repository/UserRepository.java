package com.demo.repository;
import org.springframework.data.repository.CrudRepository;
import com.demo.model.UserRecord;
public interface UserRepository extends CrudRepository<UserRecord, String>
{
    UserRecord findById(int id);
}
