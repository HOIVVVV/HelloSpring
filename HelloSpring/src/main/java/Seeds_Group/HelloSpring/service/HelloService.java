package Seeds_Group.HelloSpring.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HelloService {

    public String ReturnHello(ArrayList<String> name){
        String namelist = "인사를 시작합니다<br>";
        for(String n : name){
            namelist += n + "님 안녕하세요!<br>";
        }
        return namelist;
    }
}
