package cn.tianzy.springcloud.eurekaclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication2.class, args);
	}

	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		System.out.println(port);
		return "hi "+name+",i am from port:" +port;
	}
}
