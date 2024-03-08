package Seeds_Group.HelloSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	@GetMapping(value = "/")
	public String doGetHelloWorld() {
		return "안녕하세요 저는 세종대학교 컴퓨터공학과 박준영입니다.<br>" +
				" 저는 Seeds 2단계 스터디를 진행중입니다.";
	}

}


