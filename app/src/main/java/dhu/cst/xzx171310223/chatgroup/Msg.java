package dhu.cst.xzx171310223.chatgroup;

public class Msg {
    public static final int TYPR_RECEIVED = 0;
    public static final int TYPR_SEND = 1;
    private String content;
    private String Senduser;
    private int type;

    public Msg(String Senduser,String content) {
        this.content = content;
        this.Senduser = Senduser;
    }

    public String getContent() {
        return content;
    }

    public String getuser() {
        return Senduser;
    }
}