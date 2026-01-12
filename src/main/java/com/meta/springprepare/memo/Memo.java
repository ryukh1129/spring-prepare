package com.meta.springprepare.memo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Memo {
    private String username;
    private String title;
    private String contents;
    private Date createAt;
    private Date updatedAt;

    public void writeMemo() {

    }
}
