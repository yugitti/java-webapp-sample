package jp.ne.tsukiyo.tasklist;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeRestController {

    record TaskItem(String id, String task, String deadline, boolean done){};
    private List<TaskItem> taskItems = new ArrayList<>();


//    @RequestMapping(value="/resthello")
    @RequestMapping("resthello")
    String hello(){
        return """
                Hello
                It works!
                現在の時刻は %s です。
                """.formatted(LocalDateTime.now());
    }
}
