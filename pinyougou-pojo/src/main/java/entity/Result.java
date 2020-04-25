package entity;

import java.io.Serializable;

/**
 *
 * 结果实体类
 */
public class Result implements Serializable {
    private Boolean success;
    private String massage;

    public Result(Boolean success, String massage) {
        this.success = success;
        this.massage = massage;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
