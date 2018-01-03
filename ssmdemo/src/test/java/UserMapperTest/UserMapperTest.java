package UserMapperTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.mapper.UserMapper;
import com.ssm.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/ssm/mapper/UserMapper.xml"})
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void testSaveUser() {
	}

	@Test
	public void testUpdateUser() {
		
		
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUserById() {
		int id = 10;
		User user = userMapper.findUserById(id);
		System.out.println("user=" + user);
	}

	@Test
	public void testFindAll() {
		List<User> userlist = userMapper.findAll();
		for (User user : userlist) {
			System.out.println("user"+user);
		}
	}

}
