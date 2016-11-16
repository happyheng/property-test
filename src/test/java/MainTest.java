import com.happyheng.entity.People;
import com.happyheng.entity.SpELPeople;
import com.happyheng.entity.ValuePeople;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * Created by happyheng on 16/11/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = MainConfig.class)
@ContextConfiguration("classpath*:/applicationContext.xml")
public class MainTest {

    @Autowired
    People people;

    @Autowired
    ValuePeople valuePeople;

    @Autowired
    SpELPeople spELPeople;

    @Test
    public void testEnvironment() {
        System.out.println("people的name为" + people.getName() + "---age为" + people.getAge());
    }

    @Test
    public void testValue() {
        System.out.println("valuePeople的name为" + valuePeople.getName() + "---age为" + valuePeople.getAge());
    }

    @Test
    public void testSpEL() {
        System.out.println("spELPeople的name为" + spELPeople.getName() + "---age为" + spELPeople.getAge());
        System.out.println("spELPeople的valuePeopleName为" + spELPeople.getValuePeopleName());
        System.out.println("spELPeople的valuePeopleToString为" + spELPeople.getValuePeopleToString());
    }
}
