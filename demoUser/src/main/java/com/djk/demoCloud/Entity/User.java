package com.djk.demoCloud.Entity;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collation = "User")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

//    private Integer uId;

    private String username;

    private String userPwd;

}
