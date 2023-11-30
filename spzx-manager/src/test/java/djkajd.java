import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;

/**
 * ClassName:djkajd
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:小飞机
 * @Create：2023/11/27 - 22:47
 * @Version: v1.0
 */
public class djkajd {
    @Test
    public void test(){
        RedisProperties.Jedis jedis = new RedisProperties.Jedis(“”, 6379);

        if(jedis.ping().equals(“PONG”)){

            System.ou.println(“连接成功”);

        } else {

            System.out.println(“连接失败”);

        }

    }
}
