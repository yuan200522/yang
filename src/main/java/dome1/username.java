package dome1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class username {
    private String name;
    private String password;
@RequestMapping("/user")
public String user(@RequestParam(name="name",required = false) String username,String password){
    System.out.println("name:"+name+",password:"+password);
    return "OK";
}
@RequestMapping("/username")
public String text(username user){
    System.out.println(user);
    return "OK";
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "username{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

