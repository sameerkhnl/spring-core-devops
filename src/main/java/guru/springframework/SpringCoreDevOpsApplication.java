package guru.springframework;

import guru.springframework.bootstrap.profilesysout.MsgPropTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreDevOpsApplication implements CommandLineRunner {
	@Autowired
	private MsgPropTest msgPropTest;

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDevOpsApplication.class, args);

		//this is my own whitespace test

	}

	@Override
	public void run(String...args) throws Exception {
		System.out.println(msgPropTest);
	}
}
