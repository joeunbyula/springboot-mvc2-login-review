package hello.login.web.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {
    private Long id;

    @NotEmpty
    private String loginId; //로그인ID
    @NotEmpty
    private String name; //사용자 이름
    @NotEmpty
    private String password; //비밀번호

    public Member() {
    }

    public Member(String loginId, String name, String password) {
        this.loginId = loginId;
        this.name = name;
        this.password = password;
    }
}
