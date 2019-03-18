package cn.lzy.service;

import cn.lzy.pojo.People;
import cn.lzy.pojo.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PeopleService {

    private final PeopleMapper peopleMapper;
    @Autowired
    public PeopleService(PeopleMapper peopleMapper){
        this.peopleMapper = peopleMapper;
    }

//    public PeopleMapper getPeopleMapper() {
//        return peopleMapper;
//    }
    public List<People> selectPeople(){
        return peopleMapper.selectPeople();
    }
//    @Transactional(rollbackFor = Exception.class)
//    public void insertUser(List<People> peopleList) throws Exception {
//        for (People people : peopleList) {
//            peopleMapper.insertPeople(people);
//        }
//    }
}
