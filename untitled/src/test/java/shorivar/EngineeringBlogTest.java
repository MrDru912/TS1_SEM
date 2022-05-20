package shorivar;

import org.junit.jupiter.api.Test;

public class EngineeringBlogTest extends TestCase{
    @Test
    public void EngineeringBlogTest(){
        new  EngineeringBlog(getDriver()).doBlog();
    }
}
