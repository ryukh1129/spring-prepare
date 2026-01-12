package com.meta.springprepare.memo;

import lombok.*;

import java.util.Date;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private String title;
    private String contents;
    private Date createAt;
    private Date updatedAt;

    public void writeMemo() {
    }
}
